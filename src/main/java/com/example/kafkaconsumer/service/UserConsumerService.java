package com.example.kafkaconsumer.service;

import com.example.kafkaconsumer.dto.UserDto;
import com.example.kafkaconsumer.entity.User;
import org.apache.kafka.clients.consumer.ConsumerRecord;

public interface UserConsumerService {

    void consumeData(ConsumerRecord<Long, UserDto> consumerRecord);
}
