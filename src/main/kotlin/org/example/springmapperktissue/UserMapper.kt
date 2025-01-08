package org.example.springmapperktissue;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping

@Mapper(componentModel = "spring",
        injectionStrategy = InjectionStrategy.CONSTRUCTOR)
interface UserMapper {

        @Mapping(target = "id", source = "dto.id")
        @Mapping(target = "userName", source = "dto.firstName")
        @Mapping(target = "age", source = "dto.age")
        @Mapping(target = "email", source = "dto.contact")
        fun toUser(dto: UserDto?): User?
        @Mapping(target = "id", source = "entity.id")
        @Mapping(target = "firstName", source = "entity.userName")
        @Mapping(target = "age", source = "entity.age")
        @Mapping(target = "contact", source = "entity.email")
        fun toDto(entity: User?): UserDto?
}
