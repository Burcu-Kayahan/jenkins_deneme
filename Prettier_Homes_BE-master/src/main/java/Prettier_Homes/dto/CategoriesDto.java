package Prettier_Homes.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;


@Data
@NoArgsConstructor
public class CategoriesDto {

    private Long id;
    private String title;
    private String icon;
    private Boolean builtIn;
    private Integer seq;
    private String slug;
    private Boolean isActive;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;

    public CategoriesDto(Long id){
        this.id=id;
    }

}
