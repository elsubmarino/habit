package com.habit.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Folder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private LocalDateTime registrationDateTime;

    private LocalDateTime modificationDateTime;

    private String title;

    @ManyToOne
    @JoinColumn(name="loginId", referencedColumnName = "id")
    private Login loginId;

    private char deleteYn;
}
