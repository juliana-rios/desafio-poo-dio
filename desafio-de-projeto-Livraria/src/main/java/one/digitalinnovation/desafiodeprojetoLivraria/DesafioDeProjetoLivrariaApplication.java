package one.digitalinnovation.desafiodeprojetoLivraria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class DesafioDeProjetoLivrariaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioDeProjetoLivrariaApplication.class, args);
	}

}
