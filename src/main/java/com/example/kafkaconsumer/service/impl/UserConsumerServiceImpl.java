package com.example.kafkaconsumer.service.impl;

import com.example.kafkaconsumer.dto.UserDto;
import com.example.kafkaconsumer.dto.mapper.UserMapper;
import com.example.kafkaconsumer.entity.User;
import com.example.kafkaconsumer.service.UserConsumerService;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserConsumerServiceImpl implements UserConsumerService {

    private final UserMapper userMapper;

    @Override
    @KafkaListener(topics = "users")
    public User consumeData(User user) {
        System.out.println("Consuming users: " + user);
        return user;
    }
}
