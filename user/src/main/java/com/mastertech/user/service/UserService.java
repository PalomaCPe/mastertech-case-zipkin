package com.mastertech.user.service;

import com.mastertech.user.client.CepClient;
import com.mastertech.user.client.CepModel;
import com.mastertech.user.model.User;
import com.mastertech.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    CepClient clientCep;

    public User save(User user) {
        CepModel cepDTO = null;

        cepDTO = clientCep.buscaCep(user.getCep());

        user.setAddress(cepDTO.getLogradouro());
        user.setDistrict(cepDTO.getBairro());

        user = userRepository.save(user);

        return user;
    }

}