package com.example.p1counter_java;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class second extends AppCompatActivity
{
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView = (TextView)findViewById(R.id.text);
        textView.setText(String.valueOf(this.getIntent().getIntExtra("counter", 0)).toString());

        Log.e("Counter", String.valueOf(this.getIntent().getIntExtra("counter", 0)));
    }

    /*
    var textView: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        textView = findViewById<View>(R.id.text) as TextView
        textView!!.text = this.intent.getIntExtra("counter", 0).toString()
        Log.e("Counter", this.intent.getIntExtra("counter", 0).toString())
    }
     */
}
