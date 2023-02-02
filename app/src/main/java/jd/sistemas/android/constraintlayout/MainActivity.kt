package jd.sistemas.android.constraintlayout

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import jd.sistemas.android.constraintlayout.domain.Cliente
import jd.sistemas.android.constraintlayout.domain.Pessoa

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("NGVL", "Tela1::onCreate")

        findViewById<Button>(R.id.buttonToast).setOnClickListener {
            val texto = findViewById<EditText>(R.id.editTexto).text.toString()
            Toast.makeText(this, texto, Toast.LENGTH_SHORT).show()
        }

        findViewById<Button>(R.id.buttonTela2).setOnClickListener {
            val intent = Intent(this, Tela2Activity::class.java)
            intent.putExtra("nome", "Jorge")
            intent.putExtra("idade", 31)
            startActivity(intent)
        }

        findViewById<Button>(R.id.buttonParcel).setOnClickListener {
            val cliente = Cliente(1, "Jorge")
            val intent = Intent(this, Tela2Activity::class.java)
            intent.putExtra("cliente", cliente)
            startActivity(intent)
        }

        findViewById<Button>(R.id.buttonSerializable).setOnClickListener {
            val intent = Intent(this, Tela2Activity::class.java)
            intent.putExtra("pessoa", Pessoa("Jorjão", 31))
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i("NGVL", "Tela1::onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("NGVL", "Tela1::onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("NGVL", "Tela1::onRestart")
    }

    override fun onPause() {
        super.onPause()
        Log.i("NGVL", "Tela1::onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("NGVL", "Tela1::onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("NGVL", "Tela1::onDestroy")
    }
}