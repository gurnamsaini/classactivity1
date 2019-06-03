package com.example.a1892745.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class classactivity1 extends AppCompatActivity {

    import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
    public class Register extends AppCompatActivity {

        EditText edt_name,edt_email,edt_pass ;
        Button btn_sub;
        String TAG="click register";
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.classactivity1);

            edt_name = findViewById(R.id.Name);
            edt_email = findViewById(R.id.eMail);
            edt_pass = findViewById(R.id.password);
            btn_sub = findViewById(R.id.register);

            final Toast mytoast = Toast.makeText(getApplicationContext(), edt_name.getText().toString(), Toast.LENGTH_SHORT);

            btn_sub.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String name = edt_name.getText().toString();
                    String email = edt_email.getText().toString();

                    Log.v(TAG, name);
                    Log.v(TAG, email);
                    Log.v(TAG, edt_pass.getText().toString());


                    // Toast.makeText(getApplicationContext(),edt_name.getText().toString(),Toast.LENGTH_LONG).show();
                    mytoast.setText("Hell!");
                    mytoast.setDuration(Toast.LENGTH_LONG);

                    mytoast.show();
                    Snackbar.make(v, "FloatingActionButton is clicked", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }

            });
        



