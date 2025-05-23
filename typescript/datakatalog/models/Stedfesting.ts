/* tslint:disable */
/* eslint-disable */
/**
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

import { exists, mapValues } from '../runtime'
import type { EgenskapstypeEnum } from './EgenskapstypeEnum'
import {
  EgenskapstypeEnumFromJSON,
  EgenskapstypeEnumFromJSONTyped,
  EgenskapstypeEnumToJSON,
} from './EgenskapstypeEnum'
import type { Viktighet } from './Viktighet'
import {
  ViktighetFromJSON,
  ViktighetFromJSONTyped,
  ViktighetToJSON,
} from './Viktighet'

import {
  StedfestingListeFromJSONTyped,
  StedfestingEnkelFromJSONTyped,
} from './index'

/**
 *
 * @export
 * @interface Stedfesting
 */
export interface Stedfesting {
  /**
   *
   * @type {number}
   * @memberof Stedfesting
   */
  id: number
  /**
   *
   * @type {string}
   * @memberof Stedfesting
   */
  navn?: string
  /**
   *
   * @type {EgenskapstypeEnum}
   * @memberof Stedfesting
   */
  egenskapstype: EgenskapstypeEnum
  /**
   *
   * @type {boolean}
   * @memberof Stedfesting
   */
  obligatoriskVerdi: boolean
  /**
   *
   * @type {boolean}
   * @memberof Stedfesting
   */
  skrivebeskyttet: boolean
  /**
   *
   * @type {number}
   * @memberof Stedfesting
   */
  sensitivitet: number
  /**
   *
   * @type {number}
   * @memberof Stedfesting
   */
  gruppesorteringsnummer?: number
  /**
   *
   * @type {string}
   * @memberof Stedfesting
   */
  veiledning?: string
  /**
   *
   * @type {string}
   * @memberof Stedfesting
   */
  grunnrissreferanse?: string
  /**
   *
   * @type {string}
   * @memberof Stedfesting
   */
  hydereferanse?: string
  /**
   *
   * @type {number}
   * @memberof Stedfesting
   */
  hydereferanseTall: number
  /**
   *
   * @type {number}
   * @memberof Stedfesting
   */
  nyaktighetskravGrunnriss: number
  /**
   *
   * @type {number}
   * @memberof Stedfesting
   */
  nyaktighetskravHyde: number
  /**
   *
   * @type {string}
   * @memberof Stedfesting
   */
  sosiReferanse?: string
  /**
   *
   * @type {boolean}
   * @memberof Stedfesting
   */
  referansegeometriTilstrekkelig: boolean
  /**
   *
   * @type {Viktighet}
   * @memberof Stedfesting
   */
  viktighet: Viktighet
  /**
   *
   * @type {number}
   * @memberof Stedfesting
   */
  kategori: number
  /**
   *
   * @type {number}
   * @memberof Stedfesting
   */
  komplementrEgenskapstype?: number
  /**
   *
   * @type {string}
   * @memberof Stedfesting
   */
  kortnavn?: string
  /**
   *
   * @type {string}
   * @memberof Stedfesting
   */
  beskrivelse?: string
  /**
   *
   * @type {string}
   * @memberof Stedfesting
   */
  sosinavn?: string
  /**
   *
   * @type {string}
   * @memberof Stedfesting
   */
  sosinvdbnavn?: string
  /**
   *
   * @type {number}
   * @memberof Stedfesting
   */
  sorteringsnummer: number
  /**
   *
   * @type {boolean}
   * @memberof Stedfesting
   */
  avledet: boolean
}

/**
 * Check if a given object implements the Stedfesting interface.
 */
export function instanceOfStedfesting(value: object): boolean {
  let isInstance = true
  isInstance = isInstance && 'id' in value
  isInstance = isInstance && 'egenskapstype' in value
  isInstance = isInstance && 'obligatoriskVerdi' in value
  isInstance = isInstance && 'skrivebeskyttet' in value
  isInstance = isInstance && 'sensitivitet' in value
  isInstance = isInstance && 'hydereferanseTall' in value
  isInstance = isInstance && 'nyaktighetskravGrunnriss' in value
  isInstance = isInstance && 'nyaktighetskravHyde' in value
  isInstance = isInstance && 'referansegeometriTilstrekkelig' in value
  isInstance = isInstance && 'viktighet' in value
  isInstance = isInstance && 'kategori' in value
  isInstance = isInstance && 'sorteringsnummer' in value
  isInstance = isInstance && 'avledet' in value

  return isInstance
}

