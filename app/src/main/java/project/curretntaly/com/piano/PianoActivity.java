package project.curretntaly.com.piano;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Administrateur on 17/02/2018.
 */

public class PianoActivity extends AppCompatActivity {

   private Button paysage;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        paysage = ((Button) findViewById(R.id.go));

        paysage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PianoActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
