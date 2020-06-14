package Hillel20202.KW32.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AddresDto {
    private String postalCode;
    private String country;
    private String city;
    private String bilding;
    private String flat;
}