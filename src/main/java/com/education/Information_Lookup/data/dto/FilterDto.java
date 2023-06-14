package com.education.Information_Lookup.data.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class FilterDto {

    private String year;
    private String name;
    private Date birthday;
    private String identification;
    private String certificateAuthentication;
    private String school;
    private Date dateSign;

}
//    @RequestParam(value = "year", required = false) String year,
//    @RequestParam(value = "certificateAuthentication", required = false) String certificateAuthentication,
//    @RequestParam(value = "identification", required = false) String identification,
//    @RequestParam(value = "school", required = false) String school,
//    @RequestParam(value = "name", required = false) String name,
//    @RequestParam(value = "birthday", required = false)
//    Date birthday,
//    @RequestParam(value = "dateSign", required = false) Date dateSign) {