export function StedfestingFromJSON(json: any): Stedfesting {
  return StedfestingFromJSONTyped(json, false)
}

export function StedfestingFromJSONTyped(
  json: any,
  ignoreDiscriminator: boolean,
): Stedfesting {
  if (json === undefined || json === null) {
    return json
  }
  if (!ignoreDiscriminator) {
    if (json['egenskapstype'] === 'Liste') {
      return StedfestingListeFromJSONTyped(json, true)
    }
    if (json['egenskapstype'] === 'Stedfesting') {
      return StedfestingEnkelFromJSONTyped(json, true)
    }
  }
  return {
    id: json['id'],
    navn: !exists(json, 'navn') ? undefined : json['navn'],
    egenskapstype: EgenskapstypeEnumFromJSON(json['egenskapstype']),
    obligatoriskVerdi: json['obligatorisk_verdi'],
    skrivebeskyttet: json['skrivebeskyttet'],
    sensitivitet: json['sensitivitet'],
    gruppesorteringsnummer: !exists(json, 'gruppesorteringsnummer')
      ? undefined
      : json['gruppesorteringsnummer'],
    veiledning: !exists(json, 'veiledning') ? undefined : json['veiledning'],
    grunnrissreferanse: !exists(json, 'grunnrissreferanse')
      ? undefined
      : json['grunnrissreferanse'],
    hydereferanse: !exists(json, 'høydereferanse')
      ? undefined
      : json['høydereferanse'],
    hydereferanseTall: json['høydereferanse_tall'],
    nyaktighetskravGrunnriss: json['nøyaktighetskrav_grunnriss'],
    nyaktighetskravHyde: json['nøyaktighetskrav_høyde'],
    sosiReferanse: !exists(json, 'sosi_referanse')
      ? undefined
      : json['sosi_referanse'],
    referansegeometriTilstrekkelig: json['referansegeometri_tilstrekkelig'],
    viktighet: ViktighetFromJSON(json['viktighet']),
    kategori: json['kategori'],
    komplementrEgenskapstype: !exists(json, 'komplementær_egenskapstype')
      ? undefined
      : json['komplementær_egenskapstype'],
    kortnavn: !exists(json, 'kortnavn') ? undefined : json['kortnavn'],
    beskrivelse: !exists(json, 'beskrivelse') ? undefined : json['beskrivelse'],
    sosinavn: !exists(json, 'sosinavn') ? undefined : json['sosinavn'],
    sosinvdbnavn: !exists(json, 'sosinvdbnavn')
      ? undefined
      : json['sosinvdbnavn'],
    sorteringsnummer: json['sorteringsnummer'],
    avledet: json['avledet'],
  }
}

export function StedfestingToJSON(value?: Stedfesting | null): any {
  if (value === undefined) {
    return undefined
  }
  if (value === null) {
    return null
  }
  return {
    id: value.id,
    navn: value.navn,
    egenskapstype: EgenskapstypeEnumToJSON(value.egenskapstype),
    obligatorisk_verdi: value.obligatoriskVerdi,
    skrivebeskyttet: value.skrivebeskyttet,
    sensitivitet: value.sensitivitet,
    gruppesorteringsnummer: value.gruppesorteringsnummer,
    veiledning: value.veiledning,
    grunnrissreferanse: value.grunnrissreferanse,
    høydereferanse: value.hydereferanse,
    høydereferanse_tall: value.hydereferanseTall,
    nøyaktighetskrav_grunnriss: value.nyaktighetskravGrunnriss,
    nøyaktighetskrav_høyde: value.nyaktighetskravHyde,
    sosi_referanse: value.sosiReferanse,
    referansegeometri_tilstrekkelig: value.referansegeometriTilstrekkelig,
    viktighet: ViktighetToJSON(value.viktighet),
    kategori: value.kategori,
    komplementær_egenskapstype: value.komplementrEgenskapstype,
    kortnavn: value.kortnavn,
    beskrivelse: value.beskrivelse,
    sosinavn: value.sosinavn,
    sosinvdbnavn: value.sosinvdbnavn,
    sorteringsnummer: value.sorteringsnummer,
    avledet: value.avledet,
  }
}
