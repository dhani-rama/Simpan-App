package id.vedc.simpan.model.info_pribadi.Biodata

import com.google.gson.annotations.SerializedName
import id.vedc.simpan.dataPegawai1


data class ResultBio(

    @field:SerializedName("result")
    val result: List<dataPegawai1?>? = null,

    @field:SerializedName("message")
    val message: String? = null,

    @field:SerializedName("status")
    val status: Int? = null
)