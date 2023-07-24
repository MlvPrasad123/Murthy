package com.DAO.config;

//import java.sql.DriverManager;

import javax.activation.DataSource;
import javax.activation.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.DAO.ImpDAO;

@Configuration
public class Appconfig 
{
	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		datasource.setDriverClassName("com.mysql.jdbc.Driver");
		datasource.setUrl("jdbc:mysql://localhost:3306/project");
		datasource.setUsername("root");
		datasource.setPassword("root");

		return (DataSource) datasource;
	}
	
	@Bean(name="DAOBean")
	public ImpDAO AppDAO(){
		return new ImpDAO((DataSource) getDataSource());
	}
}



