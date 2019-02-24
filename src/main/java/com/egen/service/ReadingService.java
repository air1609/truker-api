package com.egen.service;

import com.egen.entity.Reading;

import java.util.List;

public interface ReadingService
{
    List<Reading> findAll();

    Reading findOne(String id);

    Reading create(Reading reading);

    Reading update(Reading reading);

    void delete(String id);
}
