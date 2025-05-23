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
 * @param wkt 
 * @param srid 
 * @param egengeometri 
 * @param forenklet 
 * @param lengde 
 * @param areal 
 */
@Serializable

data class UtledetGeometri (

    @SerialName(value = "wkt") @Required val wkt: kotlin.String,

    @SerialName(value = "srid") @Required val srid: UtledetGeometri.Srid,

    @SerialName(value = "egengeometri") @Required val egengeometri: kotlin.Boolean,

    @SerialName(value = "forenklet") val forenklet: kotlin.Boolean? = null,

    @SerialName(value = "lengde") val lengde: kotlin.Double? = null,

    @SerialName(value = "areal") val areal: kotlin.Double? = null

) {

    /**
     * 
     *
     * Values: _5972,_5973,_5975,_4326
     */
    @Serializable
    enum class Srid(val value: kotlin.String) {
        @SerialName(value = "5972") _5972("5972"),
        @SerialName(value = "5973") _5973("5973"),
        @SerialName(value = "5975") _5975("5975"),
        @SerialName(value = "4326") _4326("4326");
    }
}

