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


import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param maksAvstand 
 * @param omkrets 
 * @param konnekteringslenker 
 * @param detaljerteLenker 
 * @param kortform 
 * @param beholdTrafikantgruppe 
 * @param start 
 * @param slutt 
 * @param geometri 
 * @param vegsystemreferanse 
 * @param trafikantgruppe 
 * @param typeveg 
 * @param tidspunkt 
 * @param srid 
 */
@Serializable

data class FinnRuteParameters (

    @SerialName(value = "maks_avstand") @Required val maksAvstand: kotlin.Int,

    @SerialName(value = "omkrets") @Required val omkrets: kotlin.Int,

    @SerialName(value = "konnekteringslenker") @Required val konnekteringslenker: kotlin.Boolean,

    @SerialName(value = "detaljerte_lenker") @Required val detaljerteLenker: kotlin.Boolean,

    @SerialName(value = "kortform") @Required val kortform: kotlin.Boolean,

    @SerialName(value = "behold_trafikantgruppe") @Required val beholdTrafikantgruppe: kotlin.Boolean,

    @SerialName(value = "start") val start: kotlin.String? = null,

    @SerialName(value = "slutt") val slutt: kotlin.String? = null,

    @SerialName(value = "geometri") val geometri: kotlin.String? = null,

    @SerialName(value = "vegsystemreferanse") val vegsystemreferanse: kotlin.collections.List<kotlin.String>? = null,

    @SerialName(value = "trafikantgruppe") val trafikantgruppe: FinnRuteParameters.Trafikantgruppe? = null,

    @SerialName(value = "typeveg") val typeveg: kotlin.collections.List<FinnRuteParameters.Typeveg>? = null,

    @SerialName(value = "tidspunkt") val tidspunkt: java.time.LocalDate? = null,

    @SerialName(value = "srid") val srid: FinnRuteParameters.Srid? = null

) {

    /**
     * 
     *
     * Values: k,g
     */
    @Serializable
    enum class Trafikantgruppe(val value: kotlin.String) {
        @SerialName(value = "K") k("K"),
        @SerialName(value = "G") g("G");
    }
    /**
     * 
     *
     * Values: enkelBilveg,kanalisertVeg,rampe,rundkjøring,bilferje,gangMinusOgSykkelveg,sykkelveg,gangveg,gågate,fortau,trapp,gangfelt,gatetun,passasjerferje,traktorveg,sti,annet
     */
    @Serializable
    enum class Typeveg(val value: kotlin.String) {
        @SerialName(value = "Enkel bilveg") enkelBilveg("Enkel bilveg"),
        @SerialName(value = "Kanalisert veg") kanalisertVeg("Kanalisert veg"),
        @SerialName(value = "Rampe") rampe("Rampe"),
        @SerialName(value = "Rundkjøring") rundkjøring("Rundkjøring"),
        @SerialName(value = "Bilferje") bilferje("Bilferje"),
        @SerialName(value = "Gang- og sykkelveg") gangMinusOgSykkelveg("Gang- og sykkelveg"),
        @SerialName(value = "Sykkelveg") sykkelveg("Sykkelveg"),
        @SerialName(value = "Gangveg") gangveg("Gangveg"),
        @SerialName(value = "Gågate") gågate("Gågate"),
        @SerialName(value = "Fortau") fortau("Fortau"),
        @SerialName(value = "Trapp") trapp("Trapp"),
        @SerialName(value = "Gangfelt") gangfelt("Gangfelt"),
        @SerialName(value = "Gatetun") gatetun("Gatetun"),
        @SerialName(value = "Passasjerferje") passasjerferje("Passasjerferje"),
        @SerialName(value = "Traktorveg") traktorveg("Traktorveg"),
        @SerialName(value = "Sti") sti("Sti"),
        @SerialName(value = "Annet") annet("Annet");
    }
    /**
     * 
     *
     * Values: _5972,_5973,_5975,_4326,uTM32,uTM33,uTM35,wGS84
     */
    @Serializable
    enum class Srid(val value: kotlin.String) {
        @SerialName(value = "5972") _5972("5972"),
        @SerialName(value = "5973") _5973("5973"),
        @SerialName(value = "5975") _5975("5975"),
        @SerialName(value = "4326") _4326("4326"),
        @SerialName(value = "UTM32") uTM32("UTM32"),
        @SerialName(value = "UTM33") uTM33("UTM33"),
        @SerialName(value = "UTM35") uTM35("UTM35"),
        @SerialName(value = "WGS84") wGS84("WGS84");
    }
}

