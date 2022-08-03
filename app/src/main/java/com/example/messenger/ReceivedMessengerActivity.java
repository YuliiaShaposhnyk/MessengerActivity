package com.example.messenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ReceivedMessengerActivity extends AppCompatActivity {

    private TextView textViewMess;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_received_messenger);

        textViewMess = findViewById(R.id.textView);

        Intent intent = getIntent();
        String mess = intent.getStringExtra("mess");
        textViewMess.setText(mess);
    }


}