package com.hyj.pet.pojo;

import lombok.Data;

@Data
public class User {
private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
