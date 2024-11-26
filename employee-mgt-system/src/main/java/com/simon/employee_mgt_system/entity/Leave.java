package com.simon.employee_mgt_system.entity;

import com.simon.employee_mgt_system.entity.enumpkg.LeaveStatus;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Leave {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate startDate;
    private LocalDate endDate;
    private String reason;

    @Enumerated(EnumType.STRING)
    private LeaveStatus status;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

}

