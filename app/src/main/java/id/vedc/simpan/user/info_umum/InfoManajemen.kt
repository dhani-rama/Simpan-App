package id.vedc.simpan.user.info_umum

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import id.vedc.simpan.R

class InfoManajemen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.info_manajemen)

        val menuKembali: Button = findViewById(R.id.btn_back18)
        menuKembali.setOnClickListener() {
            startActivity(Intent(this, InfoUmum::class.java))
        }

        val menu_PP53: Button = findViewById(R.id.btn_pp53_kurang_jam)
        menu_PP53.setOnClickListener {
            startActivity(Intent(this, pp53KurangJam::class.java))
        }

        val menu_hadirPegawai: Button = findViewById(R.id.btn_KehadiranPegawai)
        menu_hadirPegawai.setOnClickListener {
            startActivity(Intent(this, KehadiranPegawai::class.java))
        }

        val menu_ProsesAjuan: Button = findViewById(R.id.btn_ProsesAjuan)
        menu_ProsesAjuan.setOnClickListener {
            startActivity(Intent(this, ProsesAjuan::class.java))
        }

        val menu_RekapPenugasan: Button = findViewById(R.id.Rekap_Penugasan)
        menu_RekapPenugasan.setOnClickListener {
            startActivity(Intent(this, RekapPenugasanManajemen::class.java))
        }
    }
}
