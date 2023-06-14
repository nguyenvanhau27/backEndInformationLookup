package com.education.Information_Lookup.service;

import com.education.Information_Lookup.data.dto.FilterDto;
import com.education.Information_Lookup.data.entity.Student;
import com.education.Information_Lookup.repository.SchoolRepository;
import com.education.Information_Lookup.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private SchoolRepository schoolRepository;

    public FilterDto findStudentsByCriteria(String year, String certificateAuthentication,
                                            String identification, Integer schoolId,
                                            String studentName, Date birthday) {

        Student student = this.studentRepository.findStudentsByCriteria(year, certificateAuthentication,
                identification, studentName, birthday, schoolId);

        if (student != null) {
            FilterDto filterDTO = new FilterDto();

            filterDTO.setYear(student.getGraduationYear());
            filterDTO.setName(student.getName());
            filterDTO.setBirthday(student.getBirthday());
            filterDTO.setIdentification(student.getIdentification());
            filterDTO.setCertificateAuthentication(student.getCertificateAuthentication());
            filterDTO.setDateSign(student.getDateSign());
            filterDTO.setSchool(student.getSchool().getName());

            return filterDTO;
        }

        return null;
    }
}
