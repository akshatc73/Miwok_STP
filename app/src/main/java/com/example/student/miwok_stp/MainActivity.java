package com.example.student.miwok_stp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView numbers = (TextView)findViewById(R.id.numbersActivity);
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nActivity = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(nActivity);
         }
        });
        TextView phrases =(TextView)findViewById(R.id.phrasesActivity);
        phrases.setOnClickListener(
                new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nActivity = new Intent(MainActivity.this,PhrasesActivity.class);
                startActivity(nActivity);
            }
        });
              TextView colors =(TextView)findViewById(R.id.colorsActivity);
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nActivity = new Intent(MainActivity.this,ColorsActivity.class);
                startActivity(nActivity);
            }
        });
              TextView family =(TextView)findViewById(R.id.familyActivity);
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nActivity = new Intent(MainActivity.this,FamilyActivity.class);
                startActivity(nActivity);
            }
        });
    }
//  public void onClick(View view){
//
//        switch (view.getId()){
//            case R.id.numbersActivity:
//                //the first input of the intent constructor takes the current state of the app so that we can put abovve the second activity i.e here NumbersActivity
//                //above first activity and then the back button will work. it will move on to the activity which is passed as first agrument.
//                Intent nActivity = new Intent(this, NumbersActivity.class);
//                startActivity(nActivity);
//                break;
//            case R.id.phrasesActivity:
//                Intent pActivity = new Intent(this, PhrasesActivity.class);
//                startActivity(pActivity);
//                break;
//            case R.id.colorsActivity:
//                Intent cActivity = new Intent(this, ColorsActivity.class);
//                startActivity(cActivity);
//                break;
//            case R.id.familyActivity:
//                Intent fActivity = new Intent(this, FamilyActivity.class);
//                startActivity(fActivity);
//                break;
//                default:
//                    break;
//
//        }
//    }


}
