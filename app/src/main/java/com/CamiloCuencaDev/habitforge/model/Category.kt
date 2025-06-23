package com.CamiloCuencaDev.habitforge.model

import kotlin.uuid.ExperimentalUuidApi
import kotlin.uuid.Uuid

data class Category @OptIn(ExperimentalUuidApi::class) constructor(
    val id: Uuid,
    val name: String,
    val Description: String,
    val icon: String

)
