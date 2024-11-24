package com.example.testcalcolatur;

import static com.example.testcalcolatur.R.id.n1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView n1, n2, fun;
    EditText answer;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        fun = findViewById(R.id.textView);
        answer = findViewById(R.id.answer);

    }

    public void randomize(View view) {
        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);
        int fun = (int) (Math.random() * 4) + 1;
        n1.setText(String.valueOf(num1));
        n2.setText(String.valueOf(num2));
        if (fun == 1) {
            this.fun.setText("+");
        } else if (fun == 2) {
            this.fun.setText("-");
        } else if (fun == 3) {
            this.fun.setText("*");
        } else if (fun == 4) {
            this.fun.setText("/");
            num2 = (int) (Math.random() * 10) + 1;

        }
        n1.setText(String.valueOf(num1));
        n2.setText(String.valueOf(num2));


    }

    public void checkAnswer(View view) {
        int num1 = Integer.parseInt(n1.getText().toString());
        int num2 = Integer.parseInt(n2.getText().toString());
        if (fun.getText().equals("+")) {
            if (Integer.parseInt(answer.getText().toString()) == num1 + num2) {
                answer.setText("Correct");
            } else {
                answer.setText("Wrong");
            }
        } else if (fun.getText().equals("-")) {
            if (Integer.parseInt(answer.getText().toString()) == num1 - num2) {
                answer.setText("Correct");
            } else {
                answer.setText("Wrong");
            }

        } else if (fun.getText().equals("*")) {
            if (Integer.parseInt(answer.getText().toString()) == num1 * num2) {
                answer.setText("Correct");
            } else {
                answer.setText("Wrong");
            }
        } else if (fun.getText().equals("/")) {
            if (Integer.parseInt(answer.getText().toString()) == num1 / num2) {
                answer.setText("Correct");
            } else {
                answer.setText("Wrong");
            }

        }
    }
}