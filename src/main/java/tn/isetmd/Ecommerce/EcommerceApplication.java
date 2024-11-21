package tn.isetmd.Ecommerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tn.isetmd.Ecommerce.dao.entities.Client;
import tn.isetmd.Ecommerce.dao.repositories.ClientRepository;

@SpringBootApplication
public class EcommerceApplication implements CommandLineRunner {
	@Autowired
	ClientRepository clientRepository;

	public static void main(String[] args) {
		SpringApplication.run(EcommerceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Client client = new Client(null, "Tahani", "Zeidi", "2222", "tahani@gmail.com", "123", "A123", null);
		clientRepository.save(client);
		Client client1 = new Client(null, "Tahani", "Zeidi", "2222", "tahani@gmail.com", "123", "A123", null);


		Client client2 = new Client(null, "Tahani", "Zeidi", "2222", "tahani@gmail.com", "123", "A123", null);
		clientRepository.save(client1);
		clientRepository.save(client2);

	}
}