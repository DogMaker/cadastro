package com.mentorspro.resource

import com.mentorspro.domain.Person
import jakarta.inject.Singleton
import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.SchemaUtils
import org.jetbrains.exposed.sql.insert
import org.jetbrains.exposed.sql.transactions.transaction

@Singleton
class PersonRepository {
    fun save(person: Person): Person {
        Database.connect("jdbc:h2:mem:test", driver = "org.h2.Driver", user = "root", password = "")

        transaction {
            SchemaUtils.create(PersonTable)

            PersonTable.insert {
                it[clientId] = person.clientId
                it[active] = person.active
                it[name] = person.name
                it[lastName] = person.lastName
                it[eMail] = person.eMail
                it[phone] = person.phone
                it[city] = person.city
                it[country] = person.country
                it[description] = person.description
                it[mentor] = person.mentor
                it[mentee] = person.mentee
            }
        }
        return person
    }
}