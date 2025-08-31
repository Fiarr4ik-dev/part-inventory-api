package ru.fiarr4ik.category_service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;
import ru.fiarr4ik.category_service.entity.Category;
import ru.fiarr4ik.category_service.mapper.CategoryModelMapper;
import ru.fiarr4ik.shared.dto.CategoryRequestDTO;
import ru.fiarr4ik.shared.dto.CategoryResponseDTO;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Тестирование CategoryModelMapper")
class CategoryModelMapperTest {

    private final CategoryModelMapper mapper = new CategoryModelMapper(new ModelMapper());

    @Nested
    @DisplayName("Маппинг DTO → Entity")
    class DtoToEntity {

        @Test
        @DisplayName("CategoryRequestDTO должен маппиться в Category корректно")
        void mappingToEntityFromRequestDTOShouldReturnValidValue() {
            CategoryRequestDTO dto = new CategoryRequestDTO("TestName", "TestDesc");

            Category entity = mapper.toEntityFromRequestDTO(dto);

            assertThat(entity.getCategoryName()).isEqualTo("TestName");
            assertThat(entity.getCategoryDescription()).isEqualTo("TestDesc");
        }

        @Test
        @DisplayName("CategoryResponseDTO должен маппиться в Category корректно")
        void mappingToEntityFromResponseDTOShouldReturnValidValue() {
            CategoryResponseDTO dto = new CategoryResponseDTO(1L, "RespName", "RespDesc");

            Category entity = mapper.toEntityFromResponseDTO(dto);

            assertThat(entity.getCategoryId()).isEqualTo(1L);
            assertThat(entity.getCategoryName()).isEqualTo("RespName");
            assertThat(entity.getCategoryDescription()).isEqualTo("RespDesc");
        }
    }

    @Nested
    @DisplayName("Маппинг Entity → DTO")
    class EntityToDto {

        @Test
        @DisplayName("Category должен маппиться в CategoryRequestDTO корректно")
        void mappingToRequestDTOFromEntityShouldReturnValidValue() {
            Category entity = new Category();
            entity.setCategoryId(10L);
            entity.setCategoryName("EntityName");
            entity.setCategoryDescription("EntityDesc");

            CategoryRequestDTO dto = mapper.toRequestDTOFromEntity(entity);

            assertThat(dto.getCategoryName()).isEqualTo("EntityName");
            assertThat(dto.getCategoryDescription()).isEqualTo("EntityDesc");
        }

        @Test
        @DisplayName("Category должен маппиться в CategoryResponseDTO корректно")
        void mappingToResponseDTOFromEntityShouldReturnValidValue() {
            Category entity = new Category();
            entity.setCategoryId(99L);
            entity.setCategoryName("EntityResp");
            entity.setCategoryDescription("RespDesc");

            CategoryResponseDTO dto = mapper.toResponseDTOFromEntity(entity);

            assertThat(dto.getCategoryId()).isEqualTo(99L);
            assertThat(dto.getCategoryName()).isEqualTo("EntityResp");
            assertThat(dto.getCategoryDescription()).isEqualTo("RespDesc");
        }
    }
}
