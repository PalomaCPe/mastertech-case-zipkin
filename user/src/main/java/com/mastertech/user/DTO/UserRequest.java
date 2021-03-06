package com.mastertech.user.DTO;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserRequest {
    @Size(min = 3)
    private String name;

    private String cep;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
