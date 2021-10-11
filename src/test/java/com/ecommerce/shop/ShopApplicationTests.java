package com.ecommerce.shop;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Slf4j
class ShopApplicationTests {

	@Autowired
	DataSource dataSource;

	@Value("${test-name}")
	private String name;
	@Value("${test-year}")
	private String currentYear;

	@Test
	void printValues(){
		assertThat(name).isEqualTo("Jack");
		assertThat(currentYear).isEqualTo("2021");
		log.info("Test name -> {}", name);
		log.info("Test name -> {}", currentYear);
	}

	@Test
	public void connectToDatabaseTest(){
		assertThat(dataSource).isNotNull();
		log.info("Datasource properties --> {}", dataSource);

		String url = "jdbc:mysql://:localhost:3306/";
		String username = "shop_user";
		String password = "shop123";

		try{
			Connection connection = dataSource.getConnection();
			assertThat(connection).isNotNull();
		}catch (SQLException exception){
			log.info("An exception occured --> {}", exception.getMessage());

		}

	}


}
