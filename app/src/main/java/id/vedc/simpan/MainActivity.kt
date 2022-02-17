package id.vedc.simpan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.vedc.simpan.model.dataPegawai
import id.vedc.simpan.presenter.LoginPresenter
import id.vedc.simpan.model.login.LoginView
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.alert
import org.jetbrains.anko.sdk27.coroutines.onClick
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {
//    , LoginView {

    private lateinit var presenter: LoginPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_login.setOnClickListener {
            startActivity(Intent(this, MenuUtama::class.java))
        }
//        presenter = LoginPresenter(this)

//        btn_login.onClick {
//            val nip = form_nip.text.toString()
//            val id = form_pass.text.toString()
//            presenter.login(nip, id)
//        }
    }

//    override fun onSuccessLogin(msg: String?, data: dataPegawai1?) {
//        alert {
//            title = "Information"
//            message = "Login Success"
//        }.show()
//        startActivity<MenuUtama>()
//        finish()
//
//    }
//
//    override fun onFailedLogin(msg: String?) {
//        alert {
//            title = "Information"
//            message = "Login Gagal, Silahkan Cek NIP dan  Password Anda"
//        }.show()
//    }
}



