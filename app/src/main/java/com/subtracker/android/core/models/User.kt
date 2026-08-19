package com.subtracker.android.core.models

import com.google.gson.annotations.SerializedName

/** Mirrors sub-tracker-api's `users` row shape. */
data class User(
    val id: String,
    @SerializedName("clerk_id") val clerkId: String,
    val email: String,
    @SerializedName("full_name") val fullName: String?,
    @SerializedName("default_currency") val defaultCurrency: String,
    @SerializedName("created_at") val createdAt: String,
    @SerializedName("updated_at") val updatedAt: String,
)
