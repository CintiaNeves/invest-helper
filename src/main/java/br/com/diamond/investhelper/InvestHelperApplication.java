package br.com.diamond.investhelper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class InvestHelperApplication {

	public static void main(String[] args) {
		SpringApplication.run(InvestHelperApplication.class, args);
	}

}
