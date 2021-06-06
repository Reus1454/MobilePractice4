package ru.mirea.kopeykin.looper;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Message;
import android.view.View;


import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    static MyLooper myLooper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myLooper = new MyLooper();
        myLooper.start();
    }
    public void onClick(View view) {
        Message msg = new Message();
        Bundle bundle = new Bundle();
        bundle.putString("KEY", "mirea");
        msg.setData(bundle);
        if (myLooper != null) {
            myLooper.handler.sendMessage(msg);
        }
    }
}