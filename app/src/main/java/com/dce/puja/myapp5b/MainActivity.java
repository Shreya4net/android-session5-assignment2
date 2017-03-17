package com.dce.puja.myapp5b;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.item1:
                Toast.makeText(MainActivity.this,"item 1 clicked",Toast.LENGTH_LONG).show();
                break;
            case R.id.item2:
            Toast.makeText(MainActivity.this,"item 2 clicked",Toast.LENGTH_LONG).show();
            break;
            case R.id.item3:
            Toast.makeText(MainActivity.this,"item 3 clicked",Toast.LENGTH_LONG).show();
            break;

            case R.id.item4:
                Toast.makeText(MainActivity.this,"item 4 clicked",Toast.LENGTH_LONG).show();
                break;
            case R.id.item5:
                Toast.makeText(MainActivity.this,"Item 5 clicked",Toast.LENGTH_LONG).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
