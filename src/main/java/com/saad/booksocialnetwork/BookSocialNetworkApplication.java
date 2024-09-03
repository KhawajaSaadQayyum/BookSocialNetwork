package com.saad.booksocialnetwork;

import com.saad.booksocialnetwork.role.Role;
import com.saad.booksocialnetwork.role.RoleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableJpaAuditing
@EnableAsync
public class BookSocialNetworkApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookSocialNetworkApplication.class, args);
        System.out.println("Keep Learning and Keep Shining");
    }
    @Bean
    public CommandLineRunner runner(RoleRepository roleRepository) {
        return args -> {
            if (roleRepository.findByName("USER").isEmpty()) {
                roleRepository.save(Role.builder().name("USER").build());
            }
        };
    }

}
