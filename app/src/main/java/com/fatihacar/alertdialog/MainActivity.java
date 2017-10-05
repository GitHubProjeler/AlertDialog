package com.fatihacar.alertdialog;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void save(View view){
        AlertDialog.Builder alert=new AlertDialog.Builder(this);//nesne tanımlanıyor

        alert.setTitle("Save");//Mesaj başlığı
        alert.setMessage("Are You Sure?");//Mesaj

        //Evet butonuna tıklyınca yapılacak işlemler
        alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(),"Saved",Toast.LENGTH_LONG).show();
            }
        });

        //Hayır butonuna tıklayına yapılacak işlemler
        alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(),"Not Saved",Toast.LENGTH_LONG).show();
            }
        });
        alert.show();
    }
}
