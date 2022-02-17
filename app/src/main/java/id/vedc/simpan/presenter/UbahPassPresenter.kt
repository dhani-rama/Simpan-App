package id.vedc.simpan.presenter

import id.vedc.simpan.model.info_pribadi.UbahPassword.ResultUbahPass
import id.vedc.simpan.model.info_pribadi.UbahPassword.UpdatePassView
import id.vedc.simpan.network.NetworkConfig
import retrofit2.Call
import retrofit2.Response

class UbahPassPresenter(val updatePassView : UpdatePassView) {
    fun updatePegawai(idPegawai: String, password: String){
        NetworkConfig.getService()
            .updatePegawai(idPegawai, password)
            .enqueue(object : retrofit2.Callback<ResultUbahPass>{
                override fun onFailure(call: Call<ResultUbahPass>, t: Throwable) {
                    updatePassView.onErrorUpdate(t.localizedMessage)
                }

                override fun onResponse(call: Call<ResultUbahPass>, response: Response<ResultUbahPass>) {
                    if (response.isSuccessful && response.body()?.status == 200){
                        updatePassView.onSuccessUpdate(response.body()?.message ?: "")
                    }else{
                        updatePassView.onErrorUpdate(response.body()?.message ?: "")
                    }

                }

            })
    }
}