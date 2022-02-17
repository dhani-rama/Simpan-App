package id.vedc.simpan.user.info_pribadi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent
import android.widget.Toast
import id.vedc.simpan.MenuUtama
import id.vedc.simpan.R
import id.vedc.simpan.model.dataPegawai
import id.vedc.simpan.model.info_pribadi.UbahPassword.UpdatePassView
import id.vedc.simpan.presenter.UbahPassPresenter
import kotlinx.android.synthetic.main.ubah_pass.*
import org.jetbrains.anko.sdk27.coroutines.onClick
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast


class UbahPass : AppCompatActivity(), UpdatePassView {
    private lateinit var presenter : UbahPassPresenter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ubah_pass)

        presenter = UbahPassPresenter(this)
        val itemDataItem = intent.getSerializableExtra("dataPegawai")

        val item = itemDataItem as dataPegawai?

        //form_pass_baru.setText(toString())
        form_ulangi_pass.setText(item?.password.toString())

        btn_simpan.onClick {
            presenter.updatePegawai(
                item?.idPegawai ?: "",
                (if(form_ulangi_pass.setText(item?.password.toString()) != form_pass_baru.setText(toString())){
                    form_ulangi_pass.text.toString()
                }else{
                    Toast.makeText(applicationContext, "Password tidak sama", Toast.LENGTH_SHORT).show()

                    startActivity<Biodata>()
                    finish()

                }) as String
            )
            startActivity<InfoPribadi>()
            finish()
        }

        btn_back8.onClick {
            startActivity<InfoPribadi>()
            finish()
        }
    }

    override fun onSuccessUpdate(msg: String) {
        TODO("Not yet implemented")
    }

    override fun onErrorUpdate(msg: String) {
        TODO("Not yet implemented")
    }
}
