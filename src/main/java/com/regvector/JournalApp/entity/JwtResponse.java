package com.regvector.JournalApp.entity;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
public class JwtResponse {

    private String jwtToken;
    private String username;
}
