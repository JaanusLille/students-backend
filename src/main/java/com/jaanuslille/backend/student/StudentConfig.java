package com.jaanuslille.backend.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
//            Student Maria = new Student(
//                    1L,
//                    "Maria",
//                    "maria.kuusik@gmail.com",
//                    LocalDate.of(2000, Month.JANUARY, 5)
//            );
//            Student Alexis = new Student(
//                    "Alexis",
//                    "alexis.castle@gmail.com",
//                    LocalDate.of(2004, Month.JANUARY, 5)
//            );

//            repository.saveAll(
//                    List.of(Maria, Alexis)
//            );
        };
    }
}
