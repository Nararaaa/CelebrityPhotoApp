package com.example.celebrityphotoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        // 화면을 보여주는 코드
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 버튼 클릭 이벤트 코드

        // 이미지뷰 id 변수
        val image1 = findViewById<ImageView>(R.id.bts_image_1)
        val image2 = findViewById<ImageView>(R.id.bts_image_2)
        val image3 = findViewById<ImageView>(R.id.bts_image_3)
        val image4 = findViewById<ImageView>(R.id.bts_image_4)
        val image5 = findViewById<ImageView>(R.id.bts_image_5)
        val image6 = findViewById<ImageView>(R.id.bts_image_6)
        val image7 = findViewById<ImageView>(R.id.bts_image_7)

        image1.setOnClickListener {
            // 화면이 클릭되었다는 것을 알려주는 코드(Toast 메세지)
            Toast.makeText(this, "1번 클릭 완료", Toast.LENGTH_LONG).show()

            // 화면 클릭 시, 다음 화면으로 넘어감(사진 크게 보여주기)
            val intent = Intent(this, Bts1Activity::class.java)
            startActivity(intent)
        }

        image2.setOnClickListener {
            // 화면이 클릭되었다는 것을 알려주는 코드(Toast 메세지)
            Toast.makeText(this, "2번 클릭 완료", Toast.LENGTH_LONG).show()

            // 화면 클릭 시, 다음 화면으로 넘어감(사진 크게 보여주기)
            val intent = Intent(this, Bts2Activity::class.java)
            startActivity(intent)
        }

        image3.setOnClickListener {
            // 화면이 클릭되었다는 것을 알려주는 코드(Toast 메세지)
            Toast.makeText(this, "3번 클릭 완료", Toast.LENGTH_LONG).show()

            // 화면 클릭 시, 다음 화면으로 넘어감(사진 크게 보여주기)
            val intent = Intent(this, Bts3Activity::class.java)
            startActivity(intent)
        }

        image4.setOnClickListener {
            // 화면이 클릭되었다는 것을 알려주는 코드(Toast 메세지)
            Toast.makeText(this, "4번 클릭 완료", Toast.LENGTH_LONG).show()

            // 화면 클릭 시, 다음 화면으로 넘어감(사진 크게 보여주기)
            val intent = Intent(this, Bts4Activity::class.java)
            startActivity(intent)
        }

        image5.setOnClickListener {
            // 화면이 클릭되었다는 것을 알려주는 코드(Toast 메세지)
            Toast.makeText(this, "5번 클릭 완료", Toast.LENGTH_LONG).show()

            // 화면 클릭 시, 다음 화면으로 넘어감(사진 크게 보여주기)
            val intent = Intent(this, Bts5Activity::class.java)
            startActivity(intent)
        }

        image6.setOnClickListener {
            // 화면이 클릭되었다는 것을 알려주는 코드(Toast 메세지)
            Toast.makeText(this, "6번 클릭 완료", Toast.LENGTH_LONG).show()

            // 화면 클릭 시, 다음 화면으로 넘어감(사진 크게 보여주기)
            val intent = Intent(this, Bts6Activity::class.java)
            startActivity(intent)
        }

        image7.setOnClickListener {
            // 화면이 클릭되었다는 것을 알려주는 코드(Toast 메세지)
            Toast.makeText(this, "7번 클릭 완료", Toast.LENGTH_LONG).show()

            // 화면 클릭 시, 다음 화면으로 넘어감(사진 크게 보여주기)
            val intent = Intent(this, Bts7Activity::class.java)
            startActivity(intent)
        }


    }
}