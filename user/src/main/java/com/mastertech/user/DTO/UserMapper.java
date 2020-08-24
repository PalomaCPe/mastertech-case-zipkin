package com.mastertech.user.DTO;

import com.mastertech.user.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public User toUser(UserRequest userRequest){
        User user = new User();
        user.setName(userRequest.getName());
        user.setCep(userRequest.getCep());
        return user;
    }

    public UserResponse toClienteResponse(User user) {
        UserResponse userResponse = new UserResponse();
        userResponse.setId(user.getId());
        userResponse.setName(user.getName());
        return userResponse;
    }

}