package com.app.dependency.qualifier.task;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

public interface Restaurant {
    public final int stakePrice = 10000;

    public boolean selfBar();
}
