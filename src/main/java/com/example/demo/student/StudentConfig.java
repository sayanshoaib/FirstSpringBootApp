package com.example.demo.student;

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
            Student shoaib = new Student(
                    "Shoaib",
                    "Shoaib@gmail.com",
                    LocalDate.of(2001, Month.JUNE, 18)
            );

            Student nur = new Student(
                    "Nur",
                    "Nur@gmail.com",
                    LocalDate.of(2011, Month.SEPTEMBER, 28)
            );

            Student sayem = new Student(
                    "Sayem",
                    "Sayem@gmail.com",
                    LocalDate.of(1992, Month.AUGUST, 12)
            );

            Student sourav = new Student(
                    "Sourav",
                    "Sourav@gmail.com",
                    LocalDate.of(1996, Month.OCTOBER, 10)
            );

            repository.saveAll(
                    List.of(shoaib, nur, sayem, sourav)
            );

        };
    }
}
