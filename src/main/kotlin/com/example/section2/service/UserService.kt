package com.example.section2.service

import com.example.section2.data.dto.UserDto

interface UserService {

    fun addUser(userDto: UserDto): UserDto;

    fun findUserById(id: Long): UserDto;

    fun modifyUser(userDto: UserDto): UserDto;

    fun removeUserById(id: Long): Unit;
}