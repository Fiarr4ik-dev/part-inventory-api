package ru.fiarr4ik.shared.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryResponseDTO {

    private long categoryId;
    private String categoryName;
    private String categoryDescription;

}
