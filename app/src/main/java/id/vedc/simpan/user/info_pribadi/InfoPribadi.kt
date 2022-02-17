package id.vedc.simpan.user.info_pribadi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import id.vedc.simpan.MenuUtama
import id.vedc.simpan.R

class InfoPribadi : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.info_pribadi)

        val menuBiodata: Button = findViewById(R.id.btn_bio)
        menuBiodata.setOnClickListener() {
            startActivity(Intent(this, Biodata::class.java))
        }
        val menuKembali: Button = findViewById(R.id.btn_back)
        menuKembali.setOnClickListener() {
            startActivity(Intent(this, MenuUtama::class.java))
        }
        val menuTunkin: Button = findViewById(R.id.btn_tunkin)
        menuTunkin.setOnClickListener(){
            startActivity(Intent(this, Tunkin::class.java))
        }
        val menuRekap: Button = findViewById(R.id.btn_rekap)
        menuRekap.setOnClickListener(){
            startActivity(Intent(this, RekapPenugasan::class.java))
        }
        val menuKehadiran: Button = findViewById(R.id.btn_kehadiran)
        menuKehadiran.setOnClickListener(){
            startActivity(Intent(this, LogKehadiran::class.java))
        }
        val menuUmak: Button = findViewById(R.id.btn_umak)
        menuUmak.setOnClickListener(){
            startActivity(Intent(this, Tunkin::class.java))
        }
        val menuPP53: Button = findViewById(R.id.btn_pp53)
        menuPP53.setOnClickListener(){
            startActivity(Intent(this, PP53::class.java))
        }
        val menuUbahPass: Button = findViewById(R.id.btn_ubahpas)
        menuUbahPass.setOnClickListener(){
            startActivity(Intent(this, UbahPass::class.java))
        }
    }
}
