package com.habit.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Label {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDateTime registrationDateTime;

    @Column(nullable = false)
    private LocalDateTime modificationDateTime;

    private char deleteYn;

    @OneToMany(mappedBy = "habit")
    List<Habit> habitList = new ArrayList<>();

}


