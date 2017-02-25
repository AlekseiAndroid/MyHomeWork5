package com.homework5.afor.myhomework5;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView site;
    TextView map;
    TextView tel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        map = (TextView) findViewById(R.id.map);
        map.setOnClickListener(this);

        site = (TextView) findViewById(R.id.site);
        site.setOnClickListener(this);

        tel = (TextView) findViewById(R.id.tel);
        tel.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId())
        {
            case R.id.site:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.lacosanostra.ck.ua"));
                startActivity(intent);
                break;
            case R.id.map:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:49.452826,32.043038"));
                startActivity(intent);
                break;
            case R.id.tel:
                intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:0976287171"));
                startActivity(intent);
                break;

        }
    }
}
