package org.example.springmapperktissue

import org.springframework.data.repository.CrudRepository


interface UserRepository : CrudRepository<User, String> {
}
