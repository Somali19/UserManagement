package com.cts;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.log4j.Log4j2;

@Log4j2
@SpringBootApplication
public class UserManagementApplication implements ApplicationRunner{
	 //private static final Logger log = LogManager.getLogger(UserManagementApplication.class);
	public static void main(String[] args) {
	      //logger.info("User management application started");
		SpringApplication.run(UserManagementApplication.class, args);
	}


	@Override
	public void run(ApplicationArguments args) throws Exception {
        log.debug("Debugging log");
        log.info("Info log");
        log.warn("Hey, This is a warning!");
        log.error("Oops! We have an Error. OK");
        log.fatal("Damn! Fatal error. Please fix me.");
		
	}

}
