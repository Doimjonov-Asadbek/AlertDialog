package app.test.alertdialog

import android.annotation.SuppressLint
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val exit = findViewById<Button>(R.id.exitBtn)

        exit.setOnClickListener{
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Are you sure !")
            builder.setMessage("Do you want to close the app ?")
            builder.setPositiveButton("Yes") { _: DialogInterface, _: Int ->
                finish()
            }

            builder.setNegativeButton("No") { _: DialogInterface, _: Int -> }
            builder.show()
        }
    }
}