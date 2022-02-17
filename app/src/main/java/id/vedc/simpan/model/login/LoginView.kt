package id.vedc.simpan.model.login

import id.vedc.simpan.dataPegawai1


interface LoginView {
    fun onSuccessLogin (msg : String?, data : dataPegawai1?)
    fun onFailedLogin (msg : String?)
}