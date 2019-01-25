package com.example.student.miwok_stp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        //creating the arrayList of stringType of words
    final ArrayList<Word> words = new ArrayList<Word>();

        //this is a typical way to create object of word class and then adding those individual onjects in words arraylist
        //        Word w = new Word("one","Lutti");
        //        words.add(w);


        words.add(new Word(R.drawable.family_father,"father", "әpә",R.raw.family_father));
        words.add(new Word(R.drawable.family_mother,"mother", "әṭa",R.raw.family_mother));
        words.add(new Word(R.drawable.family_son,"son", "angsi",R.raw.family_son));
        words.add(new Word(R.drawable.family_daughter,"daughter", "tune",R.raw.family_daughter));
        words.add(new Word(R.drawable.family_older_brother,"older brother", "taachi",R.raw.family_older_brother));
        words.add(new Word(R.drawable.family_younger_brother,"younger brother", "chalitti",R.raw.family_younger_brother));
        words.add(new Word(R.drawable.family_older_sister,"older sister", "teṭe",R.raw.family_older_sister));
        words.add(new Word(R.drawable.family_younger_sister,"younger sister", "kolliti",R.raw.family_younger_sister));
        words.add(new Word(R.drawable.family_grandmother,"grandmother ", "ama",R.raw.family_grandmother));
        words.add(new Word(R.drawable.family_grandfather,"grandfather", "paapa",R.raw.family_grandfather));



        //declaring the arrayAdapter
        WordAdapter adapter = new WordAdapter(this,words,R.color.category_family);

        //declaring the listView
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);

       //setting up the listvview clicks
        //please remember listview is a subclass off adapter view.
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(FamilyActivity.this,"ListView Clicked",Toast.LENGTH_LONG).show();
                Word word =words.get(position);

                MediaPlayer mediaPlayer = MediaPlayer.create(FamilyActivity.this,word.getAudioResourceId());
                mediaPlayer.start();

            }
        });

    }
}
