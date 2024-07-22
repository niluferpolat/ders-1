package com.example.deneme.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import java.util.List;

@Entity
@Table(name="person")
@Data
public class Student {
    @Id
    private Long id;

    private String name;
    private int age;
    @OneToMany(mappedBy = "student")
    @JsonBackReference
    List<Book> books;

}
