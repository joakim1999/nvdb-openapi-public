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

package no.vegvesen.nvdb.vegnett.api

import no.vegvesen.nvdb.vegnett.model.ProblemDetail
import no.vegvesen.nvdb.vegnett.model.Veglenkesegment
import no.vegvesen.nvdb.vegnett.model.VeglenkesegmenterSide
import no.vegvesen.nvdb.vegnett.model.Veglenkesekvens
import no.vegvesen.nvdb.vegnett.model.VeglenkesekvenserSide

import org.openapitools.client.infrastructure.*
import io.ktor.client.HttpClient
import io.ktor.client.HttpClientConfig
import io.ktor.client.request.forms.formData
import io.ktor.client.engine.HttpClientEngine
import kotlinx.serialization.json.Json
import io.ktor.http.ParametersBuilder
import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

open class VegnettApi : ApiClient {

    constructor(
        baseUrl: String = ApiClient.BASE_URL,
        httpClientEngine: HttpClientEngine? = null,
        httpClientConfig: ((HttpClientConfig<*>) -> Unit)? = null,
        jsonSerializer: Json = ApiClient.JSON_DEFAULT
    ) : super(baseUrl = baseUrl, httpClientEngine = httpClientEngine, httpClientConfig = httpClientConfig, jsonBlock = jsonSerializer)

    constructor(
        baseUrl: String,
        httpClient: HttpClient
    ): super(baseUrl = baseUrl, httpClient = httpClient)


    /**
     * enum for parameter srid
     */
    @Serializable
    enum class SridGetSegmentertVeglenkesekvens(val value: kotlin.String) {
        
        @SerialName(value = "5972")
        _5972("5972"),
        
        @SerialName(value = "5973")
        _5973("5973"),
        
        @SerialName(value = "5975")
        _5975("5975"),
        
        @SerialName(value = "4326")
        _4326("4326"),
        
        @SerialName(value = "UTM32")
        uTM32("UTM32"),
        
        @SerialName(value = "UTM33")
        uTM33("UTM33"),
        
        @SerialName(value = "UTM35")
        uTM35("UTM35"),
        
        @SerialName(value = "WGS84")
        wGS84("WGS84")
        
    }

    /**
     * Hent en segmentert veglenkesekvens
     * 
     * @param veglenkesekvensId ID for veglenkesekvensen.
     * @param srid Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;. (optional)
     * @param historisk For &#x60;false&#x60; returneres kun dagens veglenkesegmenter. For &#x60;true&#x60; returneres dagens og historiske veglenkesegmenter. Default er &#x60;false&#x60;. (optional)
     * @param tidspunkt Begrens spørring til det gitte tidspunktet. (optional)
     * @return kotlin.collections.List<Veglenkesegment>
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun getSegmentertVeglenkesekvens(veglenkesekvensId: kotlin.Long, srid: SridGetSegmentertVeglenkesekvens? = null, historisk: kotlin.Boolean? = null, tidspunkt: java.time.LocalDate? = null): HttpResponse<kotlin.collections.List<Veglenkesegment>> {

        val localVariableAuthNames = listOf<String>()

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        srid?.apply { localVariableQuery["srid"] = listOf("$srid") }
        historisk?.apply { localVariableQuery["historisk"] = listOf("$historisk") }
        tidspunkt?.apply { localVariableQuery["tidspunkt"] = listOf("$tidspunkt") }
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/api/v4/veglenkesekvenser/segmentert/{veglenkesekvensId}".replace("{" + "veglenkesekvensId" + "}", "$veglenkesekvensId"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap<GetSegmentertVeglenkesekvensResponse>().map { value }
    }

    @Serializable(GetSegmentertVeglenkesekvensResponse.Companion::class)
    private class GetSegmentertVeglenkesekvensResponse(val value: List<Veglenkesegment>) {
        companion object : KSerializer<GetSegmentertVeglenkesekvensResponse> {
            private val serializer: KSerializer<List<Veglenkesegment>> = serializer<List<Veglenkesegment>>()
            override val descriptor = serializer.descriptor
            override fun serialize(encoder: Encoder, obj: GetSegmentertVeglenkesekvensResponse) = serializer.serialize(encoder, obj.value)
            override fun deserialize(decoder: Decoder) = GetSegmentertVeglenkesekvensResponse(serializer.deserialize(decoder))
        }
    }


    /**
     * enum for parameter srid
     */
    @Serializable
    enum class SridGetVeglenkesegmenter(val value: kotlin.String) {
        
