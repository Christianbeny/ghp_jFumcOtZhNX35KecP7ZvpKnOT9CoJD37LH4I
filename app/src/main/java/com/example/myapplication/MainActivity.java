package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageButton copy;
    TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto= findViewById(R.id.textView);
        copy=findViewById(R.id.btncopy);
    }

    public void copiarTextoPorClipboard(View v) {
        // ClipboardManager lo mandamos llamar por invocacion de :
        ClipboardManager clipboard = (ClipboardManager)
                getSystemService(Context.CLIPBOARD_SERVICE);
        //Para agregar datos al portapapeles creamos clipData
        ClipData clip = ClipData.newPlainText("simple text", texto.getText().toString());

        clipboard.setPrimaryClip(clip);

        Toast.makeText(this, "Copiado", Toast.LENGTH_LONG).show();
    }
}