package jd.sistemas.android.constraintlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import jd.sistemas.android.constraintlayout.domain.Cliente
import jd.sistemas.android.constraintlayout.domain.Pessoa

class Tela2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("NGVL", "Tela2::onCreate")
        setContentView(R.layout.activity_tela2)
        val nome = intent.getStringExtra("nome")
        val idade = intent.getIntExtra("idade", -1)
        val cliente = intent.getParcelableExtra<Cliente>("cliente")

        val pessoa = intent.getSerializableExtra("pessoa") as Pessoa? // o objeto passa a ser nulo.
        if (pessoa != null) {
            findViewById<TextView>(R.id.textMensagem).text = "Nome: ${pessoa.nome} / Idade: ${pessoa.idade}"
        }
    }


    override fun onStart() {
        super.onStart()
        Log.i("NGVL", "Tela2::onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("NGVL", "Tela2::onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("NGVL", "Tela2::onRestart")
    }

    override fun onPause() {
        super.onPause()
        Log.i("NGVL", "Tela2::onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("NGVL", "Tela2::onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("NGVL", "Tela2::onDestroy")
    }

}