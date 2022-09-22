package br.edu.fafic.ppi.clinica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class ClinicaBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClinicaBackendApplication.class, args);
	}

}
