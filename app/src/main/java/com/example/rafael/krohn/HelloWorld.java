package com.example.rafael.krohn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HelloWorld extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0,
            btnc, btnsum, btnminus, btnmul, btndiv, btnequal,
            btndot, btnpercent, btnroot;
    TextView Screen;
    Float mVal1, mVal2;
    String op;
    boolean dot = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);

        Screen = (TextView) this.findViewById(R.id.resposta);
        btn1 = (Button) this.findViewById(R.id.calc1);
        btn2 = (Button) this.findViewById(R.id.calc2);
        btn3 = (Button) this.findViewById(R.id.calc3);
        btn4 = (Button) this.findViewById(R.id.calc4);
        btn5 = (Button) this.findViewById(R.id.calc5);
        btn6 = (Button) this.findViewById(R.id.calc6);
        btn7 = (Button) this.findViewById(R.id.calc7);
        btn8 = (Button) this.findViewById(R.id.calc8);
        btn9 = (Button) this.findViewById(R.id.calc9);
        btn0 = (Button) this.findViewById(R.id.calc0);
        btnc = (Button) this.findViewById(R.id.calcc);
        btndot = (Button) this.findViewById(R.id.calcdot);
        btnpercent = (Button) this.findViewById(R.id.calcpercent);
        btnroot = (Button) this.findViewById(R.id.calcroot);
        btnsum = (Button) this.findViewById(R.id.calcsum);
        btnminus = (Button) this.findViewById(R.id.calcminus);
        btndiv = (Button) this.findViewById(R.id.calcdiv);
        btnmul = (Button) this.findViewById(R.id.calcmul);


        btnequal = (Button) this.findViewById(R.id.calcequal);



        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Screen.setText(Screen.getText() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Screen.setText(Screen.getText() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Screen.setText(Screen.getText() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Screen.setText(Screen.getText() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Screen.setText(Screen.getText() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Screen.setText(Screen.getText() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Screen.setText(Screen.getText() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Screen.setText(Screen.getText() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Screen.setText(Screen.getText() + "9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Screen.setText(Screen.getText() + "0");
            }
        });

        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!dot) {
                    Screen.setText(Screen.getText() + ".");
                    dot = !dot;
                }
            }
        });
        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                restartEntry();
                mVal1 = Float.parseFloat(0 + "");
                mVal2 = Float.parseFloat(0 + "");
            }
        });

        btnsum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Screen.getText() != null && Screen.getText() != ""){
                    mVal1 = Float.parseFloat(Screen.getText() + "");
                    op = "sum";
                }
                else {
                    mVal1 = Float.parseFloat("0");
                }
                restartEntry();
            }
        });

        btnminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Screen.getText() != null && Screen.getText() != ""){
                    mVal1 = Float.parseFloat(Screen.getText() + "");
                    op = "sub";
                }
                restartEntry();
            }
        });

        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Screen.getText() != null && Screen.getText() != ""){
                    mVal1 = Float.parseFloat(Screen.getText() + "");
                    op = "div";
                }
                restartEntry();
            }
        });

        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Screen.getText() != null && Screen.getText() != ""){
                    mVal1 = Float.parseFloat(Screen.getText() + "");
                    op = "mul";
                }
                restartEntry();
            }
        });

        btnroot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op = "root";
            }
        });

        btnpercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Screen.getText() != null && Screen.getText() != "") {
                    mVal1 = Float.parseFloat(Screen.getText() + "");
                    op = "mod";
                }
                restartEntry();
            }
        });

        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mVal2 = Float.parseFloat(Screen.getText() + "");
                float result = 0;

                if (op == "sum") {
                    result = mVal1 + mVal2;
                } else if (op == "sub") {
                    result = mVal1 - mVal2;
                } else if (op == "mul") {
                    result = mVal1 * mVal2;
                }else if (op == "div") {
                    result = mVal1 / mVal2;
                }else if (op == "mod") {
                    result = mVal1 % mVal2;
                }else if (op == "root") {
                    if (mVal1 != 0 && mVal2 == 0) {
                        result = Float.parseFloat(Math.sqrt(mVal1) + "");
                    } else if (mVal2 != 0) {
                        result = Float.parseFloat(Math.sqrt(mVal2) + "");
                    } else result = 0;
                }
                else Screen.setText("Error :(");

                Screen.setText(result + "");
                op = "";
                mVal1 = result;
                mVal2 = Float.parseFloat("0");
            }
        });



    }


    void restartEntry (){
        dot = false;
        Screen.setText("");
    }



}
