package ru.potemkin.bookshelfapp

import com.google.gson.annotations.SerializedName


data class ListPrice (

  @SerializedName("amountInMicros" ) var amountInMicros : Int?    = null,
  @SerializedName("currencyCode"   ) var currencyCode   : String? = null

)