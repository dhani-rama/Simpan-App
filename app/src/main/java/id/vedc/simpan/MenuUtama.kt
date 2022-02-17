package id.vedc.simpan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import id.vedc.simpan.user.ajuan.Ajuan
import id.vedc.simpan.user.info_pribadi.InfoPribadi
import id.vedc.simpan.user.info_umum.InfoUmum

class MenuUtama : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu_utama)

        val menuPribadi: Button = findViewById(R.id.btn_pribadi)
        menuPribadi.setOnClickListener() {
            startActivity(Intent(this, InfoPribadi::class.java))
        }

        val menuAjuan: Button = findViewById(R.id.btn_ajuan)
        menuAjuan.setOnClickListener() {
            startActivity(Intent(this, Ajuan::class.java))
        }

        val menuInfoUmum: Button = findViewById(R.id.btn_info)
        menuInfoUmum.setOnClickListener() {
            startActivity(Intent(this, InfoUmum::class.java))
        }

        val menuLogout: Button = findViewById(R.id.btn_logout)
        menuLogout.setOnClickListener() {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}
