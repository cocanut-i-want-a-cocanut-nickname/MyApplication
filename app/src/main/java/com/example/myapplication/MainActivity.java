package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    Button button1;

    TextView text1;
    EditText edit1;

    private int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);

        text1 = findViewById(R.id.text1);

        edit1 = findViewById(R.id.edit1);

        // 버튼 이벤ㅁ트 추가
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = edit1.getText().toString();
                int year = -1
                if(str.equals("") || str == null){
                }else{
                    year = Integer.parseInt(str);
                }
                if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
                    text1.setText(year+"년은 윤년입니다.");
                }else{
                    text1.setText(year+"년은 윤년이 아닙니다.");
                }
            }
        });
    }
}