        @SerialName(value = "5972")
        _5972("5972"),
        
        @SerialName(value = "5973")
        _5973("5973"),
        
        @SerialName(value = "5975")
        _5975("5975"),
        
        @SerialName(value = "4326")
        _4326("4326"),
        
        @SerialName(value = "UTM32")
        uTM32("UTM32"),
        
        @SerialName(value = "UTM33")
        uTM33("UTM33"),
        
        @SerialName(value = "UTM35")
        uTM35("UTM35"),
        
        @SerialName(value = "WGS84")
        wGS84("WGS84")
        
    }


    /**
     * enum for parameter detaljniva
     */
    @Serializable
    enum class DetaljnivaGetVeglenkesegmenter(val value: kotlin.String) {
        
        @SerialName(value = "VT")
        vT("VT"),
        
        @SerialName(value = "KB")
        kB("KB"),
        
        @SerialName(value = "KF")
        kF("KF"),
        
        @SerialName(value = "VTKB")
        vTKB("VTKB")
        
    }


    /**
     * enum for parameter typeveg
     */
    @Serializable
    enum class TypevegGetVeglenkesegmenter(val value: kotlin.String) {
        
        @SerialName(value = "kanalisertVeg")
        kanalisertVeg("kanalisertVeg"),
        
        @SerialName(value = "enkelBilveg")
        enkelBilveg("enkelBilveg"),
        
        @SerialName(value = "rampe")
        rampe("rampe"),
        
        @SerialName(value = "rundkjøring")
        rundkjøring("rundkjøring"),
        
        @SerialName(value = "bilferje")
        bilferje("bilferje"),
        
        @SerialName(value = "passasjerferje")
        passasjerferje("passasjerferje"),
        
        @SerialName(value = "gangOgSykkelveg")
        gangOgSykkelveg("gangOgSykkelveg"),
        
        @SerialName(value = "sykkelveg")
        sykkelveg("sykkelveg"),
        
        @SerialName(value = "gangveg")
        gangveg("gangveg"),
        
        @SerialName(value = "gågate")
        gågate("gågate"),
        
        @SerialName(value = "fortau")
        fortau("fortau"),
        
        @SerialName(value = "trapp")
        trapp("trapp"),
        
        @SerialName(value = "gangfelt")
        gangfelt("gangfelt"),
        
        @SerialName(value = "gatetun")
        gatetun("gatetun"),
        
        @SerialName(value = "traktorveg")
        traktorveg("traktorveg"),
        
        @SerialName(value = "sti")
        sti("sti"),
        
        @SerialName(value = "annet")
        annet("annet")
        
    }


    /**
     * enum for parameter adskiltelop
     */
    @Serializable
    enum class AdskiltelopGetVeglenkesegmenter(val value: kotlin.String) {
        
        @SerialName(value = "Med")
        med("Med"),
        
        @SerialName(value = "Mot")
        mot("Mot"),
        
        @SerialName(value = "Nei")
        nei("Nei")
        
    }


    /**
     * enum for parameter veglenketype
     */
    @Serializable
    enum class VeglenketypeGetVeglenkesegmenter(val value: kotlin.String) {
        
        @SerialName(value = "Hoved")
        hoved("Hoved"),
        
        @SerialName(value = "Detaljert")
        detaljert("Detaljert"),
        
        @SerialName(value = "Konnektering")
        konnektering("Konnektering"),
        
        @SerialName(value = "detaljert_konnektering")
        detaljertKonnektering("detaljert_konnektering")
        
    }


    /**
     * enum for parameter trafikantgruppe
     */
    @Serializable
    enum class TrafikantgruppeGetVeglenkesegmenter(val value: kotlin.String) {
        
        @SerialName(value = "K")
        k("K"),
        
        @SerialName(value = "G")
        g("G")
        
    }

