package com.audit.practice.Audit.Practice.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UploadPostDto {
    private Long id;
    private String title;
    private String description;
}
