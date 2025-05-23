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

package no.vegvesen.nvdb.datakatalog.model

import no.vegvesen.nvdb.datakatalog.model.EgenskapstypeEnum
import no.vegvesen.nvdb.datakatalog.model.Stedfesting
import no.vegvesen.nvdb.datakatalog.model.Viktighet

import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

/**
 * 
 *
 * @param id 
 * @param egenskapstype 
 * @param obligatoriskVerdi 
 * @param skrivebeskyttet 
 * @param sensitivitet 
 * @param høydereferanseTall 
 * @param nøyaktighetskravGrunnriss 
 * @param nøyaktighetskravHøyde 
 * @param referansegeometriTilstrekkelig 
 * @param viktighet 
 * @param kategori 
 * @param sorteringsnummer 
 * @param avledet 
 * @param navn 
 * @param gruppesorteringsnummer 
 * @param veiledning 
 * @param grunnrissreferanse 
 * @param høydereferanse 
 * @param sosiReferanse 
 * @param komplementærEgenskapstype 
 * @param kortnavn 
 * @param beskrivelse 
 * @param sosinavn 
 * @param sosinvdbnavn 
 * @param stedfestingstype 
 * @param geometritype 
 * @param overlappOk 
 * @param kjørefeltRelevant 
 * @param sideposisjonRelevant 
 * @param innenforMor 
 * @param vegnettsajourholdSplitt 
 * @param overlappsautomatikk 
 * @param retningRelevant 
 */
@Serializable

data class StedfestingEnkel (

    @SerialName(value = "id") @Required override val id: kotlin.Int,

    @SerialName(value = "egenskapstype") @Required override val egenskapstype: EgenskapstypeEnum,

    @SerialName(value = "obligatorisk_verdi") @Required override val obligatoriskVerdi: kotlin.Boolean,

    @SerialName(value = "skrivebeskyttet") @Required override val skrivebeskyttet: kotlin.Boolean,

    @SerialName(value = "sensitivitet") @Required override val sensitivitet: kotlin.Int,

    @SerialName(value = "høydereferanse_tall") @Required override val høydereferanseTall: kotlin.Int,

    @SerialName(value = "nøyaktighetskrav_grunnriss") @Required override val nøyaktighetskravGrunnriss: kotlin.Double,

    @SerialName(value = "nøyaktighetskrav_høyde") @Required override val nøyaktighetskravHøyde: kotlin.Double,

    @SerialName(value = "referansegeometri_tilstrekkelig") @Required override val referansegeometriTilstrekkelig: kotlin.Boolean,

    @SerialName(value = "viktighet") @Required override val viktighet: Viktighet,

    @SerialName(value = "kategori") @Required override val kategori: kotlin.Int,

    @SerialName(value = "sorteringsnummer") @Required override val sorteringsnummer: kotlin.Int,

    @SerialName(value = "avledet") @Required override val avledet: kotlin.Boolean,

    @SerialName(value = "navn") override val navn: kotlin.String? = null,

    @SerialName(value = "gruppesorteringsnummer") override val gruppesorteringsnummer: kotlin.Int? = null,

    @SerialName(value = "veiledning") override val veiledning: kotlin.String? = null,

    @SerialName(value = "grunnrissreferanse") override val grunnrissreferanse: kotlin.String? = null,

    @SerialName(value = "høydereferanse") override val høydereferanse: kotlin.String? = null,

    @SerialName(value = "sosi_referanse") override val sosiReferanse: kotlin.String? = null,

    @SerialName(value = "komplementær_egenskapstype") override val komplementærEgenskapstype: kotlin.Int? = null,

    @SerialName(value = "kortnavn") override val kortnavn: kotlin.String? = null,

    @SerialName(value = "beskrivelse") override val beskrivelse: kotlin.String? = null,

    @SerialName(value = "sosinavn") override val sosinavn: kotlin.String? = null,

    @SerialName(value = "sosinvdbnavn") override val sosinvdbnavn: kotlin.String? = null,

    @SerialName(value = "stedfestingstype") val stedfestingstype: StedfestingEnkel.Stedfestingstype? = null,

    @SerialName(value = "geometritype") val geometritype: StedfestingEnkel.Geometritype? = null,

    @SerialName(value = "overlapp_ok") val overlappOk: kotlin.Boolean? = null,

    @SerialName(value = "kjørefelt_relevant") val kjørefeltRelevant: StedfestingEnkel.KjørefeltRelevant? = null,

    @SerialName(value = "sideposisjon_relevant") val sideposisjonRelevant: StedfestingEnkel.SideposisjonRelevant? = null,

    @SerialName(value = "innenfor_mor") val innenforMor: kotlin.Boolean? = null,

    @SerialName(value = "vegnettsajourhold_splitt") val vegnettsajourholdSplitt: StedfestingEnkel.VegnettsajourholdSplitt? = null,

    @SerialName(value = "overlappsautomatikk") val overlappsautomatikk: kotlin.String? = null,

    @SerialName(value = "retning_relevant") val retningRelevant: kotlin.Boolean? = null

) : Stedfesting {

    /**
     * 
     *
     * Values: punkt,linje,sving
     */
    @Serializable
    enum class Stedfestingstype(val value: kotlin.String) {
        @SerialName(value = "Punkt") punkt("Punkt"),
        @SerialName(value = "Linje") linje("Linje"),
        @SerialName(value = "Sving") sving("Sving");
    }
    /**
     * 
     *
     * Values: pUNKT,lINJE,sVING
     */
    @Serializable
    enum class Geometritype(val value: kotlin.String) {
        @SerialName(value = "PUNKT") pUNKT("PUNKT"),
        @SerialName(value = "LINJE") lINJE("LINJE"),
        @SerialName(value = "SVING") sVING("SVING");
    }
    /**
     * 
     *
     * Values: kAN,nEI,mÅ
     */
    @Serializable
    enum class KjørefeltRelevant(val value: kotlin.String) {
        @SerialName(value = "KAN") kAN("KAN"),
        @SerialName(value = "NEI") nEI("NEI"),
        @SerialName(value = "MÅ") mÅ("MÅ");
    }
    /**
     * 
     *
     * Values: kAN,nEI,mÅ
     */
    @Serializable
    enum class SideposisjonRelevant(val value: kotlin.String) {
        @SerialName(value = "KAN") kAN("KAN"),
        @SerialName(value = "NEI") nEI("NEI"),
        @SerialName(value = "MÅ") mÅ("MÅ");
    }
    /**
     * 
     *
     * Values: iKKETATTSTILLING,kANIKKESPLITTES,kANSPLITTES
     */
    @Serializable
    enum class VegnettsajourholdSplitt(val value: kotlin.String) {
        @SerialName(value = "IKKE_TATT_STILLING") iKKETATTSTILLING("IKKE_TATT_STILLING"),
        @SerialName(value = "KAN_IKKE_SPLITTES") kANIKKESPLITTES("KAN_IKKE_SPLITTES"),
        @SerialName(value = "KAN_SPLITTES") kANSPLITTES("KAN_SPLITTES");
    }
}

