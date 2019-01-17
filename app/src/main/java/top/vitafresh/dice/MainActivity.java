package top.vitafresh.dice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_roll;
        btn_roll = (Button) findViewById(R.id.btn_roll);

        ImageView imgLeftDice, imgRightDice;
        imgLeftDice = (ImageView) findViewById(R.id.img_leftDice);
        imgRightDice=(ImageView) findViewById(R.id.img_rightDice);
        



    }
}
