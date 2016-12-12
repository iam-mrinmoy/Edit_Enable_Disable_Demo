package com.onqanetapp.mp.edit_enable_disable_demo;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.view.inputmethod.InputMethod;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtFname,edtEmail,edtPh;
    Button btnEditSave,btnTest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtFname=(EditText)findViewById(R.id.edtFname);
        edtEmail=(EditText)findViewById(R.id.edtEmail);
        edtPh=(EditText)findViewById(R.id.edtPh);
        btnEditSave=(Button)findViewById(R.id.btnEditSave);
        btnEditSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    /*edtFname.setFocusable(true);
                    edtFname.setFocusableInTouchMode(true);*/
                    edtFname.setInputType(InputType.TYPE_CLASS_TEXT);
                    Toast.makeText(MainActivity.this, "yess", Toast.LENGTH_SHORT).show();

            }
        });
        btnTest=(Button)findViewById(R.id.btnTest);
        btnTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view,"First Test",Snackbar.LENGTH_LONG).show();
            }
        });
       /* edtFname.setFocusable(false);
        edtFname.setFocusableInTouchMode(false);*/
        edtFname.setInputType(InputType.TYPE_NULL);

    }
}
