package com.app.dependency.qualifier.task;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Getter
@Primary
public class Outback implements Restaurant {

    @Override
    public boolean selfBar() {
        return true;
    }
}
