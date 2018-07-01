package com.example.mukaoud.journal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NoteActivity extends AppCompatActivity {

    EditText noteEditText;
    Button clearButton,saveButton;


    String note;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);

        noteEditText = (EditText) findViewById(R.id.et_note);
        clearButton = (Button) findViewById(R.id.b_clear);
        saveButton = (Button) findViewById(R.id.b_save);

        note = "";
        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                noteEditText.setText(note);

            }
        });

    }
}
