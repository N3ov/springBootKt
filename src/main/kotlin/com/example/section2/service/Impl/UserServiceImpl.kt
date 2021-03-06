package com.example.section2.service.Impl

import com.example.section2.data.dto.UserDto
import com.example.section2.repository.UserRepository
import com.example.section2.service.UserService
import org.springframework.stereotype.Service
import java.lang.RuntimeException

@Service
class UserServiceImpl(val userRepository: UserRepository) : UserService {
    override fun addUser(userDto: UserDto) = userRepository.save(userDto.trans2Entity()).trans2Dto();

    override fun findUserById(id: Long) = userRepository.findById(id).map {
        it.trans2Dto();
    }.orElseThrow {
        RuntimeException();
    };

    override fun modifyUser(userDto: UserDto) = userRepository.findById(userDto.id).orElseThrow {
        RuntimeException()
    }.apply {
        this.name = userDto.userName;
        this.age = userDto.age;
        userRepository.save(this)
    }.run {
        this.trans2Dto();
    };

    override fun removeUserById(id: Long) = userRepository.deleteById(id);
}