package io.github.droidkaigi.confsched2023.data.sessions.response

import kotlinx.serialization.Serializable

@Serializable
internal data class CategoryItemResponse(
    val name: LocaledResponse,
    val id: Int,
    val sort: Int,
)