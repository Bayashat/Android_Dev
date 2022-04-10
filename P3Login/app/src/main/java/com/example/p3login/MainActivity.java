package com.example.p3login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Login(View view)    // 当main_activity里的 Log In 被按下时的方法
    {
        EditText txtUsername = findViewById(R.id.etUserName);  // 创建 EditText对象, 并赋值为 UserName
        EditText txtPassword = findViewById(R.id.etPassword);  // 创建 EditText对象, 并赋值为 Password

        //  将用户输入的提取为String
        String username = txtUsername.getText().toString();
        String password = txtPassword.getText().toString();

        // 于正确的值相比较:
        if(username.equals("user01") && password.equals("123456"))
        {
            Intent intent = new Intent(this, HomePage.class);
            startActivity(intent);
        }
        else // 若错误,则将 Log In Button 下面的TextView 设置为 message:
        {
            String message = "Username or password incorrect.";
            TextView tvMsg = findViewById(R.id.tvMsg);
            tvMsg.setText(message);
        }
    }
    /*
        fun Login(view: View?)  // 当main_activity里的 Log In 被按下时的方法
    {
        val txtUsername = findViewById<EditText>(R.id.etUserName)  // 创建 EditText对象, 并赋值为 UserName
        val txtPassword = findViewById<EditText>(R.id.etPassword)  // 创建 EditText对象, 并赋值为 Password

        //  将用户输入的提取为String
        val username = txtUsername.text.toString()
        val password = txtPassword.text.toString()

        // 于正确的值相比较:
        if (username == "user01" && password == "123456") {
            val intent = Intent(this, HomePage::class.java) // 通过 Intent 跳转到 Second Activity
            startActivity(intent)
        }
        else // 若错误,则将 Log In Button 下面的TextView 设置为 message:
        {
            val message = "Username or password incorrect."
            val tvMsg = findViewById<TextView>(R.id.tvMsg)
            tvMsg.text = message
        }
    }
     */
}