package com.assignment.fetchingdatausingjava3;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class fetchingdatacontroller {

    @PostMapping("/data")
    public String postData() {
        return "Santosh Post Method";
    }
}
