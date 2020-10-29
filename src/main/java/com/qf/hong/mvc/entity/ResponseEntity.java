package com.qf.hong.mvc.entity;

import lombok.Data;

@Data
public class ResponseEntity<T> {
    private int status;
    private String mag;
    private T data;
}
