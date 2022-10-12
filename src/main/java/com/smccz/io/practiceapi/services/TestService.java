package com.smccz.io.practiceapi.services;
import org.springframework.web.bind.annotation.RestController;
import com.smccz.io.practiceapi.constants.APIKEYS;

import java.time.LocalDate;
import java.util.HashMap;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class TestService {
    @GetMapping(value="time")
    public HashMap<String,String> getMethodName() {
        HashMap<String,String> data=new HashMap<>();
        LocalDate date = LocalDate.now();
        data.put(APIKEYS.time, Long.toString(System.currentTimeMillis()));
        data.put(APIKEYS.date, date.toString());
        data.put(APIKEYS.name, "Sabir Mondal");
        return data;
    }
    
}
