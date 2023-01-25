package com.example.pa1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button EXIT;
    private android.app.AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EXIT=(Button)findViewById(R.id.EXIT);
        EXIT.setOnClickListener ( new View.OnClickListener (){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder=new AlertDialog.Builder ( v.getContext () );
                builder.setTitle ( "PROGRAM NO.01" );
                builder.setMessage ( "Are you sure want to exit?" );
                builder.setPositiveButton ( "YES", new DialogInterface.OnClickListener () {
                    @Override
                    public void onClick(DialogInterface dialog, int which) { finish(); }
                } );
                builder.setNegativeButton( "NO", new DialogInterface.OnClickListener () {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss ();
                    }
                });
                builder.setNeutralButton( "CANCEL", new DialogInterface.OnClickListener () {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel ();
                    }
                });
                builder.create ().show();
            }
        } );
    }
}