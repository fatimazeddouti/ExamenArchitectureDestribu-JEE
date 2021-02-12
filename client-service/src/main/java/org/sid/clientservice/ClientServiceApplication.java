package org.sid.clientservice;

import org.sid.clientservice.Repository.ClientRepository;
import org.sid.clientservice.entities.Client;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class ClientServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientServiceApplication.class, args); }


        @Bean
        CommandLineRunner start(ClientRepository clientRepository, RepositoryRestConfiguration restConfiguration){
            restConfiguration.exposeIdsFor(Client.class);
            return args -> {
                clientRepository.save(new Client(null,"mouad","med@gmail.com"));
                clientRepository.save(new Client(null,"Yassine","yassine@gmail.com"));
                clientRepository.save(new Client(null,"Salima","salima@gmail.com"));
                clientRepository.findAll().forEach(c->{
                    System.out.println(c.toString());
                });
            };

    }

}
