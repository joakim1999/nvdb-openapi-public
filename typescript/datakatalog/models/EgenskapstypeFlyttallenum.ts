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
import type { Egenskapstype } from './Egenskapstype'
import {
  EgenskapstypeFromJSON,
  EgenskapstypeFromJSONTyped,
  EgenskapstypeToJSON,
} from './Egenskapstype'
import type { EgenskapstypeEnum } from './EgenskapstypeEnum'
import {
  EgenskapstypeEnumFromJSON,
  EgenskapstypeEnumFromJSONTyped,
  EgenskapstypeEnumToJSON,
} from './EgenskapstypeEnum'
import type { Enhet } from './Enhet'
import { EnhetFromJSON, EnhetFromJSONTyped, EnhetToJSON } from './Enhet'
import type { EnumverdiFlyttall } from './EnumverdiFlyttall'
import {
  EnumverdiFlyttallFromJSON,
  EnumverdiFlyttallFromJSONTyped,
  EnumverdiFlyttallToJSON,
} from './EnumverdiFlyttall'
import type { Viktighet } from './Viktighet'
import {
  ViktighetFromJSON,
  ViktighetFromJSONTyped,
  ViktighetToJSON,
} from './Viktighet'

/**
 *
 * @export
 * @interface EgenskapstypeFlyttallenum
 */
export interface EgenskapstypeFlyttallenum extends Egenskapstype {
  /**
   *
   * @type {Date}
   * @memberof EgenskapstypeFlyttallenum
   */
  objektlisteDato?: Date
  /**
   *
   * @type {Date}
   * @memberof EgenskapstypeFlyttallenum
   */
  sluttDato?: Date
  /**
   *
   * @type {boolean}
   * @memberof EgenskapstypeFlyttallenum
   */
  lengdeavhengigVerdi: boolean
  /**
   *
   * @type {boolean}
   * @memberof EgenskapstypeFlyttallenum
   */
  ajourholdSnu: boolean
  /**
   *
   * @type {number}
   * @memberof EgenskapstypeFlyttallenum
   */
  standardverdi?: number
  /**
   *
   * @type {number}
   * @memberof EgenskapstypeFlyttallenum
   */
  minAnbefalt?: number
  /**
   *
   * @type {number}
   * @memberof EgenskapstypeFlyttallenum
   */
  maksAnbefalt?: number
  /**
   *
   * @type {number}
   * @memberof EgenskapstypeFlyttallenum
   */
  min?: number
  /**
   *
   * @type {number}
   * @memberof EgenskapstypeFlyttallenum
   */
  maks?: number
  /**
   *
   * @type {number}
   * @memberof EgenskapstypeFlyttallenum
   */
  desimaler?: number
  /**
   *
   * @type {number}
   * @memberof EgenskapstypeFlyttallenum
   */
  feltlengde?: number
  /**
   *
   * @type {boolean}
   * @memberof EgenskapstypeFlyttallenum
   */
  fortegnsendringSnu: boolean
  /**
   *
   * @type {Enhet}
   * @memberof EgenskapstypeFlyttallenum
   */
  enhet?: Enhet
  /**
   *
   * @type {Array<EnumverdiFlyttall>}
   * @memberof EgenskapstypeFlyttallenum
   */
  tillatteVerdier: Array<EnumverdiFlyttall>
}

/**
 * Check if a given object implements the EgenskapstypeFlyttallenum interface.
 */
export function instanceOfEgenskapstypeFlyttallenum(value: object): boolean {
  let isInstance = true
  isInstance = isInstance && 'lengdeavhengigVerdi' in value
  isInstance = isInstance && 'ajourholdSnu' in value
  isInstance = isInstance && 'fortegnsendringSnu' in value
  isInstance = isInstance && 'tillatteVerdier' in value

  return isInstance
}

export function EgenskapstypeFlyttallenumFromJSON(
  json: any,
): EgenskapstypeFlyttallenum {
  return EgenskapstypeFlyttallenumFromJSONTyped(json, false)
}

export function EgenskapstypeFlyttallenumFromJSONTyped(
  json: any,
  ignoreDiscriminator: boolean,
): EgenskapstypeFlyttallenum {
  if (json === undefined || json === null) {
    return json
  }
  return {
    ...EgenskapstypeFromJSONTyped(json, ignoreDiscriminator),
    objektlisteDato: !exists(json, 'objektliste_dato')
      ? undefined
      : new Date(json['objektliste_dato']),
    sluttDato: !exists(json, 'slutt_dato')
      ? undefined
      : new Date(json['slutt_dato']),
    lengdeavhengigVerdi: json['lengdeavhengig_verdi'],
    ajourholdSnu: json['ajourhold_snu'],
    standardverdi: !exists(json, 'standardverdi')
      ? undefined
      : json['standardverdi'],
    minAnbefalt: !exists(json, 'min_anbefalt')
      ? undefined
      : json['min_anbefalt'],
    maksAnbefalt: !exists(json, 'maks_anbefalt')
      ? undefined
      : json['maks_anbefalt'],
    min: !exists(json, 'min') ? undefined : json['min'],
    maks: !exists(json, 'maks') ? undefined : json['maks'],
    desimaler: !exists(json, 'desimaler') ? undefined : json['desimaler'],
    feltlengde: !exists(json, 'feltlengde') ? undefined : json['feltlengde'],
    fortegnsendringSnu: json['fortegnsendring_snu'],
    enhet: !exists(json, 'enhet') ? undefined : EnhetFromJSON(json['enhet']),
    tillatteVerdier: (json['tillatte_verdier'] as Array<any>).map(
      EnumverdiFlyttallFromJSON,
    ),
  }
}

export function EgenskapstypeFlyttallenumToJSON(
  value?: EgenskapstypeFlyttallenum | null,
): any {
  if (value === undefined) {
    return undefined
  }
  if (value === null) {
    return null
  }
  return {
    ...EgenskapstypeToJSON(value),
    objektliste_dato:
      value.objektlisteDato === undefined
        ? undefined
        : value.objektlisteDato.toISOString().substring(0, 10),
    slutt_dato:
      value.sluttDato === undefined
        ? undefined
        : value.sluttDato.toISOString().substring(0, 10),
    lengdeavhengig_verdi: value.lengdeavhengigVerdi,
    ajourhold_snu: value.ajourholdSnu,
    standardverdi: value.standardverdi,
    min_anbefalt: value.minAnbefalt,
    maks_anbefalt: value.maksAnbefalt,
    min: value.min,
    maks: value.maks,
    desimaler: value.desimaler,
    feltlengde: value.feltlengde,
    fortegnsendring_snu: value.fortegnsendringSnu,
    enhet: EnhetToJSON(value.enhet),
    tillatte_verdier: (value.tillatteVerdier as Array<any>).map(
      EnumverdiFlyttallToJSON,
    ),
  }
}
