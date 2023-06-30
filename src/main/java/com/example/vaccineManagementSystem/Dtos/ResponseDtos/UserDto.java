package com.example.vaccineManagementSystem.Dtos.ResponseDtos;

import com.example.vaccineManagementSystem.Enums.Gender;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private String name;
    private Integer age;

    @Enumerated(value = EnumType.STRING)
    private Gender gender;
}