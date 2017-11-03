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
        Log.i(MY_TAG,"onCreateEvent");
        Toast.makeText(this,"Welcome user!",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(MY_TAG,"onStartEvent");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(MY_TAG,"onResumeEvent");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(MY_TAG,"onPauseEvent");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(MY_TAG,"onStopEvent");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(MY_TAG,"onStopEvent");
    }

    public void buttonClicked(View v)
    {
        EditText edName = (EditText)findViewById(R.id.nameText);
        if(edName.getText().length() == 0)
        {
            Toast.makeText(this,"You must fill the name field before clicking this button",Toast.LENGTH_LONG).show();
        }
        else
        {
            this.cnt++;
            Toast.makeText(this, edName.getText()+": The button was clicked "+cnt+" times",Toast.LENGTH_LONG).show();
        }
    }
}
