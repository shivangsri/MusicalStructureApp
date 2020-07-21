package android.example.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PlayerActivity extends AppCompatActivity {

    Button previous_button;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player);

        previous_button = (Button)findViewById(R.id.btn_home);

        // Add_button add clicklistener
        previous_button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {

                // Intents are objects of the android.content.Intent type. Your code can send them
                // to the Android system defining the components you are targeting.
                // Intent to start an activity called oneActivity with the following code:

                Intent intent = new Intent(PlayerActivity.this, MainActivity.class);

                // start the activity connect to the specified class
                startActivity(intent);
            }
        });

        playing();
    }

    public void playing() {
        // Get extras from Intent.
        Intent opusIntent = getIntent();

        // Set the name of opus for playing.
        TextView opusTextView = findViewById(R.id.player_opus);
        String opusForPlaying = opusIntent.getStringExtra("opus");
        opusTextView.setText(opusForPlaying);

        // Set the name of composer for playing.
        TextView composerTextView = findViewById(R.id.player_composer);
        String composerForPlaying = opusIntent.getStringExtra("composer");
        composerTextView.setText(composerForPlaying);
    }


}
