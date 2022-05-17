package com.example.kafkaconsumer.service;

import com.example.kafkaconsumer.dto.UserDto;
import com.example.kafkaconsumer.entity.User;

public interface UserConsumerService {

    User consumeData(User user);
}
