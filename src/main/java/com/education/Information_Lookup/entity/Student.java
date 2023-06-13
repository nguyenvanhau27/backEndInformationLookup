package com.education.Information_Lookup.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "student")
public class Student implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", length = 4)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "birthday")
    private Date birthday;

    @Column(name = "birthplace")
    private String birthplace;

    @Column(name = "gender")
    private int gender;

    @Column(name = "nation")
    private String nation;

    @Column(name = "graduation_year")
    private String graduationYear;

    @Column(name = "graduation_grade")
    private String graduationGrade;

    @Column(name = "certificate_authentication")
    private String certificateAuthentication;

    @Column(name = "original_diploma_registration_number", nullable = false, unique = true)
    private String originalDiplomaRegistrationNumber;

    @Column(name = "date_sign")
    private Date dateSign;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "school_id", nullable = false)
    private School school;


    @Column(name = "identification", nullable = false, unique = true)
    private String identification;

}
