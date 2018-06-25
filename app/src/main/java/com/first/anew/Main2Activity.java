package com.first.anew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import pl.fanfatal.swipecontrollerdemo.R;

public class Main2Activity extends AppCompatActivity {


    private EditText editText;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        addListenerOnButton();
    }

    public void addListenerOnButton() {
        editText = (EditText) findViewById(R.id.edit_text);
        button = (Button) findViewById(R.id.b1);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent ( Main2Activity.this, MainActivity.class );
                        intent.putExtra ( "TextBox", editText.getText().toString() );
                        startActivity(intent);
                    }
                }


        );
    }


}


