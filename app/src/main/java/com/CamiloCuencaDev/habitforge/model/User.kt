package com.CamiloCuencaDev.habitforge.model

import kotlin.uuid.ExperimentalUuidApi
import kotlin.uuid.Uuid

data class User @OptIn(ExperimentalUuidApi::class) constructor(
    val id : Uuid,
    val name: String,
    val lastName: String,
    val email: String,
    val password: String,
    val habits: List<Habit>,
    val categories: List<Category>
)
