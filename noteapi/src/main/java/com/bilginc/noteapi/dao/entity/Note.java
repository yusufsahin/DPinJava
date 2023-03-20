package com.bilginc.noteapi.dao.entity;


import lombok.*;

import javax.persistence.*;


@SuppressWarnings("serial")
@Entity
@Builder
@Table(name = "notes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id",nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private  String description;
}
