package com.mentorspro.resource

import org.jetbrains.exposed.sql.Table

object PersonTable : Table() {
    val clientId = varchar("clientId", 10).primaryKey()
    val active = bool("active")
    val name = varchar("name", length = 50)
    val lastName = varchar("lastName", length = 50)
    val eMail= varchar("eMail", length = 50)
    val phone = integer("phone")
    val city= varchar("city", length = 50)
    val country= varchar("country", length = 50)
    val description= varchar("description", length = 50)
    val mentor = bool("mentor")
    val mentee = bool("mentee")
}

