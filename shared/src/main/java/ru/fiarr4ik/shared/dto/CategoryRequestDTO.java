package ru.fiarr4ik.shared.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryRequestDTO {

    @NotBlank(message = "Название категории не должно быть пустым")
    @Size(max = 50, message = "Название категории не может быть длиннее 50 символов")
    private String categoryName;

    @Size(max = 200, message = "Описание не может быть длиннее 200 символов")
    private String categoryDescription;

}
