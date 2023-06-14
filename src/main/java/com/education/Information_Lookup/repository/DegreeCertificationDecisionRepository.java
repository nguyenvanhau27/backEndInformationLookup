package com.education.Information_Lookup.repository;

import com.education.Information_Lookup.data.entity.DegreeCertificationDecision;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DegreeCertificationDecisionRepository extends JpaRepository<DegreeCertificationDecision, Integer> {

    @Query("SELECT d.year FROM DegreeCertificationDecision d")
    List<String> findAllGraduationYear();

}
