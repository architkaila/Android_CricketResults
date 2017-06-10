package com.example.archit.cricketresults;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        Button B = (Button) findViewById(R.id.button1);
        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                LayoutInflater l = getLayoutInflater();
                View VV = l.inflate(R.layout.results, null);

               Toast t = new Toast(getApplicationContext());
               // t.setGravity(Gravity.CENTER, 0,0);
                t.setView(VV);
                t.show();
            }
        });


    }
}
