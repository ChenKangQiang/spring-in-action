package edu.tongji.comm.spittr.domain;


import lombok.Data;

@Data
public class Spitter {
    private Long id;
    private String username;
    private String password;
    private String fullName;
    private String email;
    private boolean updateByEmail;
}
