package id.vedc.simpan.network

import id.vedc.simpan.model.dataPegawai
import id.vedc.simpan.model.info_pribadi.Biodata.ResultBio
import id.vedc.simpan.model.info_pribadi.UbahPassword.ResultUbahPass
import id.vedc.simpan.model.login.ResultLogin
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface NetworkService {
    @FormUrlEncoded
    @POST("login.php")
    fun login(@Field("nip") nip : String?,
              @Field("id") id: String?) : Call<ResultLogin>

    @GET("read.php")
    fun getData(): Call<ResultBio>

    //------------- fitur ubah password----------------
    @GET("update.php")
    fun updatePegawai(@Field("id_pegawai") idPegawai: String?,
                      @Field("password") password: String?): Call<ResultUbahPass>


}