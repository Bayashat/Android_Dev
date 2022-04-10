package com.example.p2calculator;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    double num1 = 0.0;
    double num2 = 0.0;
    double res = 0.0;
    String s1 = "";
    String s2 = "";
    char c = '+';

    public  TextView input() { return (TextView)findViewById(R.id.input); }
    public  TextView output() {return (TextView)findViewById(R.id.output); }
    public  TextView btn0() { return (TextView)findViewById(R.id.btn_0); }
    public  TextView btn1() { return (TextView)findViewById(R.id.btn_1); }
    public  TextView btn2() { return (TextView)findViewById(R.id.btn_2); }
    public  TextView btn3() { return (TextView)findViewById(R.id.btn_3); }
    public  TextView btn4() { return (TextView)findViewById(R.id.btn_4); }
    public  TextView btn5() { return (TextView)findViewById(R.id.btn_5); }
    public  TextView btn6() { return (TextView)findViewById(R.id.btn_6); }
    public  TextView btn7() { return (TextView)findViewById(R.id.btn_7); }
    public  TextView btn8() { return (TextView)findViewById(R.id.btn_8); }
    public  TextView btn9() { return (TextView)findViewById(R.id.btn_9); }
    public  TextView btnDot() { return (TextView)findViewById(R.id.btn_dot); }
    public  TextView btnBack() { return (TextView)findViewById(R.id.btn_back); }
    public  TextView btnDivide() { return (TextView)findViewById(R.id.btn_divide); }
    public  TextView btnMultiply() { return (TextView)findViewById(R.id.btn_multiply); }
    public  TextView btnMinus() { return (TextView)findViewById(R.id.btn_minus); }
    public  TextView btnPlus() { return (TextView)findViewById(R.id.btn_plus); }
    public  TextView btnEqual() { return (TextView)findViewById(R.id.btn_equal); }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);

        btn0().setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                setTextField("0");
            }
        });
        btn1().setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                setTextField("1");
            }
        });
        btn2().setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                setTextField("2");
            }
        });
        btn3().setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                setTextField("3");
            }
        });
        btn4().setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                setTextField("4");
            }
        });
        btn5().setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                setTextField("5");
            }
        });
        btn6().setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                setTextField("6");
            }
        });
        btn7().setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                setTextField("7");
            }
        });
        btn8().setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                setTextField("8");
            }
        });
        btn9().setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                setTextField("9");
            }
        });
        btnDot().setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                setTextField(".");
            }
        });
        btnDivide().setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                String txt = input().getText().toString();
                num1 = new Double(txt);
                c = '/';
                input().setText("");
            }
        });
        btnMultiply().setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                String txt = input().getText().toString();
                num1 = new Double(txt);
                c = '*';
                input().setText("");
            }
        });
        btnPlus().setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                String txt = input().getText().toString();
                num1 = new Double(txt);
                c = '+';
                input().setText("");
            }
        });
        btnMinus().setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                String txt = input().getText().toString();
                num1 = new Double(txt);
                c = '-';
                input().setText("");
            }
        });
        btnEqual().setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                String txt = input().getText().toString();
                num2 = new Double(txt);
                if(c == '+') { res = num1 + num2;}
                else if(c == '-') { res = num1 - num2;}
                else if(c == '*') { res = num1 * num2;}
                else if(c == '/') { res = num1 / num2;}
                String result = Double.toString(res);
                output().setText(result);
            }
        });
        btnBack().setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                String txt = input().getText().toString();
                if(!txt.isEmpty())
                {
                    input().setText(txt.substring(0,txt.length()-1));
                    output().setText("");
                    res = 0.0;
                }

            }
        });
    }

    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        String input = input().getText().toString();
        outState.putString("input", input);
        String output = output().getText().toString();
        outState.putString("output", output);
    }

    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        input().setText((savedInstanceState.getString("input")).toString());
        output().setText(String.valueOf(savedInstanceState.getString("output")));
    }


    public  void setTextField(String str) {
        input().append(str);
    }
}

