package com.bookstore.config;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.sql.DriverManager;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@PropertySource("classpath:db.properties")
@Configuration
@EnableAspectJAutoProxy
@EnableTransactionManagement
public class DbConfig {
	@Value("${jdbc.url}")
	private String url;

	@Value("${jdbc.username}")
	private String password;

	@Value("${jdbc.password}")
	private String username;

	@Value("${jdbc.driverName}")
	private String driverClassName;

	@Bean(autowire = Autowire.BY_TYPE)
	public JdbcTemplate getJdbcTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		//jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
	}
	
	@Bean
	public DriverManagerDataSource getDriverManager() {
		System.out.println("-----------");
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUrl(url);
		dataSource.setUsername(username);
		dataSource.setPassword(password);
		dataSource.setDriverClassName(driverClassName);
		return dataSource;
	}
}