    /**
     * Hent segmenterte veglenkesekvenser
     * 
     * @param srid Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;. (optional)
     * @param ider Kommaseparert liste med IDer. (optional)
     * @param fylke Filtrer på fylke. Kommaseparert liste. Se [/omrader/api/v4/fylker](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der) for mulige verdier.  Eksempel: &#x60;50&#x60; (optional)
     * @param kommune Filtrer på kommune. Kommaseparert liste. Se [/omrader/api/v4/kommuner](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der) for mulige verdier.  Eksempel: &#x60;5001&#x60; (optional)
     * @param kontraktsomrade Filtrer på kontraktsomrade. Kommaseparert liste. Se [/omrader/api/v4/kontraktsomrader](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der) for mulige verdier.  Eksempel: &#x60;1539 Tunnel- og bergsikr 2018-2023 Nordm og Romsd&#x60; (optional)
     * @param riksvegrute Filtrer på riksvegrute. Kommaseparert liste. Se [/omrader/api/v4/riksvegruter](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der) for mulige verdier.  Eksempel: &#x60;RUTE4A&#x60; eller som enumid &#x60;20290&#x60; (optional)
     * @param vegforvalter Filtrer på vegforvalter. Kommaseparert liste. Se [/omrader/api/v4/vegforvaltere](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der) for mulige verdier.  Eksempel: &#x60;Møre og Romsdal fylkeskommune&#x60; eller som enumid &#x60;21774&#x60; (optional)
     * @param vegsystemreferanse Filtrer på [vegsystemreferanse](https://nvdbapiles-v3.atlas.vegvesen.no/dokumentasjon/#vegsystemreferanse). Kommaseparert liste. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: &#x60;EV6S1D1 m12&#x60; (optional)
     * @param kartutsnitt Filtrer med kartutsnitt i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret). Formatet er &#x60;minX, minY, maxX, maxY&#x60;.  Eksempel: &#x60;265273, 7019372, 346553, 7061071&#x60; (optional)
     * @param polygon Filtrer med polygon i det gjeldende geografiske referansesystemet (&#x60;srid&#x60;-paramteret).  Eksempel: &#x60;20000 6520000, 20500 6520000, 21000 6500000, 20000 6520000&#x60; (optional)
     * @param detaljniva Filtrer på veglenkens detaljnivå (kortnavn fra datakatalogen). Kommaseparert liste.   Eksempel: &#x60;VT,VTKB&#x60; (optional)
     * @param typeveg Filtrer veglenker på type veg. Kommaseparert liste.  Eksempel: &#x60;kanalisertVeg, enkelBilveg, rampe, rundkjøring, bilferje, passasjerferje, gangOgSykkelveg, sykkelveg, gangveg, gågate, fortau, trapp, gangfelt, gatetun, traktorveg, sti, annet&#x60; (optional)
     * @param superid Hent detaljerte veglenkesegmenter stedfestet på veglenkesekvens med denne IDen. (optional)
     * @param adskiltelop Filtrer på om veglenkesegmentene er stedfestet hvor det er en Strekning med verdi satt for «adskilte løp». (optional)
     * @param kryssystem Filtrer på om de er stedfestet på samme sted hvor det er et Kryssystem. (optional)
     * @param sideanlegg Filtrer på om de er stedfestet på samme sted hvor det er et Sideanlegg. (optional)
     * @param veglenketype Filtrer på veglenken sin veglenketype. Kommaseparert liste. (optional)
     * @param arm Filtrer veglenker på om de er stedfestet på en Strekning med verdi satt for «arm». (optional)
     * @param trafikantgruppe Filtrer på trafikantgruppe. (optional)
     * @param geometritoleranse Angir om det skal returneres en forenklet geometri. Dersom parameteren utelates, returneres full geometri. Nummeret angir distansetoleranse i meter for generering av forenklet geometri. (optional)
     * @param historisk For &#x60;false&#x60; returneres kun dagens veglenkesegmenter. For &#x60;true&#x60; returneres dagens og historiske veglenkesegmenter. Default er &#x60;false&#x60;. (optional)
     * @param tidspunkt Begrens spørring til det gitte tidspunktet. (optional)
     * @param antall Angir hvor mange objekter som skal returneres. Se også &#x60;sidestørrelse&#x60; i responsens &#x60;metadata&#x60;-objekt. (optional)
     * @param start Angir paginerings-start for objekter som skal returneres. Brukes sammen med &#x60;antall&#x60;. Neste start får man i metadata-feltet i responsen. Settes blankt for å starte fra begynnelsen. (optional)
     * @param inkluderAntall Hvorvidt totalt antall objekter skal returneres i responsen. Default er &#x60;false&#x60;. (optional)
     * @return VeglenkesegmenterSide
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun getVeglenkesegmenter(srid: SridGetVeglenkesegmenter? = null, ider: kotlin.collections.List<kotlin.Long>? = null, fylke: kotlin.collections.List<kotlin.Int>? = null, kommune: kotlin.collections.List<kotlin.Int>? = null, kontraktsomrade: kotlin.collections.List<kotlin.String>? = null, riksvegrute: kotlin.collections.List<kotlin.String>? = null, vegforvalter: kotlin.collections.List<kotlin.String>? = null, vegsystemreferanse: kotlin.collections.List<kotlin.String>? = null, kartutsnitt: kotlin.String? = null, polygon: kotlin.String? = null, detaljniva: kotlin.collections.List<DetaljnivaGetVeglenkesegmenter>? = null, typeveg: kotlin.collections.List<TypevegGetVeglenkesegmenter>? = null, superid: kotlin.Long? = null, adskiltelop: kotlin.collections.List<AdskiltelopGetVeglenkesegmenter>? = null, kryssystem: kotlin.Boolean? = null, sideanlegg: kotlin.Boolean? = null, veglenketype: kotlin.collections.List<VeglenketypeGetVeglenkesegmenter>? = null, arm: kotlin.Boolean? = null, trafikantgruppe: TrafikantgruppeGetVeglenkesegmenter? = null, geometritoleranse: kotlin.Int? = null, historisk: kotlin.Boolean? = null, tidspunkt: java.time.LocalDate? = null, antall: kotlin.Int? = null, start: kotlin.String? = null, inkluderAntall: kotlin.Boolean? = null): HttpResponse<VeglenkesegmenterSide> {

        val localVariableAuthNames = listOf<String>()

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        srid?.apply { localVariableQuery["srid"] = listOf("$srid") }
        ider?.apply { localVariableQuery["ider"] = toMultiValue(this, "multi") }
        fylke?.apply { localVariableQuery["fylke"] = toMultiValue(this, "multi") }
        kommune?.apply { localVariableQuery["kommune"] = toMultiValue(this, "multi") }
        kontraktsomrade?.apply { localVariableQuery["kontraktsomrade"] = toMultiValue(this, "multi") }
        riksvegrute?.apply { localVariableQuery["riksvegrute"] = toMultiValue(this, "multi") }
        vegforvalter?.apply { localVariableQuery["vegforvalter"] = toMultiValue(this, "multi") }
        vegsystemreferanse?.apply { localVariableQuery["vegsystemreferanse"] = toMultiValue(this, "multi") }
        kartutsnitt?.apply { localVariableQuery["kartutsnitt"] = listOf("$kartutsnitt") }
        polygon?.apply { localVariableQuery["polygon"] = listOf("$polygon") }
        detaljniva?.apply { localVariableQuery["detaljniva"] = toMultiValue(this, "multi") }
        typeveg?.apply { localVariableQuery["typeveg"] = toMultiValue(this, "multi") }
        superid?.apply { localVariableQuery["superid"] = listOf("$superid") }
        adskiltelop?.apply { localVariableQuery["adskiltelop"] = toMultiValue(this, "multi") }
        kryssystem?.apply { localVariableQuery["kryssystem"] = listOf("$kryssystem") }
        sideanlegg?.apply { localVariableQuery["sideanlegg"] = listOf("$sideanlegg") }
        veglenketype?.apply { localVariableQuery["veglenketype"] = toMultiValue(this, "multi") }
        arm?.apply { localVariableQuery["arm"] = listOf("$arm") }
        trafikantgruppe?.apply { localVariableQuery["trafikantgruppe"] = listOf("$trafikantgruppe") }
        geometritoleranse?.apply { localVariableQuery["geometritoleranse"] = listOf("$geometritoleranse") }
        historisk?.apply { localVariableQuery["historisk"] = listOf("$historisk") }
        tidspunkt?.apply { localVariableQuery["tidspunkt"] = listOf("$tidspunkt") }
        antall?.apply { localVariableQuery["antall"] = listOf("$antall") }
        start?.apply { localVariableQuery["start"] = listOf("$start") }
        inkluderAntall?.apply { localVariableQuery["inkluderAntall"] = listOf("$inkluderAntall") }
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/api/v4/veglenkesekvenser/segmentert",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }



    /**
     * enum for parameter srid
     */
    @Serializable
    enum class SridGetVeglenkesekvens(val value: kotlin.String) {
        
