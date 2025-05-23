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

package no.vegvesen.nvdb.vegnett.model

import no.vegvesen.nvdb.vegnett.model.Linje
import no.vegvesen.nvdb.vegnett.model.Punkt

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param type 
 * @param veglenkesekvensid 
 * @param startposisjon 
 * @param sluttposisjon 
 * @param kortform 
 * @param relativPosisjon 
 */
@Serializable

data class RuteKortformAllOfVegnettsrutesegmenter (

    @SerialName(value = "type") @Required val type: kotlin.Any?,

    @SerialName(value = "veglenkesekvensid") @Required val veglenkesekvensid: kotlin.Any?,

    @SerialName(value = "startposisjon") @Required override val startposisjon: kotlin.Double,

    @SerialName(value = "sluttposisjon") @Required override val sluttposisjon: kotlin.Double,

    @SerialName(value = "kortform") @Required val kortform: kotlin.Any?,

    @SerialName(value = "relativPosisjon") @Required val relativPosisjon: kotlin.Any?

)

