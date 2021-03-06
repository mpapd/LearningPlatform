package com.manolispapadimitriou.learningplatformbackend.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.manolispapadimitriou.learningplatformbackend.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@NoArgsConstructor
@AllArgsConstructor
public class CourseDTO {
    private Integer id;
    private String name;
    private String image;
    private String description;
    private User teacher;
}
