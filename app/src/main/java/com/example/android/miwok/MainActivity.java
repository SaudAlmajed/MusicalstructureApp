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

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        TextView r = (TextView) findViewById(R.id.rashed);

        r.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent Music1Intent = new Intent(MainActivity.this, Music1.class);
                startActivity(Music1Intent);
            }
        });

        TextView asalh = (TextView) findViewById(R.id.asalh);

        asalh.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {

                Intent Music2Intent = new Intent(MainActivity.this, Music2.class);

                startActivity(Music2Intent);
            }
        });

        TextView rabeh = (TextView) findViewById(R.id.rabeh);

        rabeh.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the Music3 category is clicked on.
            @Override
            public void onClick(View view) {
                Intent Music3Intent = new Intent(MainActivity.this, Music3.class);

                startActivity(Music3Intent);
            }
        });


    }
}