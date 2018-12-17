package com.example.kkingsbe.cataanhelper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText currentRollEditText = findViewById(R.id.currentRollEditText);

        currentRollEditText.setOnKeyListener(new View.OnKeyListener() {
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                // If the event is a key-down event on the "enter" button
                if ((event.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    // Perform action on key press
                    getCataanResources(currentRollEditText.getText().toString());
                    return true;
                }
                return false;
            }
        });
    }

    public void getCataanResources(String rollStr){
        int roll = Integer.parseInt(rollStr);
        Toast.makeText(MainActivity.this, Integer.toString(roll), Toast.LENGTH_SHORT).show();
    }
}
