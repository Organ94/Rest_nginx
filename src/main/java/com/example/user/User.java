package com.example.user;

import com.example.data.Authorities;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class User {

    private String login;
    private String password;
    private List<Authorities> authorities;
}
