package top.vitafresh.dice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("Dice","On create!");

        Button btn_roll;
        btn_roll = (Button) findViewById(R.id.btn_roll);

        final ImageView imgLeftDice, imgRightDice;
        imgLeftDice = (ImageView) findViewById(R.id.img_leftDice);
        imgRightDice=(ImageView) findViewById(R.id.img_rightDice);

        final int[] diceArray={
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };

        btn_roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Dice","The btn has been pressed");

                Random rndGenerator = new Random();
                int numDice = rndGenerator.nextInt(6);
                Log.d("Dice","Rnd1 = " + (numDice + 1));
                imgLeftDice.setImageResource(diceArray[numDice]);

                numDice=rndGenerator.nextInt(6);
                Log.d("Dice","Rnd2 = " + (numDice + 1));
                imgRightDice.setImageResource(diceArray[numDice]);


            }
        });





    }
}
