package com.pranav.saxena.pojo;

import lombok.Data;

import java.util.List;

@Data
public class Function {
    private String id;
    private List<Variable> attributes;
    private String command;
}
