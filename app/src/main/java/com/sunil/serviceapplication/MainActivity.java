package com.sunil.serviceapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button start,stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start = (Button)findViewById(R.id.start_service);
        start.setOnClickListener(this);
        stop = (Button)findViewById(R.id.stop_service);
        stop.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.start_service:
                startService(new Intent(this,MyService.class));
                Toast.makeText(getApplicationContext(),"Serives Started",Toast.LENGTH_SHORT).show();
                break;

            case R.id.stop_service:
                startActivity(new Intent(this,MyService.class));
                Toast.makeText(getApplicationContext(),"Services Stopped",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
