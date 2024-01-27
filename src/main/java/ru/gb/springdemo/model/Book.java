package ru.gb.springdemo.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "books")
@Data
public class Book {

  //public static long sequence = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;

    public Book(String name) {
        this.name = name;
    }

    public Book(Long id, String name) {
    this.id = id;
    this.name = name;
  }

    public Book() {
    }



  //  public Book(String name) {
//    this(sequence++, name);
//  }

}
