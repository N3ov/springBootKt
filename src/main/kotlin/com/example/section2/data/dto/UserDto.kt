package com.example.section2.data.dto

import com.example.section2.data.entity.UserEntity

data class UserDto(
    val id: Long,
    var userName: String,
    var age: Int
) {
    fun trans2Entity() = UserEntity(this.id, this.userName, this.age)
}
