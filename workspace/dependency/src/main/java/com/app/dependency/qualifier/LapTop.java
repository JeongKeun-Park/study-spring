package com.app.dependency.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class LapTop implements Computer {
    @Override
    public int getScreenWidth() {
        return 1280;
    }
}

