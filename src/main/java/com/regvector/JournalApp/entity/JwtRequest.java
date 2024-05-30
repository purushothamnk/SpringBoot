package com.regvector.JournalApp.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
@NoArgsConstructor
public class JwtRequest {
    private String email;
    private String password;


}
