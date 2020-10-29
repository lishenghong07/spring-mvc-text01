package com.qf.hong.mvc.entity;

import lombok.Data;

import java.util.List;

@Data
public class User {
    private int id;
    private String username;
    private String password;
    private Address address;
    private List<Integer> addressList;
}
