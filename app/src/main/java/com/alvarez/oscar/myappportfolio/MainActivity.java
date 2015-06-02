package com.alvarez.oscar.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((Button) findViewById(R.id.buttonSpotifyStreamer)).setOnClickListener(this);
        ((Button) findViewById(R.id.buttonBaconReader)).setOnClickListener(this);
        ((Button) findViewById(R.id.buttonBuildItbigger)).setOnClickListener(this);
        ((Button) findViewById(R.id.buttonCapstone)).setOnClickListener(this);
        ((Button) findViewById(R.id.buttonLibraryApp)).setOnClickListener(this);
        ((Button) findViewById(R.id.buttonScoresApp)).setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        StringBuilder sb = new StringBuilder("This button will launch ");
        switch (v.getId()) {
            case R.id.buttonSpotifyStreamer:
                sb.append(getResources().getString(R.string.main_spotify_streamer_button));
                break;
            case R.id.buttonBaconReader:
                sb.append(getResources().getString(R.string.main_reader_button));
                break;
            case R.id.buttonBuildItbigger:
                sb.append(getResources().getString(R.string.main_build_it_button));
                break;
            case R.id.buttonCapstone:
                sb.append(getResources().getString(R.string.main_capstone_buton));
                break;
            case R.id.buttonLibraryApp:
                sb.append(getResources().getString(R.string.main_library_app_button));
                break;
            case R.id.buttonScoresApp:
                sb.append(getResources().getString(R.string.main_scores_app_button));
                break;
            default:
                break;
        }
        Toast.makeText(this, sb, Toast.LENGTH_SHORT).show();
    }
}
