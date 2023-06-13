package com.education.Information_Lookup.controller;

import com.education.Information_Lookup.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Date;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("api")
public class FilterController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/search")
    public ResponseEntity<?> searchStudents(@RequestParam(required = false) String year,
                                            @RequestParam(required = false) String certificateAuthentication,
                                            @RequestParam(required = false) String identification,
                                            @RequestParam(required = false) Integer schoolId,
                                            @RequestParam(required = false) String studentName,
                                            @RequestParam(name = "birthday", required = false) @DateTimeFormat(pattern = "dd-MM-yyyy") Date birthday) {

        return ResponseEntity.ok(studentService.findStudentsByCriteria(year, certificateAuthentication,
                identification, schoolId, studentName, birthday));
    }

}
