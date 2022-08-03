package com.example.messenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editTextMessenger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextMessenger = findViewById(R.id.editTextMasseg);
    }

    public void onClickSendMessenger(View view) {
        String mess = editTextMessenger.getText().toString();
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, mess);

        Intent chosenIntent = Intent.createChooser(intent, getString(R.string.chooserTitile));
        startActivity(chosenIntent);


    }
}