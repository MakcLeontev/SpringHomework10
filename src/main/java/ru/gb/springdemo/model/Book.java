package ru.gb.springdemo.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "books")
@Data
@Schema(name = "Книга")
public class Book {

  //public static long sequence = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Schema(name = "Идентификатор")
  private Long id;
  @Schema(name = "Имя")
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
