package org.example.springmapperktissue;

import org.springframework.stereotype.Service;

@Service
class UserService(
    // "Could not autowire. There is more than one bean..." after the project is built
    private val mapper: UserMapper,
    private val userRepository: UserRepository
){

    fun create(dto: UserDto?): User? = mapper.toUser(dto)
    fun createDto(user: User?): UserDto? {
        return mapper.toDto(user)
    }
    fun populateDB(){
        userRepository.save(User("1", "vasya", 18, "vasya@dummy.com"))
        userRepository.save(User("2", "vanya", 20, "vanya@dummy.com"))
        userRepository.save(User("3", "valya", 25, "valya@dummy.com"))
    }
    fun getAllUserDTO(): List<UserDto> {
        val dtos: MutableList<UserDto> = mutableListOf()
        val users = userRepository.findAll()
        users.forEach { user -> createDto(user)?.let { dtos.add(it) } }
        return dtos
    }
   }