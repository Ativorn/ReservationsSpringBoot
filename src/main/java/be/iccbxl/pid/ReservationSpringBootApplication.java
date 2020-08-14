package be.iccbxl.pid;

import be.iccbxl.pid.service.StorageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ReservationSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReservationSpringBootApplication.class, args);
	}


    // Initialiser tous les services de storages (créer les dossier ou on va stocké les images )
    @Bean
    CommandLineRunner init(ApplicationContext applicationContext) {
        return (args) -> {
            applicationContext.getBeansOfType(StorageService.class)
                    .forEach((k, v) -> v.init());
        };
    }
}
