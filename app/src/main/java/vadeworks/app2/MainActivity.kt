package vadeworks.app2

import android.os.Bundle
import android.os.Environment
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import vadeworks.toasterlibary.ToasterMessage
import java.io.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ToasterMessage.createToastMessage(applicationContext,"Ok Lets",this)



    }

    @Throws(IOException::class)
    fun getFileContents(file: File?): String {
        val inputStream: InputStream = FileInputStream(file)
        val reader =
            BufferedReader(InputStreamReader(inputStream))
        val stringBuilder = StringBuilder()
        var done = false
        while (!done) {
            val line = reader.readLine()
            done = line == null
            if (line != null) {
                stringBuilder.append(line)
            }
        }
        reader.close()
        inputStream.close()
        return stringBuilder.toString()
    }



}
