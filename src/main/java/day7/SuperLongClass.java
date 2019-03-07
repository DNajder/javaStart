package day7;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Objects;

@Setter
@Getter
@AllArgsConstructor
@EqualsAndHashCode

public class SuperLongClass {


    private int someValue;
    private String anotherValue;
    private String test;
    private String value;
    private BigDecimal price;
}
