package com.gaurav.config;

import java.beans.PropertyVetoException;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@ComponentScan("com")
@EnableWebMvc
public class AppConfig  extends WebMvcConfigurerAdapter {
	
	protected final Logger logger = LoggerFactory.getLogger("AppConfig");
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	@Bean(name = "dataSource")
	public DataSource dataSource() {
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		try {
			dataSource.setDriverClass("net.sourceforge.jtds.jdbc.Driver");
		} catch (PropertyVetoException e) {
			logger.error("Error while creating dataSource " + e.getMessage());
		}
	    dataSource.setJdbcUrl("jdbc:jtds:postgresql://localhost:5432/Company");
	    dataSource.setUser("postgres");
	    dataSource.setPassword("postgres");
	    dataSource.setInitialPoolSize(3);
	    return dataSource;
	}
	
}
