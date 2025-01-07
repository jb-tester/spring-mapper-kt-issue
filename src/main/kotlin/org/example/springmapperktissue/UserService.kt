package org.example.springmapperktissue;

import org.springframework.stereotype.Service;

@Service
class UserService(
    // "Could not autowire. There is more than one bean..." after the project is built
    private val mapper: UserMapper){

    fun createDto (): UserDto? { val user = User("1", "vasya", 18, "vasya@dummy.com")
       return mapper.toDto(user)
    }

   }