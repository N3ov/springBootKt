package com.example.section2.controller

import com.example.section2.data.dto.UserDto
import com.example.section2.service.UserService
import org.springframework.web.bind.annotation.*

@RestController
class UserController(
    val userService: UserService
) {

    @GetMapping("/user")
    fun findUserById(@RequestParam id: Long) = userService.findUserById(id);

    @PostMapping("/user")
    fun addUser(@RequestBody userDto: UserDto) = userService.addUser(userDto);

    @PutMapping("/user")
    fun modifyUser(@RequestBody userDto: UserDto) = userService.modifyUser(userDto);

    @DeleteMapping("/user")
    fun deleteUser(@RequestParam id: Long) = userService.removeUserById(id);

}