package com.education.Information_Lookup.repository;

import com.education.Information_Lookup.data.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.Date;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query("SELECT s FROM Student s " +
            "JOIN s.school sc " +
            "JOIN DegreeCertificationDecisionSchool dcds ON dcds.school = sc " +
            "JOIN dcds.degreeCertificationDecision dcd " +
            "WHERE (:year IS NULL OR s.graduationYear = :year) " +
            "AND (:studentName IS NULL OR s.name = :studentName) " +
            "AND (:birthday IS NULL OR s.birthday = :birthday) " +
            "AND (:schoolId IS NULL OR sc.id = :schoolId) " +
            "AND (:certificateAuthentication IS NULL OR s.certificateAuthentication = :certificateAuthentication) " +
            "AND (:identification IS NULL OR s.identification = :identification) ")
    Student findStudentsByCriteria(@Param("year") String year,
                                   @Param("certificateAuthentication") String certificateAuthentication,
                                   @Param("identification") String identification,
                                   @Param("studentName") String studentName,
                                   @Param("birthday") Date birthday,
                                   @Param("schoolId") Integer schoolId);
//"AND (COALESCE(:certificateAuthentication, s.certificateAuthentication) = s.certificateAuthentication) " +
//        "AND (COALESCE(:identification, s.identification) = s.identification)")
}
