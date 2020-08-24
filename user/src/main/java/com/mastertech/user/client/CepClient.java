package com.mastertech.user.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "cep", configuration = CepClientConfiguration.class)
public interface CepClient {

    @GetMapping("/cep/{cep}")
    public CepModel buscaCep(@PathVariable String cep);

}
