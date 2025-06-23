package com.CamiloCuencaDev.habitforge.model

import androidx.compose.material.icons.Icons
import com.CamiloCuencaDev.habitforge.model.Enums.Repetition
import com.CamiloCuencaDev.habitforge.model.Enums.State
import kotlin.uuid.ExperimentalUuidApi
import kotlin.uuid.Uuid
import kotlinx.datetime.*


data class Habit @OptIn(ExperimentalUuidApi::class) constructor(
    val id: Uuid,
    val name: String,
    val description: String,
    val state: State,
    val icon: String,
    val category: Category,
    val creationDate : LocalDateTime,
    val repetition: Repetition,
    val reminder: LocalDateTime

)
