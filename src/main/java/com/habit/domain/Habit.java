package com.habit.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Habit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime date;

    @Column(nullable = false)
    private LocalDateTime registrationDateTime;

    @Column(nullable = false)
    private LocalDateTime modificationDateTime;

    @ManyToOne
    @JoinColumn(name="loginId", referencedColumnName = "id")
    private Login login;

    private String description;

    private char completeYn;

    private char deleteYn;
}
