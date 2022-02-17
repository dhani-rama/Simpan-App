package id.vedc.simpan.user.ajuan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent
import id.vedc.simpan.R
import id.vedc.simpan.MenuUtama

class Ajuan : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ajuan)

        val menuKembali: Button = findViewById(R.id.btn_backA1)
        menuKembali.setOnClickListener() {
            startActivity(Intent(this, MenuUtama::class.java))
        }

        //---------- menu izin terlambat -----------------------------------
        val menu_IzinTerlambat: Button = findViewById(R.id.button2)
        menu_IzinTerlambat.setOnClickListener {
            startActivity(Intent(this, IzinTerlambat::class.java))
        }

        //---------- menu izin psw -----------------------------------
        val menu_psw: Button = findViewById(R.id.button3)
        menu_psw.setOnClickListener {
            startActivity(Intent(this, PSW::class.java))
        }

        //---------- menu cuti -----------------------------------
        val menu_cuti: Button = findViewById(R.id.button5)
        menu_cuti.setOnClickListener {
            startActivity(Intent(this, PengajuanCuti::class.java))
        }

        //---------- menu izin unggah dokumen -----------------------------------
        val menu_unggahDokumen: Button = findViewById(R.id.button4)
        menu_unggahDokumen.setOnClickListener {
            startActivity(Intent(this, UploadDoc::class.java))
        }

        //---------- menu izin dalam jam kerja -----------------------------------
        val menu_izinDlmKerja: Button = findViewById(R.id.button6)
        menu_izinDlmKerja.setOnClickListener {
            startActivity(Intent(this, IzinDalamKerja::class.java))
        }

        //---------- menu izin sakit  -----------------------------------
        val menu_izinSakit: Button = findViewById(R.id.button7)
        menu_izinSakit.setOnClickListener {
            startActivity(Intent(this, IzinSakit::class.java))
        }
    }
}
