package com.skaloot.skalootapp;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class DetailActivity extends AppCompatActivity {

    final String TAG = "GetDetail.java";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent intent = getIntent();
        String message = intent.getStringExtra(ListActivity.DetailText);
        TextView textView = new TextView(this);
        textView.setTextSize(20);
        textView.setText(message);

        RelativeLayout layout = (RelativeLayout) findViewById(R.id.content_detail);
        layout.addView(textView);
    }



    @Override
    public void onBackPressed() {
    	Log.e(TAG, "Button Back");
        finish();
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                break;
        }
        return true;
    }

}

