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

/**
 *
 * @export
 */
export const EgenskapstypeEnum = {
  Assosiasjon: 'Assosiasjon',
  Boolsk: 'Boolsk',
  Binr: 'Binær',
  Tekst: 'Tekst',
  Dato: 'Dato',
  Flyttall: 'Flyttall',
  Heltall: 'Heltall',
  Struktur: 'Struktur',
  Geometri: 'Geometri',
  Stedfesting: 'Stedfesting',
  Kortdato: 'Kortdato',
  Tid: 'Tid',
  Liste: 'Liste',
  Tekstenum: 'Tekstenum',
  Heltallenum: 'Heltallenum',
  Flyttallenum: 'Flyttallenum',
} as const
export type EgenskapstypeEnum =
  (typeof EgenskapstypeEnum)[keyof typeof EgenskapstypeEnum]

export function EgenskapstypeEnumFromJSON(json: any): EgenskapstypeEnum {
  return EgenskapstypeEnumFromJSONTyped(json, false)
}

export function EgenskapstypeEnumFromJSONTyped(
  json: any,
  ignoreDiscriminator: boolean,
): EgenskapstypeEnum {
  return json as EgenskapstypeEnum
}

export function EgenskapstypeEnumToJSON(value?: EgenskapstypeEnum | null): any {
  return value as any
}
