package com.epam.mjc;

import java.util.List;
import java.util.stream.Collectors;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return (List<Integer> list) -> list.stream()
                .map(element -> element / divider)
                .collect(Collectors.toList());
    }
}
