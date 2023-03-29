package fin.project.proyectoregalos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.getStarted)
        button.setOnClickListener {
            var intent:Intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)

        }


    }
}