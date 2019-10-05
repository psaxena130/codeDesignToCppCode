package com.pranav.saxena.pojo;

import lombok.Data;

import java.util.List;

@Data
public class InputJson {
    List<Function> functions;
    List<Command> commands;
    List<Operation> operations;
    List<Condition> conditions;
    List<Variable> variables;
}
