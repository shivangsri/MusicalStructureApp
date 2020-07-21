package android.example.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Find the View that shows the hiphop category
        TextView hiphop = findViewById(R.id.hiphop);

        // Set a click listener on that View
        hiphop.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the hiphop View is clicked on.
            @Override
            public void onClick(View view) {
                Intent hiphopIntent = new Intent(MainActivity.this, HipHopActivity.class);
                startActivity(hiphopIntent);
            }
        });


        // Find the View that shows the dance category
        TextView dance = findViewById(R.id.dance);

        // Set a click listener on that View
        dance.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the dance View is clicked on.
            @Override
            public void onClick(View view) {
                Intent danceIntent = new Intent(MainActivity.this, DanceActivity.class);
                startActivity(danceIntent);
            }
        });


        // Find the View that shows the romantic category
        TextView romantic = findViewById(R.id.romantic);

        // Set a click listener on that View
        romantic.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the romantic View is clicked on.
            @Override
            public void onClick(View view) {
                Intent romanticlIntent = new Intent(MainActivity.this, RomanticActivity.class);
                startActivity(romanticlIntent);
            }
        });
    }

}
