package com.education.Information_Lookup.service;

import com.education.Information_Lookup.entity.School;
import com.education.Information_Lookup.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolService {

    @Autowired
    private SchoolRepository schoolRepository;

    public List<School> getSchool(){
        return this.schoolRepository.findAll();
    }
}