        @SerialName(value = "5972")
        _5972("5972"),
        
        @SerialName(value = "5973")
        _5973("5973"),
        
        @SerialName(value = "5975")
        _5975("5975"),
        
        @SerialName(value = "4326")
        _4326("4326"),
        
        @SerialName(value = "UTM32")
        uTM32("UTM32"),
        
        @SerialName(value = "UTM33")
        uTM33("UTM33"),
        
        @SerialName(value = "UTM35")
        uTM35("UTM35"),
        
        @SerialName(value = "WGS84")
        wGS84("WGS84")
        
    }

    /**
     * Hent en veglenkesekvens
     * 
     * @param veglenkesekvensId ID for veglenkesekvensen.
     * @param srid Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;. (optional)
     * @return Veglenkesekvens
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun getVeglenkesekvens(veglenkesekvensId: kotlin.Long, srid: SridGetVeglenkesekvens? = null): HttpResponse<Veglenkesekvens> {

        val localVariableAuthNames = listOf<String>()

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        srid?.apply { localVariableQuery["srid"] = listOf("$srid") }
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/api/v4/veglenkesekvenser/{veglenkesekvensId}".replace("{" + "veglenkesekvensId" + "}", "$veglenkesekvensId"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }



    /**
     * enum for parameter topologiniva
     */
    @Serializable
    enum class TopologinivaGetVeglenkesekvenser(val value: kotlin.String) {
        
