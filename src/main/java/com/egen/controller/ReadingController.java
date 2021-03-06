package com.egen.controller;

import com.egen.entity.Reading;
import com.egen.service.ReadingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/readings")
@CrossOrigin(origins = "http://mocker.egen.io")
public class ReadingController
{
    private final ReadingService service;

    @Autowired
    public ReadingController(ReadingService service) {
        this.service = service;
    }

    @RequestMapping(method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Reading> findAll() {
        return service.findAll();
    }

    @RequestMapping(method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Reading create(@RequestBody Reading reading) {
        System.out.println("Creating Reading record");
        return service.create(reading);
    }
}
