package com.example.demo.student;

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
    CommandLineRunner commandLineRunner( StudentRepository repository){
        return args -> {
                    Student Luis = new Student(1L,"Luis","luismonteiro@gmail.com", LocalDate.of(1999, Month.MARCH, 3));
            Student Jana = new Student(2L,"Jana","jana@gmail.com", LocalDate.of(2001, Month.MARCH, 30));
            Student Beatriz = new Student(3L,"Beatriz","beatriz@gmail.com", LocalDate.of(2005, Month.JANUARY, 22));
            Student Juliana = new Student(4L,"Juliana","juliana@gmail.com", LocalDate.of(2001, Month.MAY, 12));
            Student Julio = new Student(5L,"Julio","julio@gmail.com", LocalDate.of(2002, Month.JANUARY, 11));
            Student Pedro = new Student(6L,"Pedro","pedro@gmail.com", LocalDate.of(2003, Month.JANUARY, 24));
            Student Pietra = new Student(7L,"Pietra","pietra@gmail.com", LocalDate.of(2008, Month.JANUARY, 26));
            Student Carlos = new Student(8L,"Carlos","carlos@gmail.com", LocalDate.of(2005, Month.JANUARY, 2));

            repository.saveAll(List.of(Luis, Jana, Beatriz, Juliana, Julio, Pedro, Pietra, Carlos));

        };

    }
}
