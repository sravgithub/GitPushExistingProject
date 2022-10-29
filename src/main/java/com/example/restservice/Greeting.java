package com.example.restservice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Greeting {
    private final int id;
    private final String name;
}
