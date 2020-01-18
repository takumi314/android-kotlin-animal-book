package com.example.animalbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sub.*

class SubActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)
        // ボタンイベントを監視する
        setOnClickListener()
    }

    private fun setOnClickListener() {
        // 「ライオン」ボタンのタップイベントを監視する
        lionButton.setOnClickListener {
            val fragment = LionFragment()
            // AppCompatActivityクラスのメソッドで, FragmentManagerクラスのインスタンスを取得する
            val fragmentManager = this.supportFragmentManager
            // FragmentTransactionクラスのインスタンスを取得し, トランザクションを開始する
            // - commit()メソッドが実行されるまで, 実行が猶予される
            val fragmentTransaction
                    = fragmentManager.beginTransaction()
            fragmentTransaction
                .replace(R.id.container, fragment)    // フラグメントの入れ替えを行う
                .addToBackStack(null)   // バックスタックにフラグメントを追加する (端末の戻るボタンを押すと1つ前の状態を表示できる)
                .commit()   // フラグメントへの操作を確定する
        }

        // 「カバ」ボタンのタップイベントを監視する
        hippoButton.setOnClickListener {
            val fragment = HippoFragment()
            val fragmentManager = this.supportFragmentManager
            var fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction
                .replace(R.id.container, fragment)
                .addToBackStack(null)
                .commit()
        }

        // 「キリン」ボタンのタップイベントを監視する
        giraffeButton.setOnClickListener {
            val fragment = GiraffeFragment()
            val fragmentManager = this.supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction
                .replace(R.id.container, fragment)
                .addToBackStack(null)
                .commit()
        }
    }

}
