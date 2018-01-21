/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

//////////////////////////////////////////// using onClick in XML  /////////////////////////////////
//    public void openNumbers(View mostafa)
//    {
//        Intent i = new Intent(this,NumbersActivity.class);
//        startActivity(i);
//    }
//    public void openFamily(View mohamed)
//    {
//        Intent i = new Intent(MainActivity.this,FamilyActivity.class);
//        startActivity(i);
//    }
//    public void openColors(View v)
//    {
//        Intent i = new Intent(getApplicationContext(),ColorsActivity.class);
//        startActivity(i);
//    }
//    public void openPhrases(View view)
//    {
//        Intent i = new Intent(this,PhrasesActivity.class);
//        startActivity(i);
//    }
////////////////////////////////////////////////////////////////////////////////////////////////////
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);
////////////////////////////////////////////////////////////  setOnClickListener ///////////////////
        TextView numbersTV= (TextView)findViewById(R.id.numbers);
        numbersTV.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),NumbersActivity.class);
                startActivity(i);
            }
        });

        TextView familyMembers = (TextView) findViewById(R.id.family);
        familyMembers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,FamilyActivity.class);
                startActivity(i);
            }
        });

        final TextView colorsTextView = (TextView) findViewById(R.id.colors);
        colorsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentColor = new Intent(colorsTextView.getContext(),ColorsActivity.class);
                startActivity(intentColor);
            }
        });
        TextView phrasesTextView = (TextView) findViewById(R.id.phrases);
        phrasesTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),PhrasesActivity.class);
                startActivity(i);
            }
        });
////////////////////////////////////////////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////////////////////////////////////////////
//        TextView numbersTextView = (TextView) findViewById(R.id.numbers);
//        NumbersActivity clickListener = new NumbersActivity();
//        numbersTextView.setOnClickListener(clickListener);
//
//        // Find the View that shows the numbers category
//        TextView numbers = (TextView) findViewById(R.id.numbers);
//
//        // Set a click listener on that View
//        numbers.setOnClickListener(new View.OnClickListener() {
//            // The code in this method will be executed when the numbers category is clicked on.
//            @Override
//            public void onClick(View view) {
//                // Create a new intent to open the {@link NumbersActivity}
//                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
//
//                // Start the new activity
//                startActivity(numbersIntent);
//            }
//        });
//
//        // Find the View that shows the family category
//        TextView family = (TextView) findViewById(R.id.family);
//
//        // Set a click listener on that View
//        family.setOnClickListener(new View.OnClickListener() {
//            // The code in this method will be executed when the family category is clicked on.
//            @Override
//            public void onClick(View view) {
//                // Create a new intent to open the {@link FamilyActivity}
//                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);
//
//                // Start the new activity
//                startActivity(familyIntent);
//            }
//        });
//
//        // Find the View that shows the colors category
//        TextView colors = (TextView) findViewById(R.id.colors);
//
//        // Set a click listener on that View
//        colors.setOnClickListener(new View.OnClickListener() {
//            // The code in this method will be executed when the colors category is clicked on.
//            @Override
//            public void onClick(View view) {
//                // Create a new intent to open the {@link ColorsActivity}
//                Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);
//
//                // Start the new activity
//                startActivity(colorsIntent);
//            }
//        });
//
//        // Find the View that shows the phrases category
//        TextView phrases = (TextView) findViewById(R.id.phrases);
//
//        // Set a click listener on that View
//        phrases.setOnClickListener(new View.OnClickListener() {
//            // The code in this method will be executed when the phrases category is clicked on.
//            @Override
//            public void onClick(View view) {
//                // Create a new intent to open the {@link PhrasesActivity}
//                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
//
//                // Start the new activity
//                startActivity(phrasesIntent);
//            }
//        });
/////////////////////////////////////////////////////////////////////////////////////////////////////




    }
//    Intent i = new Intent(this, NumbersActivity.class);
//    startActivity(i);


}
