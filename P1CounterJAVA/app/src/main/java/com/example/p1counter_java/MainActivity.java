package com.example.p1counter_java;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Integer counter = 0;    // 创建整数变量: 数按下的数目
    TextView textView; // 新文本 : 暂为 null

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("MainActivity", "onCreate");

        textView = (TextView)findViewById(R.id.text_view); // 通过id引用文本(0)

        if(savedInstanceState != null && !savedInstanceState.isEmpty()) // 保存信息第二步: 当重构界面时
        {
            Log.e("MainActivity", "savedInstanceState");
            counter = savedInstanceState.getInt("cnt", 0); // 给counter刚刚存在"cnt"的值
            textView.setText(counter.toString()); // 然后刷新文本
        }
    }

    public void onclick(View view)
    {
        Log.e("MainActivity", "onClick");
        counter += 1;
        textView.setText(counter.toString());
    }

    public void change(View view)
    {
        Log.e("MainActivity", "change");
        Intent intent = new Intent(this, second.class);
        intent.putExtra("counter", counter);
        startActivity(intent);
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState)  // 保存信息第一步是这个:
    {
        Log.e("MainActivity", "onSaveInstanceState");
        super.onSaveInstanceState(outState);
        outState.putInt("cnt", counter); // 在State的"cnt" 存counter的值
    }

    /*
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e("MainActivity", "onCreate")
        textView = findViewById<View>(R.id.text_view) as TextView // 通过id引用文本(0)
        if (savedInstanceState != null && !savedInstanceState.isEmpty) // 保存信息第二步: 当重构界面时
        {
            Log.e("MainActivity", "savedInstanceState")
            counter = savedInstanceState.getInt("cnt", 0) // 给counter刚刚存在"cnt"的值
            textView!!.text = counter.toString() // 然后刷新文本
        }
    }

    fun onclick(view: View?) {
        Log.e("MainActivity", "onClick")
        counter += 1
        textView!!.text = counter.toString()
    }

    fun change(view: View?) {
        Log.e("MainActivity", "change")
        val intent = Intent(this, Second::class.java)
        intent.putExtra("counter", counter)
        startActivity(intent)
    }

    override fun onSaveInstanceState(outState: Bundle) // 保存信息第一步是这个:
    {
        Log.e("MainActivity", "onSaveInstanceState")
        super.onSaveInstanceState(outState)
        outState.putInt("cnt", counter) // 在State的"cnt" 存counter的值
    }
     */

}