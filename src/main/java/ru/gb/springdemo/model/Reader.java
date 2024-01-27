package ru.gb.springdemo.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "readers")
@Data
@RequiredArgsConstructor
public class Reader {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private  Long id;
  private  String name;

  public Reader(Long id, String name) {
    this.id = id;
    this.name = name;
  }

  public Reader(String name) {
    this.name = name;
  }
}
