package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.SeekBar;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);

        //create a local variable and use reference
        CakeView newCV = findViewById(R.id.cakeview);

        //create new CakeController object
        CakeController newCC = new CakeController(newCV);

        //retrieve a reference to "Blow Out" button
        Button boButt = findViewById(R.id.Extinguish);
        CompoundButton switchCandle = findViewById(R.id.candlesSwitch2);
        SeekBar numCandles = findViewById(R.id.candleNumSeekBar);

        //register button
        boButt.setOnClickListener(newCC);
        switchCandle.setOnCheckedChangeListener(newCC);
        numCandles.setOnSeekBarChangeListener(newCC);
    }

    public void goodbye(View button) {
        Log.i("button", "Goodbye");
    }
}