        @SerialName(value = "kjørebane")
        kjørebane("kjørebane"),
        
        @SerialName(value = "kjørefelt")
        kjørefelt("kjørefelt"),
        
        @SerialName(value = "vegtrase")
        vegtrase("vegtrase")
        
    }


    /**
     * enum for parameter srid
     */
    @Serializable
    enum class SridGetVeglenkesekvenser(val value: kotlin.String) {
        
        @SerialName(value = "5972")
        _5972("5972"),
        
        @SerialName(value = "5973")
        _5973("5973"),
        
        @SerialName(value = "5975")
        _5975("5975"),
        
        @SerialName(value = "4326")
        _4326("4326"),
        
        @SerialName(value = "UTM32")
        uTM32("UTM32"),
        
        @SerialName(value = "UTM33")
        uTM33("UTM33"),
        
        @SerialName(value = "UTM35")
        uTM35("UTM35"),
        
        @SerialName(value = "WGS84")
        wGS84("WGS84")
        
    }

    /**
     * Hent veglenkesekvenser
     * 
     * @param ider Kommaseparert liste med IDer. (optional)
     * @param fylke Filtrer på fylke. Kommaseparert liste. Se [/omrader/api/v4/fylker](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der) for mulige verdier.  Eksempel: &#x60;50&#x60; (optional)
     * @param kommune Filtrer på kommune. Kommaseparert liste. Se [/omrader/api/v4/kommuner](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der) for mulige verdier.  Eksempel: &#x60;5001&#x60; (optional)
     * @param kontraktsomrade Filtrer på kontraktsomrade. Kommaseparert liste. Se [/omrader/api/v4/kontraktsomrader](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der) for mulige verdier.  Eksempel: &#x60;1539 Tunnel- og bergsikr 2018-2023 Nordm og Romsd&#x60; (optional)
     * @param riksvegrute Filtrer på riksvegrute. Kommaseparert liste. Se [/omrader/api/v4/riksvegruter](https://nvdbapiles.atlas.vegvesen.no/webjars/swagger-ui/index.html?urls.primaryName&#x3D;Omr%C3%A5der) for mulige verdier.  Eksempel: &#x60;RUTE4A&#x60; eller som enumid &#x60;20290&#x60; (optional)
     * @param vegsystemreferanse Filtrer på [vegsystemreferanse](https://nvdbapiles-v3.atlas.vegvesen.no/dokumentasjon/#vegsystemreferanse). Kommaseparert liste. Legg til kommunenummer i starten av vegsystemreferansen for å filtrere på område.  Eksempel: &#x60;EV6S1D1 m12&#x60; (optional)
     * @param topologiniva Hent kun elementer på det gitte topologinivået. - Dersom en veglenke har nivå vegtrasé er ofte feltet for topologinivå ikke tilstede. Man vil da få alle veglenker som ikke har verdi &#x60;kjørefelt&#x60; eller &#x60;kjørebane&#x60;. (optional)
     * @param superid Hent detaljerte veglenkesekvenser stedfestet på veglenkesekvens med denne IDen. (optional)
     * @param srid Angir hvilket geografisk referansesystem geometrien skal returneres i. Utdata i UTM-formater begrenses til 3 desimaler, 4326/WGS84 begrenses til 8 desimaler. Mer informasjon: &lt;a href&#x3D;&#39;https://epsg.io/5972&#39;&gt;EPSG:5972&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5973&#39;&gt;EPSG:5973&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/5975&#39;&gt;EPSG:5975&lt;/a&gt; &lt;a href&#x3D;&#39;https://epsg.io/4326&#39;&gt;EPSG:4326&lt;/a&gt;. (optional)
     * @param antall Angir hvor mange objekter som skal returneres. Se også &#x60;sidestørrelse&#x60; i responsens &#x60;metadata&#x60;-objekt. (optional)
     * @param start Angir paginerings-start for objekter som skal returneres. Brukes sammen med &#x60;antall&#x60;. Neste start får man i metadata-feltet i responsen. Settes blankt for å starte fra begynnelsen. (optional)
     * @param inkluderAntall Hvorvidt totalt antall objekter skal returneres i responsen. Default er &#x60;false&#x60;. (optional)
     * @return VeglenkesekvenserSide
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun getVeglenkesekvenser(ider: kotlin.collections.List<kotlin.Long>? = null, fylke: kotlin.collections.List<kotlin.Int>? = null, kommune: kotlin.collections.List<kotlin.Int>? = null, kontraktsomrade: kotlin.collections.List<kotlin.String>? = null, riksvegrute: kotlin.collections.List<kotlin.String>? = null, vegsystemreferanse: kotlin.collections.List<kotlin.String>? = null, topologiniva: TopologinivaGetVeglenkesekvenser? = null, superid: kotlin.Long? = null, srid: SridGetVeglenkesekvenser? = null, antall: kotlin.Int? = null, start: kotlin.String? = null, inkluderAntall: kotlin.Boolean? = null): HttpResponse<VeglenkesekvenserSide> {

        val localVariableAuthNames = listOf<String>()

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        ider?.apply { localVariableQuery["ider"] = toMultiValue(this, "multi") }
        fylke?.apply { localVariableQuery["fylke"] = toMultiValue(this, "multi") }
        kommune?.apply { localVariableQuery["kommune"] = toMultiValue(this, "multi") }
        kontraktsomrade?.apply { localVariableQuery["kontraktsomrade"] = toMultiValue(this, "multi") }
        riksvegrute?.apply { localVariableQuery["riksvegrute"] = toMultiValue(this, "multi") }
        vegsystemreferanse?.apply { localVariableQuery["vegsystemreferanse"] = toMultiValue(this, "multi") }
        topologiniva?.apply { localVariableQuery["topologiniva"] = listOf("$topologiniva") }
        superid?.apply { localVariableQuery["superid"] = listOf("$superid") }
        srid?.apply { localVariableQuery["srid"] = listOf("$srid") }
        antall?.apply { localVariableQuery["antall"] = listOf("$antall") }
        start?.apply { localVariableQuery["start"] = listOf("$start") }
        inkluderAntall?.apply { localVariableQuery["inkluderAntall"] = listOf("$inkluderAntall") }
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.GET,
            "/api/v4/veglenkesekvenser",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }


}