/*
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.lang.Exception
import android.util.Log


class MainActivity : AppCompatActivity() {

    private fun input() = findViewById<TextView>(R.id.input)
    private fun output() = findViewById<TextView>(R.id.output)
    private fun btn0() = findViewById<TextView>(R.id.btn_0)
    private fun btn1() = findViewById<TextView>(R.id.btn_1)
    private fun btn2() = findViewById<TextView>(R.id.btn_2)
    private fun btn3() = findViewById<TextView>(R.id.btn_3)
    private fun btn4() = findViewById<TextView>(R.id.btn_4)
    private fun btn5() = findViewById<TextView>(R.id.btn_5)
    private fun btn6() = findViewById<TextView>(R.id.btn_6)
    private fun btn7() = findViewById<TextView>(R.id.btn_7)
    private fun btn8() = findViewById<TextView>(R.id.btn_8)
    private fun btn9() = findViewById<TextView>(R.id.btn_9)
    private fun btnDot() = findViewById<TextView>(R.id.btn_dot)
    private fun btnBack() = findViewById<TextView>(R.id.btn_back)
    private fun btnDivide() = findViewById<TextView>(R.id.btn_divide)
    private fun btnMultiply() = findViewById<TextView>(R.id.btn_multiply)
    private fun btnMinus() = findViewById<TextView>(R.id.btn_minus)
    private fun btnPlus() = findViewById<TextView>(R.id.btn_plus)
    private fun btnEqual() = findViewById<TextView>(R.id.btn_equal)

    private var num1 = 0.0
    private var num2 = 0.0
    private var res = 0.0
    private var res2 = 0
    private var s1 = ""
    private var s2 = ""
    private var char = '+'

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initUI()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState);
        outState.putString("input", input().text.toString())
        outState.putString("output", output().text.toString())
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        input().text = savedInstanceState.getString("input").toString()
        output().text = savedInstanceState.getString("output").toString()
    }

    private fun initUI() {
        btn0().setOnClickListener {
            setTextField("0")
        }
        btn1().setOnClickListener {
            setTextField("1")
        }
        btn2().setOnClickListener {
            setTextField("2")
        }
        btn3().setOnClickListener {
            setTextField("3")
        }
        btn4().setOnClickListener {
            setTextField("4")
        }
        btn5().setOnClickListener {
            setTextField("5")
        }
        btn6().setOnClickListener {
            setTextField("6")
        }
        btn7().setOnClickListener {
            setTextField("7")
        }
        btn8().setOnClickListener {
            setTextField("8")
        }
        btn9().setOnClickListener {
            setTextField("9")
        }
        btnDot().setOnClickListener {
            setTextField(".")
        }

        btnDivide().setOnClickListener {
            num1 = input().text.toString().toDouble()
            char = '/'
            input().text = ""
        }
        btnMultiply().setOnClickListener {
            num1 = input().text.toString().toDouble()
            char = '*'
            input().text = ""
        }
        btnPlus().setOnClickListener {
            num1 = input().text.toString().toDouble()
            char = '+'
            input().text = ""
        }
        btnMinus().setOnClickListener {
            num1 = input().text.toString().toDouble()
            char = '-'
            input().text = ""
        }
        btnEqual().setOnClickListener {
            num2 = input().text.toString().toDouble()
            res = when (char) {
                '+' -> {
                    num1 + num2
                }
                '-' -> {
                    num1 - num2
                }
                '*' -> {
                    num1 * num2
                }
                else -> {
                    num1 / num2
                }
            }

            res2 = res.toInt()
            s1 = res.toString()
            s2 = res2.toString()
            s2 += ".0"
            if(s1 == s2) {
                output().text = res2.toString()
            } else {
                output().text = s1
            }
        }

        btnBack().setOnClickListener {
            val str = input().text.toString()
            if(str.isNotEmpty()) {
                input().text = str.substring(0, str.length - 1)
                output().text = ""
            }
        }
    }

    private fun setTextField(str: String) {
        input().append(str)
    }
}
 */