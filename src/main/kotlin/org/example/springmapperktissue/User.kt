package org.example.springmapperktissue

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table


@Entity
@Table(name = "USERS")
class User {

    @Id var id: String? = null
    @Column(name= "name") var userName: String? = null
    var age: Int = 0
    var email: String? = null

    constructor()
    constructor(id: String?, userName: String?, age: Int, email: String?) {
        this.id = id
        this.userName = userName
        this.age = age
        this.email = email
    }
}
