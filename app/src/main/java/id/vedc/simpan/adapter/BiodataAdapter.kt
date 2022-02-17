package id.vedc.simpan.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import id.vedc.simpan.R
import id.vedc.simpan.dataPegawai1
import kotlinx.android.synthetic.main.activity_biodata.view.*

class BiodataAdapter(val data: List<dataPegawai1>?) : RecyclerView.Adapter<BiodataAdapter.MyHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.activity_biodata, parent, false)
        return MyHolder(v)
    }
    override fun getItemCount(): Int = data?.size ?: 0
    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        holder.bind(data?.get(position))
    }
    class MyHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(get: dataPegawai1?) {
            itemView.b_pend.text = get?.pendidikan
            itemView.b_jab.text = get?.jabatan
            itemView.b_agama.text = get?.agama
            itemView.b_pag.text = get?.pangkat
            itemView.b_ktun.text = get?.gradeTunkin
            itemView.b_nama.text = get?.nama
            itemView.b_nip.text = get?.nip
            itemView.b_lahir.text = get?.tempatlahir
            itemView.b_gol.text = get?.golRuang
            itemView.b_gbel.text = get?.gelarBelakang
            itemView.b_bup.text = get?.bup
            itemView.b_gdep.text = get?.gelarDepan
            itemView.b_gender.text = get?.jeniskelamin
            itemView.b_tgl.text = get?.tanggallahir
        }
    }
}