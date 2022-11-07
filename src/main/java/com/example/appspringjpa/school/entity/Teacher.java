package com.example.appspringjpa.school.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String fio;

    @Column(unique = true,nullable = false)
    private String phoneNumber;

    private String mailAddress;

    @ManyToMany
    private Set<Subject> subjects;

    @ManyToOne
    private School school;

    @ManyToOne
    private Group group;
}
