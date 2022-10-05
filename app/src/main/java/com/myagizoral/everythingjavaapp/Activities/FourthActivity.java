package com.myagizoral.everythingjavaapp.Activities;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.myagizoral.everythingjavaapp.R;

public class FourthActivity extends AppCompatActivity {

    private String[] ulkeler =
            {"Türkiye", "Almanya", "Avusturya", "Amerika", "İngiltere",
                    "Macaristan", "Yunanistan", "Rusya", "Suriye", "İran", "Irak",
                    "Şili", "Brezilya", "Japonya", "Portekiz", "İspanya",
                    "Makedonya", "Ukrayna", "İsviçre"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondactivity_main);


        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra("message");

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.textView2);
        textView.setText(message);

        //(A) adımı
        ListView listemiz=(ListView) findViewById(R.id.listView);

        //(B) adımı
        ArrayAdapter<String> veriAdaptoru=new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_2, android.R.id.text1, ulkeler);

        //(C) adımı
        listemiz.setAdapter(veriAdaptoru);

        listemiz.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(getBaseContext(),MainActivity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "test için ana sayfaya dönüldü",
                        Toast.LENGTH_LONG).show();

            }
        });


    }


}
