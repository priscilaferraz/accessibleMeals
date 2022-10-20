package br.com.fiap.accessiblemealapi.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.com.fiap.accessiblemealapi.model.Cliente;
import br.com.fiap.accessiblemealapi.model.Restaurante;
import br.com.fiap.accessiblemealapi.repository.ClienteRepository;
import br.com.fiap.accessiblemealapi.repository.RestauranteRepository;

@Configuration
public class DatabaseSeed implements CommandLineRunner {

    @Autowired
    ClienteRepository clienteRepository;

    @Autowired
    RestauranteRepository restauranteRepository;

    @Override
    public void run(String... args) throws Exception {

        clienteRepository.save( 
            new Cliente(
                "Alfonso Matsuoka",
                "rm87336@fiap.com.br",
                "41540600823",
                "Rua Ararapira, 146",
                false,
                "123"
            )
        ); 
        
        clienteRepository.save( 
            new Cliente(
                "Amanda Silva",
                "admin@fiap.com.br",
                "456.098.654-80",
                "Av Cantareira, 1010",
                false,
                "123"
            )
        ); 

        clienteRepository.save( 
            new Cliente(
                "Marcos Silva",
                "marcos@fiap.com.br",
                "12345678909",
                "Av Jabaquara, 1900",
                true,
                "[\"auditiva\"]",
                "123"
            )
        ); 

        restauranteRepository.saveAll(List.of(
            new Restaurante(
                "Meals Ltda",
                "meals@gmail.com",
                "17.987.765/0001-32",
                "Rua Horace Clark, 45",
                "Deficiência visual",
                4.5,
                1L
            ),
            new Restaurante(
                "Cantareira Ltda",
                "cantareira@gmail.com",
                "10.876.456/0002-23",
                "Rua Orlando de Morais, 1010",
                "Deficiência mental",
                3.4,
                1L
            ),
            new Restaurante(
                "Food True",
                "food@gmail.com",
                "54.098.654/0001-67",
                "Av Nazaréh, 2456",
                "Deficiência motora",
                5.0,
                2L
            ),
            new Restaurante(
                "Saborosos Pratos Ltda",
                "saborosos@gmail.com",
                "87.543.765/0001-43",
                "Av Santos Silva, 81",
                "Deficiência auditiva",
                3.2,
                3L
            )
        )); 
    }
    
}
