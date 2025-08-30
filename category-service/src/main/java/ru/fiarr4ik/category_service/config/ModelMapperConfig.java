package ru.fiarr4ik.category_service.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * {@link Configuration} класс, предоставляющий bean для {@link ModelMapper}.
 * <p>
 * Этот bean может быть внедрён в любые компоненты Spring через {@code @Autowired} или конструкторное
 * внедрение, что позволяет использовать ModelMapper для маппинга DTO и сущностей.
 * </p>
 *
 * <h2>Пример использования</h2>
 * <pre>{@code
 * @Service
 * public class UserService {
 *
 *     private final ModelMapper modelMapper;
 *
 *     public UserService(ModelMapper modelMapper) {
 *         this.modelMapper = modelMapper;
 *     }
 *
 *     public UserDTO convertToDto(User user) {
 *         return modelMapper.map(user, UserDTO.class);
 *     }
 * }
 * }</pre>
 *
 * @see ModelMapper
 */
@Configuration
public class ModelMapperConfig {

    /**
     * Создаёт и возвращает {@link ModelMapper} bean, которым управляет Spring.
     *
     * @return новый экземпляр {@link ModelMapper}.
     */
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

}
