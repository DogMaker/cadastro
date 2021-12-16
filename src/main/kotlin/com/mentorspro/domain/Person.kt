package com.mentorspro.domain

data class Person (
    val clientId: String,
    val active: Boolean,
    val name: String,
    val lastName: String,
    val eMail: String,
    val phone: Int,
    val city: String,
    val country: String,
    val description: String,
    val mentor: Boolean,
    val mentee: Boolean
    )
