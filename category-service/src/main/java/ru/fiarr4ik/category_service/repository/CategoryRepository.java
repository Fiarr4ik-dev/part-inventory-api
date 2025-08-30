package ru.fiarr4ik.category_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.fiarr4ik.category_service.entity.Category;

/**
 * Класс-репозиторий для CRUD операций с сущностью {@link Category}.
 */
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
