package com.habit.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Label {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    @JsonFormat
    private LocalDateTime registrationDateTime;

    @Column(nullable = false)
    @JsonFormat
    private LocalDateTime modificationDateTime;

    @ManyToOne
    @JoinColumn(name = "loginId",referencedColumnName = "id")
    private Habit habit;
}
