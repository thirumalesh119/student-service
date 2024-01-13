package com.project.student.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long studentId;

    private String studentName;

    private String fatherName;

    private Boolean loanApproved;

    private Long requiredLoan;

    private Long loanSanctioned;

    private String verificationStatus;

    private Boolean assuranceProvided;

    private String collegeName;

    private Boolean visaApproved;
}
