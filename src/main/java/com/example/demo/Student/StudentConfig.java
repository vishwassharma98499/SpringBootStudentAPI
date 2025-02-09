package com.example.demo.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.JANUARY;


@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student maria = new Student(
                    "maria",
                    "jones",
                    "maria@mail.com",
                    LocalDate.of(2004, JANUARY,5)
            );
            Student aleks = new Student(
                    "aleks",
                    "jones",
                    "aleks@mail.com",
                    LocalDate.of(2006, JANUARY,5)
            );

            studentRepository.saveAll(
                    List.of(maria,aleks)
            );
          };
        }
}
