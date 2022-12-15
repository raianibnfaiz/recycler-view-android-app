package com.raian.affirmations.model

import java.io.Serializable

data class Affirmation(
    val stringResourceId: Int,
    val imageResourceId: Int
    ): Serializable