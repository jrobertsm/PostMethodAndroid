package com.jrsm.android.ejemplopost;

import android.os.Bundle;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private TextView tv1;
    private final String SERVER = "http://192.168.1.70/app_android/app.php";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
                .permitAll().build();
        StrictMode.setThreadPolicy(policy);

        setContentView(R.layout.activity_main);

        HttpHandler handler = new HttpHandler();

        String txt = handler.post(SERVER);
        tv1 = (TextView) findViewById(R.id.text1);
        tv1.setText(txt);
    }




}
