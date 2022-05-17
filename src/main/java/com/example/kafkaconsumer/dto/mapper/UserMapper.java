package com.example.kafkaconsumer.dto.mapper;

import com.example.kafkaconsumer.dto.UserDto;
import com.example.kafkaconsumer.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper {

    UserDto entityToDto(User user);

    User fromDtoToUser(UserDto userDto);
}
