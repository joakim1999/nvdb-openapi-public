/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package no.vegvesen.nvdb.vegobjekter.model


import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param enumid 
 * @param vegforvalter 
 */
@Serializable

data class Vegforvalter (

    @SerialName(value = "enumid") @Required val enumid: kotlin.Int,

    @SerialName(value = "vegforvalter") @Required val vegforvalter: kotlin.String

)

