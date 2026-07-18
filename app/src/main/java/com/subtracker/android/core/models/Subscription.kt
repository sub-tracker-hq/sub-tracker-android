package com.subtracker.android.core.models

import com.google.gson.annotations.SerializedName

/**
 * Mirrors sub-tracker-api's subscription response shape.
 *
 * [amount] is kept as a String, matching the API's wire format exactly —
 * convert via BigDecimal(amount) wherever actual math or display happens.
 * Never parse it as Double/Float.
 */
data class Subscription(
    val id: String,
    @SerializedName("provider_key") val providerKey: String?,
    val name: String,
    val category: String,
    val amount: String,
    val currency: String,
    @SerializedName("billing_cycle") val billingCycle: String,
    @SerializedName("next_billing_date") val nextBillingDate: String?,
    val status: String,
    val source: String,
    @SerializedName("created_at") val createdAt: String,
    @SerializedName("updated_at") val updatedAt: String,
)
