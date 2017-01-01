package com.example.linyuming.mediaplayerservice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0,0,0,getString(R.string.startServiceMusic));
        menu.add(0,1,0,getString(R.string.stopServiceMusic));
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
       Intent intent=new Intent(this,MyService.class);
        switch (item.getItemId()){
            case 0:
                startService(intent);
                break;
            case 1:
                stopService(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
