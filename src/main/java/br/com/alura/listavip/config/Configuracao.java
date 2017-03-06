package br.com.alura.listavip.config;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import br.com.alura.listavip.controller.ConvidadoController;

/**
 * @author Ramon Vieira
 *
 */

@ComponentScan(basePackageClasses={ConvidadoController.class})
@EntityScan("br.com.alura.listavip.model")
@EnableJpaRepositories("br.com.alura.listavip.repository")
@SpringBootApplication
public class Configuracao {
	
	public static void main(String[] args) {
		SpringApplication.run(Configuracao.class, args);
	}
	
	@Bean
	public DataSource dataSource(){
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource(); 
		
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/listavip");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		
		return dataSource;
	}
	
}
