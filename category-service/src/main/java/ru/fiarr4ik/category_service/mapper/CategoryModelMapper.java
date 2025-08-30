package ru.fiarr4ik.category_service.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.fiarr4ik.category_service.entity.Category;
import ru.fiarr4ik.shared.dto.CategoryRequestDTO;
import ru.fiarr4ik.shared.dto.CategoryResponseDTO;

@Component
public class CategoryModelMapper {

    private final ModelMapper modelMapper;

    @Autowired
    public CategoryModelMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public Category toEntityFromRequestDTO(CategoryRequestDTO categoryRequestDTO) {
        return modelMapper.map(categoryRequestDTO, Category.class);
    }

    public Category toEntityFromResponseDTO(CategoryResponseDTO categoryResponseDTO) {
        return modelMapper.map(categoryResponseDTO, Category.class);
    }

    public CategoryRequestDTO toRequestDTOFromEntity(Category category) {
        return modelMapper.map(category, CategoryRequestDTO.class);
    }

    public CategoryResponseDTO toResponseDTOFromEntity(Category category) {
        return modelMapper.map(category, CategoryResponseDTO.class);
    }

}
