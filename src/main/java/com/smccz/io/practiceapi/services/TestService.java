package com.smccz.io.practiceapi.services;
import org.springframework.web.bind.annotation.RestController;
import com.smccz.io.practiceapi.constants.APIKEYS;

import java.time.LocalDate;
import java.util.HashMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class TestService {
    @GetMapping(value="time/{name}")
    public HashMap<String,String> getMethodName(@PathVariable String name) {
        HashMap<String,String> data=new HashMap<>();
        LocalDate date = LocalDate.now();
        data.put(APIKEYS.time, Long.toString(System.currentTimeMillis()));
        data.put(APIKEYS.date, date.toString());
        data.put(APIKEYS.name, name);
        return data;
    }
    
}
