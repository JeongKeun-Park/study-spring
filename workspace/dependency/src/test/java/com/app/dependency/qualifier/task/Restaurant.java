package com.app.dependency.qualifier.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class Restaurant {
    @Autowired
    Restaurant restaurant;
}
