package co.udea.mision.natourapp.detalle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import co.udea.mision.natourapp.R
import co.udea.mision.natourapp.databinding.ActivityListLugaresBinding
import co.udea.mision.natourapp.databinding.ActivityMainBinding
import co.udea.mision.natourapp.model.LugarItem

class MainActivity : AppCompatActivity() {

    private lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)


        /* val lugar: LugarItem = intent.extras?.getSerializable("lugar") as LugarItem
        mainBinding.textView2 = lugar.nombre */
    }
}