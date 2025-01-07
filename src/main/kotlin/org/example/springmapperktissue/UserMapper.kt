package org.example.springmapperktissue;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring",
        injectionStrategy = InjectionStrategy.CONSTRUCTOR)
interface UserMapper {

        fun toUser(dto: UserDto?): User?
        fun toDto(user: User?): UserDto?
}
