package id.vedc.simpan.presenter

import id.vedc.simpan.model.login.LoginView
import id.vedc.simpan.model.login.ResultLogin
import id.vedc.simpan.network.NetworkConfig
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LoginPresenter (val loginView: LoginView) {
    fun login(nip : String?, id : String?){
        NetworkConfig.getService()
            .login(nip,id)
            .enqueue(object : Callback<ResultLogin>{
                override fun onFailure(call: Call<ResultLogin>, t: Throwable) {
                    loginView.onFailedLogin(t.localizedMessage)
                }
                override fun onResponse(call: Call<ResultLogin>, response: Response<ResultLogin>) {
                    if (response.isSuccessful && response.body()?.status == 200){
                        loginView.onSuccessLogin(response.body()?.message, response.body()?.dataLogin)
                    } else {
                        loginView.onFailedLogin(response.body()?.message)
                    }
                }
            })
    }
}