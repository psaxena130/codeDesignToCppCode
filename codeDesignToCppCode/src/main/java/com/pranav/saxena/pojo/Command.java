package com.pranav.saxena.pojo;

import lombok.Data;

@Data
public class Command {
    private String id;
    private String nextId;
    private String operationId;
    private String functionCall;
    private If ifBlock;
    private For forBlock;
    private While whileBlock;
}
