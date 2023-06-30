package com.example.vaccineManagementSystem.Dtos.ResponseDtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class VaccinationCentreDto {
    private String name;
    private String address;
}