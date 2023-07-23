package com.in28minutes.In28Minutes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.in28minutes.In28Minutes.dao.PersonDAO;

@SpringBootApplication
public class SpringScopeApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringScopeApplication.class);

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringScopeApplication.class)) {

			PersonDAO personDao = context.getBean(PersonDAO.class);
			PersonDAO personDao2 = context.getBean(PersonDAO.class);

			LOGGER.info("{}", personDao);
			LOGGER.info("{}", personDao.getJdbcConnection());

			LOGGER.info("{}", personDao2);
			LOGGER.info("{}", personDao2.getJdbcConnection());

		} catch (Exception e) {

		}
	}

}
