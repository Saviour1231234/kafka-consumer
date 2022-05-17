package com.example.kafkaconsumer.service.impl;

import com.example.kafkaconsumer.dto.UserDto;
import com.example.kafkaconsumer.dto.mapper.UserMapper;
import com.example.kafkaconsumer.entity.User;
import com.example.kafkaconsumer.service.UserConsumerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserConsumerServiceImpl implements UserConsumerService {

//    private final UserMapper userMapper;

    @Override
    @KafkaListener(topics = "users",groupId = "app.basket")
    public void consumeData(ConsumerRecord<Long, UserDto> consumerRecord) {
        log.info("message get, partition={}, offset={}", consumerRecord.partition(), consumerRecord.offset());
        log.info("message get, key={}, value={}", consumerRecord.key(), consumerRecord.value());

    }
}
