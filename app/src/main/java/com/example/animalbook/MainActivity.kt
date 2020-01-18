package com.example.animalbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_sub.*
import kotlinx.android.synthetic.main.activity_sub.titleFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // タイトル名を設定する
        setTitle("フラグメント動物図鑑")
        // 「次へ」ボタンのタップイベントを監視する
        nextButton.setOnClickListener {
            // Sub画面を表示する
            val intent = Intent(this, SubActivity::class.java)
            startActivity(intent)
        }

    }

    // タイトル用のフラグメントに文字列を表示する
    private fun setTitle(title: String) {
        val fragment = titleFragment as? TitleFragment
        fragment?.setTitle(title)
    }

}
