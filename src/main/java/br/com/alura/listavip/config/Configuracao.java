/**
 * 
 */
package br.com.alura.listavip.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Ramon Vieira
 *
 */

@SpringBootApplication
@Controller
public class Configuracao {

	
	@RequestMapping("/")
	@ResponseBody
	public String ola(){
		return "<h1><center>Olá, bem vindo ao sistema Lista VIP's</center></h1>";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Configuracao.class, args);
	}
	
}
