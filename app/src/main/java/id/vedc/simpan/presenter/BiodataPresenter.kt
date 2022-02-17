package id.vedc.simpan.presenter

import android.util.Log
import id.vedc.simpan.model.info_pribadi.Biodata.BioView
import id.vedc.simpan.model.info_pribadi.Biodata.ResultBio
import id.vedc.simpan.network.NetworkConfig
import retrofit2.Call
import retrofit2.Response

class BiodataPresenter(val bioView: BioView) {
    fun getData(){
        NetworkConfig.getService().getData()
            .enqueue(object : retrofit2.Callback<ResultBio>{
                override fun onFailure(call: Call<ResultBio>, t: Throwable) {
                    bioView.onFailedGet(t.localizedMessage)
                    Log.d("Error", "Error Data")
                }

                override fun onResponse(call: Call<ResultBio>, response: Response<ResultBio>) {
                    if(response.isSuccessful){
                        val status = response.body()?.status
                        if (status == 200){
                            val data = response.body()?.result
                            bioView.onSuccessGet(data)
                        } else{
                            bioView.onFailedGet("Error $status")
                        }
                    }
                }

            })
    }
}