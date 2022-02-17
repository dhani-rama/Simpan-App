package id.vedc.simpan.model.info_pribadi.Biodata

import id.vedc.simpan.dataPegawai1


interface BioView {
    //get data
    fun onSuccessGet(data: List<dataPegawai1?>?)
    fun onFailedGet(msg : String)
}