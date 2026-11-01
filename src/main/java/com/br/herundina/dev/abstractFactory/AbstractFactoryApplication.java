package com.br.herundina.dev.abstractFactory;

import com.br.herundina.dev.abstractFactory.Fabricas.FabricaDeProdutoSalgado;
import com.br.herundina.dev.abstractFactory.abstractFactory.AbstractFactory;
import com.br.herundina.dev.abstractFactory.application.Application;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Scanner;
@Slf4j
@SpringBootApplication
public class AbstractFactoryApplication {

    private static Application configurationApplication() throws IllegalArgumentException {
        log.info("Padaria Francesa - Criando seu combo de produtos!");

        AbstractFactory factory;
        Application app;

        Scanner scanner = new Scanner(System.in);
        log.info("Escolha o sabor do seu combo (1 - Salgada): ");
        int saborCombo = scanner.nextInt();

        if(saborCombo == 1){
            factory = new FabricaDeProdutoSalgado();
            app = new Application(factory);
            log.info("Sabor escolhido: Saldado" );
            return app;
        }else {
           throw new IllegalArgumentException("Escolha Salgado, pois é o único sabor fabricado!");
        }
    }

	public static void main(String[] args) {
		SpringApplication.run(AbstractFactoryApplication.class, args);
	}

    @Bean
    public CommandLineRunner run() {
        return args -> {

            try {
                Application app = configurationApplication();
                app.imprimirProdutos();
            }catch(IllegalArgumentException e){
               log.info(e.getMessage() );
               Application app = configurationApplication();
               app.imprimirProdutos();
            }finally {
                log.info("Finalizamos seu Pedido, Obrigado por comprar conosco!");
                log.info("Volte Sempre!");
            }
        };
    }


}
