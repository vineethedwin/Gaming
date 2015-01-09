package com.example.testgesture;

import android.app.Activity;

import android.os.Bundle;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Toast;

public class MainActivity extends Activity{


    private GestureDetector mGestureDetector;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
           
            // Bind the gestureDetector to GestureListener
            mGestureDetector = new GestureDetector(this, new GestureListner());
    }

    // onTouch() method gets called each time you perform any touch event with screen
    @Override
    public boolean onTouchEvent(MotionEvent event)
    {
        //method onTouchEvent of GestureDetector class Analyzes the given motion event
        //and if applicable triggers the appropriate callbacks on the GestureDetector.OnGestureListener supplied.
        //Returns true if the GestureDetector.OnGestureListener consumed the event, else false.
       
        boolean eventConsumed=mGestureDetector.onTouchEvent(event);
            if (eventConsumed)
            {
              Toast.makeText(getApplicationContext(), "if", Toast.LENGTH_SHORT).show();
                return true;
            }
            else
            {
                Toast.makeText(getApplicationContext(), "else", Toast.LENGTH_SHORT).show();
           

                return false;
            }}



	
}
