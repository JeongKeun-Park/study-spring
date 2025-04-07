package com.app.dependency.qualifier.task;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Getter
@Qualifier("vips")
public class Vips implements Restaurant {
    private int stakePrice;

    @Override
    public int changeStakePrice() {
        stakePrice = 20000;
        return stakePrice;
    }

    @Override
    public boolean selfBar() {
        return false;
    }
}
