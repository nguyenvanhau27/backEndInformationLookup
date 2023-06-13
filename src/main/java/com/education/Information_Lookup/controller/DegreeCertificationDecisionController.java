package com.education.Information_Lookup.controller;

import com.education.Information_Lookup.service.DegreeCertificationDecisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("api/graduation")
public class DegreeCertificationDecisionController {

    @Autowired
    private DegreeCertificationDecisionService degreeCertificationDecisionService;

    @GetMapping("")
    public ResponseEntity<?> findAllGraduationYear() {
        return ResponseEntity.ok(this.degreeCertificationDecisionService.getAllGraduationYear());
    }
}
