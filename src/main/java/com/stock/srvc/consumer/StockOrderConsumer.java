package com.stock.srvc.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.orders.srvc.dto.Order;
import com.stock.srvc.service.StockManageService;

@Service
public class StockOrderConsumer {

	private static final Logger LOG = LoggerFactory.getLogger(StockOrderConsumer.class);

	@Autowired
	private StockManageService stockManageService;

	@KafkaListener(id = "orders", topics = "orders-topic", groupId = "stock")
	public void onEvent(Order o) {
		LOG.info("Received: {}", o);
		if (o.getStatus().equals("NEW")) {
			stockManageService.reserve(o);
		} else if (o.getStatus().equals("CONFIRMED")) {
			stockManageService.confirm(o);

		}
	}

}
