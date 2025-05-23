/*
 * NVDB Datakatalog API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package no.vegvesen.nvdb.datakatalog.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.LocalDate;
import no.vegvesen.nvdb.datakatalog.model.Egenskapstype;
import no.vegvesen.nvdb.datakatalog.model.EgenskapstypeEnum;
import no.vegvesen.nvdb.datakatalog.model.Viktighet;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * EgenskapstypeTid
 */
@JsonPropertyOrder({
  EgenskapstypeTid.JSON_PROPERTY_OBJEKTLISTE_DATO,
  EgenskapstypeTid.JSON_PROPERTY_SLUTT_DATO,
  EgenskapstypeTid.JSON_PROPERTY_LENGDEAVHENGIG_VERDI,
  EgenskapstypeTid.JSON_PROPERTY_AJOURHOLD_SNU,
  EgenskapstypeTid.JSON_PROPERTY_STANDARDVERDI,
  EgenskapstypeTid.JSON_PROPERTY_MIN_ANBEFALT,
  EgenskapstypeTid.JSON_PROPERTY_MAKS_ANBEFALT,
  EgenskapstypeTid.JSON_PROPERTY_FELTMøNSTER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
@JsonIgnoreProperties(
  value = "egenskapstype", // ignore manually set egenskapstype, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the egenskapstype to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "egenskapstype", visible = true)

public class EgenskapstypeTid extends Egenskapstype {
  public static final String JSON_PROPERTY_OBJEKTLISTE_DATO = "objektliste_dato";
  private LocalDate objektlisteDato;

  public static final String JSON_PROPERTY_SLUTT_DATO = "slutt_dato";
  private LocalDate sluttDato;

  public static final String JSON_PROPERTY_LENGDEAVHENGIG_VERDI = "lengdeavhengig_verdi";
  private Boolean lengdeavhengigVerdi;

  public static final String JSON_PROPERTY_AJOURHOLD_SNU = "ajourhold_snu";
  private Boolean ajourholdSnu;

  public static final String JSON_PROPERTY_STANDARDVERDI = "standardverdi";
  private String standardverdi;

  public static final String JSON_PROPERTY_MIN_ANBEFALT = "min_anbefalt";
  private String minAnbefalt;

  public static final String JSON_PROPERTY_MAKS_ANBEFALT = "maks_anbefalt";
  private String maksAnbefalt;

  public static final String JSON_PROPERTY_FELTMøNSTER = "feltmønster";
  private String feltmønster;

  public EgenskapstypeTid() {

  }

  public EgenskapstypeTid objektlisteDato(LocalDate objektlisteDato) {
    
    this.objektlisteDato = objektlisteDato;
    return this;
  }

   /**
   * Get objektlisteDato
   * @return objektlisteDato
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OBJEKTLISTE_DATO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getObjektlisteDato() {
    return objektlisteDato;
  }


  @JsonProperty(JSON_PROPERTY_OBJEKTLISTE_DATO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setObjektlisteDato(LocalDate objektlisteDato) {
    this.objektlisteDato = objektlisteDato;
  }


  public EgenskapstypeTid sluttDato(LocalDate sluttDato) {
    
    this.sluttDato = sluttDato;
    return this;
  }

   /**
   * Get sluttDato
   * @return sluttDato
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SLUTT_DATO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getSluttDato() {
    return sluttDato;
  }


  @JsonProperty(JSON_PROPERTY_SLUTT_DATO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSluttDato(LocalDate sluttDato) {
    this.sluttDato = sluttDato;
  }


  public EgenskapstypeTid lengdeavhengigVerdi(Boolean lengdeavhengigVerdi) {
    
    this.lengdeavhengigVerdi = lengdeavhengigVerdi;
    return this;
  }

   /**
   * Get lengdeavhengigVerdi
   * @return lengdeavhengigVerdi
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LENGDEAVHENGIG_VERDI)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getLengdeavhengigVerdi() {
    return lengdeavhengigVerdi;
  }


  @JsonProperty(JSON_PROPERTY_LENGDEAVHENGIG_VERDI)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLengdeavhengigVerdi(Boolean lengdeavhengigVerdi) {
    this.lengdeavhengigVerdi = lengdeavhengigVerdi;
  }


  public EgenskapstypeTid ajourholdSnu(Boolean ajourholdSnu) {
    
    this.ajourholdSnu = ajourholdSnu;
    return this;
  }

   /**
   * Get ajourholdSnu
   * @return ajourholdSnu
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AJOURHOLD_SNU)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getAjourholdSnu() {
    return ajourholdSnu;
  }


  @JsonProperty(JSON_PROPERTY_AJOURHOLD_SNU)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAjourholdSnu(Boolean ajourholdSnu) {
    this.ajourholdSnu = ajourholdSnu;
  }


  public EgenskapstypeTid standardverdi(String standardverdi) {
    
    this.standardverdi = standardverdi;
    return this;
  }

   /**
   * Get standardverdi
   * @return standardverdi
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STANDARDVERDI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStandardverdi() {
    return standardverdi;
  }


  @JsonProperty(JSON_PROPERTY_STANDARDVERDI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStandardverdi(String standardverdi) {
    this.standardverdi = standardverdi;
  }


  public EgenskapstypeTid minAnbefalt(String minAnbefalt) {
    
    this.minAnbefalt = minAnbefalt;
    return this;
  }

   /**
   * Get minAnbefalt
   * @return minAnbefalt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MIN_ANBEFALT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMinAnbefalt() {
    return minAnbefalt;
  }


  @JsonProperty(JSON_PROPERTY_MIN_ANBEFALT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinAnbefalt(String minAnbefalt) {
    this.minAnbefalt = minAnbefalt;
  }


  public EgenskapstypeTid maksAnbefalt(String maksAnbefalt) {
    
    this.maksAnbefalt = maksAnbefalt;
    return this;
  }

   /**
   * Get maksAnbefalt
   * @return maksAnbefalt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAKS_ANBEFALT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMaksAnbefalt() {
    return maksAnbefalt;
  }


  @JsonProperty(JSON_PROPERTY_MAKS_ANBEFALT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaksAnbefalt(String maksAnbefalt) {
    this.maksAnbefalt = maksAnbefalt;
  }


  public EgenskapstypeTid feltmønster(String feltmønster) {
    
    this.feltmønster = feltmønster;
    return this;
  }

   /**
   * Get feltmønster
   * @return feltmønster
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FELTMøNSTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFeltmønster() {
    return feltmønster;
  }


  @JsonProperty(JSON_PROPERTY_FELTMøNSTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFeltmønster(String feltmønster) {
    this.feltmønster = feltmønster;
  }

  @Override
  public EgenskapstypeTid id(Integer id) {
    this.setId(id);
    return this;
  }

  @Override
  public EgenskapstypeTid navn(String navn) {
    this.setNavn(navn);
    return this;
  }

  @Override
  public EgenskapstypeTid egenskapstype(EgenskapstypeEnum egenskapstype) {
    this.setEgenskapstype(egenskapstype);
    return this;
  }

  @Override
  public EgenskapstypeTid komplementærEgenskapstype(Integer komplementærEgenskapstype) {
    this.setKomplementærEgenskapstype(komplementærEgenskapstype);
    return this;
  }

  @Override
  public EgenskapstypeTid kortnavn(String kortnavn) {
    this.setKortnavn(kortnavn);
    return this;
  }

  @Override
  public EgenskapstypeTid beskrivelse(String beskrivelse) {
    this.setBeskrivelse(beskrivelse);
    return this;
  }

  @Override
  public EgenskapstypeTid sosinavn(String sosinavn) {
    this.setSosinavn(sosinavn);
    return this;
  }

  @Override
  public EgenskapstypeTid sosinvdbnavn(String sosinvdbnavn) {
    this.setSosinvdbnavn(sosinvdbnavn);
    return this;
  }

  @Override
  public EgenskapstypeTid sorteringsnummer(Integer sorteringsnummer) {
    this.setSorteringsnummer(sorteringsnummer);
    return this;
  }

  @Override
  public EgenskapstypeTid avledet(Boolean avledet) {
    this.setAvledet(avledet);
    return this;
  }

  @Override
  public EgenskapstypeTid obligatoriskVerdi(Boolean obligatoriskVerdi) {
    this.setObligatoriskVerdi(obligatoriskVerdi);
    return this;
  }

  @Override
  public EgenskapstypeTid skrivebeskyttet(Boolean skrivebeskyttet) {
    this.setSkrivebeskyttet(skrivebeskyttet);
    return this;
  }

  @Override
  public EgenskapstypeTid sensitivitet(Integer sensitivitet) {
    this.setSensitivitet(sensitivitet);
    return this;
  }

  @Override
  public EgenskapstypeTid gruppesorteringsnummer(Integer gruppesorteringsnummer) {
    this.setGruppesorteringsnummer(gruppesorteringsnummer);
    return this;
  }

  @Override
  public EgenskapstypeTid veiledning(String veiledning) {
    this.setVeiledning(veiledning);
    return this;
  }

  @Override
  public EgenskapstypeTid grunnrissreferanse(String grunnrissreferanse) {
    this.setGrunnrissreferanse(grunnrissreferanse);
    return this;
  }

  @Override
  public EgenskapstypeTid høydereferanse(String høydereferanse) {
    this.setHøydereferanse(høydereferanse);
    return this;
  }

  @Override
  public EgenskapstypeTid høydereferanseTall(Integer høydereferanseTall) {
    this.setHøydereferanseTall(høydereferanseTall);
    return this;
  }

  @Override
  public EgenskapstypeTid nøyaktighetskravGrunnriss(Double nøyaktighetskravGrunnriss) {
    this.setNøyaktighetskravGrunnriss(nøyaktighetskravGrunnriss);
    return this;
  }

  @Override
  public EgenskapstypeTid nøyaktighetskravHøyde(Double nøyaktighetskravHøyde) {
    this.setNøyaktighetskravHøyde(nøyaktighetskravHøyde);
    return this;
  }

  @Override
  public EgenskapstypeTid sosiReferanse(String sosiReferanse) {
    this.setSosiReferanse(sosiReferanse);
    return this;
  }

  @Override
  public EgenskapstypeTid referansegeometriTilstrekkelig(Boolean referansegeometriTilstrekkelig) {
    this.setReferansegeometriTilstrekkelig(referansegeometriTilstrekkelig);
    return this;
  }

  @Override
  public EgenskapstypeTid viktighet(Viktighet viktighet) {
    this.setViktighet(viktighet);
    return this;
  }

  @Override
  public EgenskapstypeTid kategori(Integer kategori) {
    this.setKategori(kategori);
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EgenskapstypeTid egenskapstypeTid = (EgenskapstypeTid) o;
    return Objects.equals(this.objektlisteDato, egenskapstypeTid.objektlisteDato) &&
        Objects.equals(this.sluttDato, egenskapstypeTid.sluttDato) &&
        Objects.equals(this.lengdeavhengigVerdi, egenskapstypeTid.lengdeavhengigVerdi) &&
        Objects.equals(this.ajourholdSnu, egenskapstypeTid.ajourholdSnu) &&
        Objects.equals(this.standardverdi, egenskapstypeTid.standardverdi) &&
        Objects.equals(this.minAnbefalt, egenskapstypeTid.minAnbefalt) &&
        Objects.equals(this.maksAnbefalt, egenskapstypeTid.maksAnbefalt) &&
        Objects.equals(this.feltmønster, egenskapstypeTid.feltmønster) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objektlisteDato, sluttDato, lengdeavhengigVerdi, ajourholdSnu, standardverdi, minAnbefalt, maksAnbefalt, feltmønster, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EgenskapstypeTid {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    objektlisteDato: ").append(toIndentedString(objektlisteDato)).append("\n");
    sb.append("    sluttDato: ").append(toIndentedString(sluttDato)).append("\n");
    sb.append("    lengdeavhengigVerdi: ").append(toIndentedString(lengdeavhengigVerdi)).append("\n");
    sb.append("    ajourholdSnu: ").append(toIndentedString(ajourholdSnu)).append("\n");
    sb.append("    standardverdi: ").append(toIndentedString(standardverdi)).append("\n");
    sb.append("    minAnbefalt: ").append(toIndentedString(minAnbefalt)).append("\n");
    sb.append("    maksAnbefalt: ").append(toIndentedString(maksAnbefalt)).append("\n");
    sb.append("    feltmønster: ").append(toIndentedString(feltmønster)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

