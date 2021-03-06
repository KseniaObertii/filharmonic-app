package mate.academy.spring.model.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class StageResponseDto {
    private Long id;
    private int capacity;
    private String description;
}
