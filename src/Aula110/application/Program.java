package Aula110.application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Program {
    public static void main(String[] args) {

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();
        LocalDate d04 = LocalDate.parse("2023-02-25");
        LocalDateTime d05 = LocalDateTime.parse("2023-02-25T01:30:20");

        System.out.println("d01 = " + d01);
        System.out.println("d02 = " + d02 );
        System.out.println("d03 = " + d03);
        System.out.println("d04 = " + d04);
        System.out.println("d05 = " + d05);
    }
}
