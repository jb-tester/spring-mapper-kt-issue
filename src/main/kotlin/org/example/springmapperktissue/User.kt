package org.example.springmapperktissue

import javax.persistence.Entity
import javax.persistence.Id


@Entity
class User(@Id var id: String?, var userName: String?, var age: Int, var email: String?) {

}
