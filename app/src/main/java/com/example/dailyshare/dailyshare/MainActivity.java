package com.example.dailyshare.dailyshare;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {
    private Button sign_up_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sign_up_listener();
    }

    public void sign_up_listener(){
        sign_up_button=(Button)findViewById(R.id.sign_up_button);

        sign_up_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sign_up_activity = new Intent(getApplicationContext(), sign_up_Activity.class);
                startActivity(sign_up_activity);
            }
        });
    }

    //This part is to test GitHub, Cheers

}
