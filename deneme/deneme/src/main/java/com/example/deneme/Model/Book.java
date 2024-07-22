package com.example.deneme.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity(name = "book")
@Data
public class Book {
    @Id
    private Long id;
    private String name;

    @ManyToOne
    @JoinColumn(name="student_id",referencedColumnName = "id")
    private Student student;
}
