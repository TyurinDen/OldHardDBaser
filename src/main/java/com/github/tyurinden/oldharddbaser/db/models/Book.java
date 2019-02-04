package com.github.tyurinden.oldharddbaser.db.models;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name = "BOOKS")
@Getter
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false, unique = true)
    private String title;

    @Column(nullable = false)
    private String author;

}
