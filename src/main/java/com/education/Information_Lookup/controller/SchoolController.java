package com.education.Information_Lookup.controller;

import com.education.Information_Lookup.repository.SchoolRepository;
import com.education.Information_Lookup.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("api/school/")
public class SchoolController {

    @Autowired
    private SchoolService schoolService;

    @GetMapping("")
    public ResponseEntity<?> findAllActive() {
        return ResponseEntity.ok(this.schoolService.getSchool());
    }
}
