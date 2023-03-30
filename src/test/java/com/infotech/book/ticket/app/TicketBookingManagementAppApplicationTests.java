package com.infotech.book.ticket.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TicketBookingManagementAppApplicationTests {

	public static Logger logger=LoggerFactory.getLogger(TicketBookingManagementAppApplicationTests.class);
	@Test
	public void contextLoads() {
		logger.info("test case executing");
		assertEquals(true,true);
	}

}
