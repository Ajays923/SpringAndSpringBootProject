package com.nt.config;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages =  {"com.nt.repo.promotions"},
														entityManagerFactoryRef = "mysqlEMF",
														transactionManagerRef = "MysqlTxnMgmr")	
public class MysqlDBConfig {

	@Bean
	@ConfigurationProperties(prefix = "mysql.datasource")
	public DataSource createMysqlDS() {
		return DataSourceBuilder.create().build();
	}
	
	@Bean(name= "mysqlEMF")
	public LocalContainerEntityManagerFactoryBean 
							createMySQLEntityManagerFactoryBean(EntityManagerFactoryBuilder builder) {
		// create Map object having hibernate properties
		Map<String, Object> props = new HashMap<>();
		props.put("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
		props.put("hibernate.hbm2ddl.auto", "update");
		// create and return 	LocalContainerEntityManagerFacotryBean object which makes
		//EntityManagerFactory as the spring bean
		return builder.dataSource(createMysqlDS())    // datasource
					.packages("com.nt.model.promotions")		// model class obj
					.properties(props)	// hibernate properties
					.build();
	}
	
	@Bean(name = "MysqlTxnMgmr")
	public PlatformTransactionManager 
										createOracleTxnMgmr(@Qualifier("mysqlEMF")
																							EntityManagerFactory factory) {
		return new JpaTransactionManager(factory);
	}
	
		
}
