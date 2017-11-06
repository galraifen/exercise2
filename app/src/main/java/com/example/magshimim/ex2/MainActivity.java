package com.example.magshimim.ex2;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends Activity {
    private int cnt = 0;
    final String MY_TAG = "EX2.MAIN_ACTIVITY";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);
        Log.i(MY_TAG,getString(R.string.onCEvent));
        if(savedInstanceState == null){
        Toast.makeText(this,getString(R.string.welcome),Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(MY_TAG,getString(R.string.onSEvent));
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(MY_TAG,getString(R.string.onREvent));
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(MY_TAG,getString(R.string.onPEvent));
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(MY_TAG,getString(R.string.onStopEvent));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(MY_TAG,getString(R.string.onDEvent));
    }

    public void buttonClicked(View v)
    {
        EditText edName = (EditText)findViewById(R.id.nameText);
        if(edName.getText().length() == 0)
        {
            Toast.makeText(this,getString(R.string.userAlert),Toast.LENGTH_LONG).show();
        }
        else
        {
            this.cnt++;
            Toast.makeText(this, edName.getText()+getString(R.string.ansPart1)+cnt+getString(R.string.ansPart2),Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("cnt",cnt);
        Log.i(MY_TAG,getString(R.string.onSInstance));
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState != null)
        {
            this.cnt = savedInstanceState.getInt("cnt");
        }
        Log.i(MY_TAG,getString(R.string.onRInstance));
    }
}
