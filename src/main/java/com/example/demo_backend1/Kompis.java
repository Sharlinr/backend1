package com.example.demo_backend1;

import lombok.Data;

@Data
public class Kompis {

    public int id;
    public String name;
    public String address;
    public String telNum;

    public Kompis(int id, String name, String address, String telNum) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.telNum = telNum;
    }

}

