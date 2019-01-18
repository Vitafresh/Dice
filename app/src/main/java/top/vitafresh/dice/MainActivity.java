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

        ImageView imgLeftDice, imgRightDice;
        imgLeftDice = (ImageView) findViewById(R.id.img_leftDice);
        imgRightDice=(ImageView) findViewById(R.id.img_rightDice);

        btn_roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Dice","The btn has been pressed");

                Random rndGenerator = new Random();
                int numDiceOne = rndGenerator.nextInt(6);
                Log.d("Dice","Rnd = " + (numDiceOne + 1));
            }
        });





    }
}
