package ru.fiarr4ik.shared.dto;

import lombok.Data;

@Data
public class CategoryResponseDTO {

    private long categoryId;
    private String categoryName;
    private String categoryDescription;

}
