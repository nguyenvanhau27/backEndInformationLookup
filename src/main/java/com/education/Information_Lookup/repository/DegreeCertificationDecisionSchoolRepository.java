package com.education.Information_Lookup.repository;

import com.education.Information_Lookup.entity.DegreeCertificationDecisionSchool;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DegreeCertificationDecisionSchoolRepository extends JpaRepository<DegreeCertificationDecisionSchool, Integer> {
}
