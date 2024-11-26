package com.simon.employee_mgt_system.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
public class Attendance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate date;
    private boolean isPresent;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

}

