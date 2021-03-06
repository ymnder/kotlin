// !LANGUAGE: +AllowContractsForCustomFunctions +ReadDeserializedContracts
@file:Suppress("INVISIBLE_MEMBER", "INVISIBLE_REFERENCE")

package test

import kotlin.internal.contracts.*

fun Any?.isNotNull(): Boolean {
    contract {
        returns(true) implies (this@isNotNull != null)
    }
    return this != null
}