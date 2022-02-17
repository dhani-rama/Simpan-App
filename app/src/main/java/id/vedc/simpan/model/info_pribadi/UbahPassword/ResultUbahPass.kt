package id.vedc.simpan.model.info_pribadi.UbahPassword

import com.google.gson.annotations.SerializedName

data class ResultUbahPass (

    @field:SerializedName("message")
    val message: String? = null,

    @field:SerializedName("status")
    val status: Int? = null
)