package com.manolispapadimitriou.learningplatformbackend.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class AuthData {
    private Long id;
    private String token;
    private Integer tokenExpiration;
}
