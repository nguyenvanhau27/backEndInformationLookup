package com.education.Information_Lookup.service;

import com.education.Information_Lookup.repository.DegreeCertificationDecisionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DegreeCertificationDecisionService {
    @Autowired
    private DegreeCertificationDecisionRepository degreeCertificationDecisionRepository;
    public List<String> getAllGraduationYear(){
        return degreeCertificationDecisionRepository.findAllGraduationYear();
    }
}
