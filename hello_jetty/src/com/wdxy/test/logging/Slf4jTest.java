package com.wdxy.test.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Slf4jTest {

	private static Logger logger = LoggerFactory.getLogger(Slf4jTest.class);
	public static void main(String[] args) {
		
		logger.info("begin time : "+System.currentTimeMillis());
		for(int i=0;i<1000;i++){
			//doing something
		}
		//System.out.println(i);
		logger.info("end time : "+System.currentTimeMillis());
	}
}
