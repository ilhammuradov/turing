package az.edu.turing.springboot03.domain.entity;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
public class Student {
    private Long id;
    private String name;
    private Integer age;
    private LocalDate createDate;
    private LocalDate updateDate;
}
