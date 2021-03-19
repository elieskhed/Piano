package project.curretntaly.com.piano;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button doo,re,mi,fa,sol,la,si,doo2,re2,mi2;
    Button no1,no2,no3,no4,no5,no6,no7;
    protected MediaPlayer mp1 = null;
    protected MediaPlayer mp2 = null;
    protected MediaPlayer mp3 = null;
    protected MediaPlayer mp4 = null;
    protected MediaPlayer mp5 = null;
    protected MediaPlayer mp6 = null;
    protected MediaPlayer mp7 = null;
    protected MediaPlayer mp8 = null;
    protected MediaPlayer mp9 = null;
    protected MediaPlayer mp10 = null;
    protected MediaPlayer mp11 = null;
    protected MediaPlayer mp12 = null;
    protected MediaPlayer mp13 = null;
    protected MediaPlayer mp14 = null;

    Button learn_1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piano);

        doo = ((Button) findViewById(R.id.doo));
        re = ((Button) findViewById(R.id.re));
        mi = ((Button) findViewById(R.id.mi));
        fa = ((Button) findViewById(R.id.fa));
        sol = ((Button) findViewById(R.id.sol));
        la = ((Button) findViewById(R.id.la));
        si = ((Button) findViewById(R.id.si));
        doo2 = ((Button) findViewById(R.id.doo2));
        re2 = ((Button) findViewById(R.id.re2));
        mi2 = ((Button) findViewById(R.id.mi2));

        no1 = ((Button) findViewById(R.id.no1));
        no2 = ((Button) findViewById(R.id.no2));
        no3 = ((Button) findViewById(R.id.no3));
        no4 = ((Button) findViewById(R.id.no4));
        no5 = ((Button) findViewById(R.id.no5));
        no6 = ((Button) findViewById(R.id.no6));
        no7 = ((Button) findViewById(R.id.no7));

        mp1 = ((MediaPlayer.create(this,R.raw.doo)));
        mp2 = ((MediaPlayer.create(this,R.raw.re)));
        mp3 = ((MediaPlayer.create(this,R.raw.mi)));
        mp4 = ((MediaPlayer.create(this,R.raw.fa)));
        mp5 = ((MediaPlayer.create(this,R.raw.sol)));
        mp6 = ((MediaPlayer.create(this,R.raw.la)));
        mp7 = ((MediaPlayer.create(this,R.raw.si)));

        mp8 = ((MediaPlayer.create(this,R.raw.nodo)));
        mp9 = ((MediaPlayer.create(this,R.raw.nore)));
        mp10 = ((MediaPlayer.create(this,R.raw.nomi)));
        mp11 = ((MediaPlayer.create(this,R.raw.nofa)));
        mp12 = ((MediaPlayer.create(this,R.raw.nosol)));
        mp13 = ((MediaPlayer.create(this,R.raw.nola)));
        mp14 = ((MediaPlayer.create(this,R.raw.nosi)));

        learn_1 = ((Button) findViewById(R.id.learn1));

        doo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp1.start();
            }
        });

        re.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp2.start();
            }
        });

        mi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp3.start();
            }
        });

        fa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp4.start();
            }
        });

        sol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp5.start();
            }
        });

        la.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp6.start();
            }
        });
        si.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp7.start();
            }
        });
        doo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp1.start();
            }
        });
        re2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp2.start();
            }
        });
        mi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp3.start();
            }
        });
        no1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp8.start();
            }
        });
        no2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp9.start();
            }
        });
        no3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp10.start();
            }
        });
        no4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp11.start();
            }
        });
        no5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp12.start();
            }
        });
        no6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp13.start();
            }
        });
        no7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp14.start();
            }
        });



    }
}
