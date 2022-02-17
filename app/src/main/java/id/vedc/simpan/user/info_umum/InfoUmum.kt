package id.vedc.simpan.user.info_umum

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import id.vedc.simpan.MenuUtama
import id.vedc.simpan.R

class InfoUmum : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.info_umum)

        //--------------------- menu info manajemen --------------------------------
        val menu_InfoManajemen: Button = findViewById(R.id.btn_manajemen)
        menu_InfoManajemen.setOnClickListener{
            startActivity(Intent(this, InfoManajemen::class.java))
        }

        //--------------------- menu Rekap Purna Tugas --------------------------------
        val menu_rekapPurna: Button = findViewById(R.id.btn_RekapPurna)
        menu_rekapPurna.setOnClickListener {
            startActivity(Intent(this, RekapPurnaTugas::class.java ))
        }

        //--------------------- menu list Purna --------------------------------
        val menu_listPurna: Button = findViewById(R.id.btn_PurnaTugas)
        menu_listPurna.setOnClickListener {
            startActivity(Intent(this, ListPurnaTugas::class.java ))
        }

        //--------------------- menu Profil Pegawai --------------------------------
        val menu_profilPegawai: Button = findViewById(R.id.btn_ProfilePegawai)
        menu_profilPegawai.setOnClickListener {
            startActivity(Intent(this, ProfilPegawai::class.java ))
        }

        //--------------------- tombol kembali --------------------------------
        val tombol_kembali: Button = findViewById(R.id.back_Infoumum)
        tombol_kembali.setOnClickListener {
            startActivity(Intent(this, MenuUtama::class.java))
        }
    }
}
