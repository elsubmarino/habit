package com.habit.domain;

import com.sun.istack.NotNull;
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


    @Column(nullable = false)
    private LocalDateTime registrationDateTime;

    @Column(nullable = false)
    private LocalDateTime modificationDateTime;

    @Column(nullable = false)
    private String title;

    @ManyToOne
    @JoinColumn(name="loginId", referencedColumnName = "id")
    private Login loginId;

    @Column(nullable = false)
    private char deleteYn;
}
