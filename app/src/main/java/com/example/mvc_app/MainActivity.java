package com.example.mvc_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public MyModel GetAppFromModel() {
        return new MyModel("MVC APP", 650400, 5);
    }

    public void DisplayAppInText(View view) {
        textView.setText(GetAppFromModel().getAppName() + "Downloads" + GetAppFromModel().getAppDownloads());
    }
}