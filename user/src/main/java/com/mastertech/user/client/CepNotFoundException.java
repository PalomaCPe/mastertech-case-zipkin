package com.mastertech.user.client;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "CEP não encontrado")
public class CepNotFoundException extends RuntimeException {
}