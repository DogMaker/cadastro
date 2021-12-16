package com.mentorspro.rest

import com.mentorspro.domain.Person
import com.mentorspro.domain.RegistryService
import io.micronaut.core.async.annotation.SingleResult
import io.micronaut.http.HttpResponse
import io.micronaut.http.MutableHttpResponse
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post

@Controller("/person")
class RegistryController(
    private val registryService: RegistryService
) {
    @Post
    @SingleResult
    fun registry(@Body person: Person): MutableHttpResponse<Person>? {
        val response = registryService.save(person)

        return HttpResponse.created(response)
    }

    @Get("/{personId}")
    @SingleResult
    fun retrieve(personId: String) = registryService.retrieve(personId)
}