package com.mentorspro.domain

import com.mentorspro.resource.PersonRepository
import jakarta.inject.Singleton

@Singleton
class RegistryService(
    private val repository: PersonRepository
) {
    fun retrieve(name: String) = "Hello $name"

    fun save(person: Person) = repository.save(person)
}