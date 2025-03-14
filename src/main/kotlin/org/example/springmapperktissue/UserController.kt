package org.example.springmapperktissue

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class UserController(private val userService: UserService) {

    @GetMapping()
    fun getDto(): List<UserDto> {
        userService.populateDB()
        return userService.getAllUserDTO()
    }

}
