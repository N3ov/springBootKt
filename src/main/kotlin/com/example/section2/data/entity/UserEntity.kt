package com.example.section2.data.entity

import com.example.section2.data.dto.UserDto
import javax.persistence.*

@Entity
@Table(name = "testKt")
data class UserEntity (

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    val id: Long?,

    @Column
    var name: String,

    @Column
    var age: Int

) {
    fun trans2Dto(): UserDto = UserDto(this.id!!, this.name, this.age);
}