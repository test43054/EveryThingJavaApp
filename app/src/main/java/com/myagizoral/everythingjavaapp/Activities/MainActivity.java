package com.myagizoral.everythingjavaapp.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.myagizoral.everythingjavaapp.R;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user touches the button */
    public void buttonClick(View view) {
        // Do something in response to button click
        TextView textView = findViewById(R.id.textView);
        textView.setText("Butona tıkladıkdan sonraki yazı ve intentle second activity'ye gitti");
    }

    public void changeActivity(View view){
        Intent intent = new Intent(this, FourthActivity.class);
        TextView textView = findViewById(R.id.textView);
        String message = textView.getText().toString();
        intent.putExtra("message", message);
        startActivity(intent);
    }

    public void toastMessageButtonClick(View view){
        Toast.makeText(this, "This is my Toast Message !!",
                Toast.LENGTH_LONG).show();
    }

    public void goToThirdActivity(View view){
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);
    }

}