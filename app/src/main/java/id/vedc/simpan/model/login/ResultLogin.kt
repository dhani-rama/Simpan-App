package id.vedc.simpan.model.login

import com.google.gson.annotations.SerializedName
import id.vedc.simpan.dataPegawai1


data class ResultLogin(
    @field:SerializedName("pegawai")
    val dataLogin: dataPegawai1? = null,
    @field:SerializedName("message")
    val message: String? = null,
    @field:SerializedName("status")
    val status: Int? = null
)