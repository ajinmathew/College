package com.ajinmathew.project.cs.college;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText getName,getRoll,getAdm,getCollege;
Button btnSubmit;
String Name,RollNo,College,AdmNo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        getName=(EditText)findViewById( R.id.name );
        getRoll=(EditText)findViewById( R.id.rollno );
        getCollege=(EditText)findViewById( R.id.college );
        getAdm=(EditText)findViewById( R.id.admissionno );
        btnSubmit=(Button)findViewById( R.id.submit );
        btnSubmit.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Name=getName.getText().toString();
                RollNo=getRoll.getText().toString();
                College=getCollege.getText().toString();
                AdmNo=getAdm.getText().toString();
                Toast.makeText( getApplicationContext(),Name+" "+AdmNo,Toast.LENGTH_SHORT ).show();

            }
        } );
    }
}
