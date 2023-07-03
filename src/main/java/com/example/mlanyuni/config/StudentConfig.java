package com.example.mlanyuni.config;

import com.example.mlanyuni.Repository.StudentRepository;
import com.example.mlanyuni.Student;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
           Student miriam =  new Student(
                    "Brian Cheruiyot",
                    "brian@gmail.com",
                    LocalDate.of(2000, Month.APRIL,17)
            );
           Student Alex = new Student(
                   "Maxwel rono",
                   "maxmorse@gmail.com",
                   LocalDate.of(1999,Month.APRIL,12)
           );
           studentRepository.saveAll(
                   List.of(miriam,Alex)
           );
        };

    }
}
