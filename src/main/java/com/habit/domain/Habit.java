package com.habit.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
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
    @JsonFormat
    private LocalDateTime registrationDateTime;

    @Column(nullable = false)
    @JsonFormat
    private LocalDateTime modificationDateTime;

    @ManyToOne
    @JoinColumn(name="loginId", referencedColumnName = "id")
    private Login login;

    private String description;

    private char completeYn;

    private char deleteYn;
}
