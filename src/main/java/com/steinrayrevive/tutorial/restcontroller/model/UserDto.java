package com.steinrayrevive.tutorial.restcontroller.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDto {

    String name;
    Integer age;

}
