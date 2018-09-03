package org.cherubic.demo.model.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@NoArgsConstructor
@Setter
public class ServiceResult<T> {

    private Boolean success;
    private String message;
    private T result;
}
