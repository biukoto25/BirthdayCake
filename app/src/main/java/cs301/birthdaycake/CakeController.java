package cs301.birthdaycake;

import android.graphics.Canvas;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController
        implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener {
    private CakeView cakeview;
    private CakeModel cakeModel;

    public CakeController(CakeView cakeview) {
        this.cakeview = cakeview;
        this.cakeModel = cakeview.getCakeModel();
    }

    @Override
    public void onClick(View view) {
        Log.d("cake", "click!");
        cakeModel.candleLit = false;
        cakeview.invalidate();

    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        cakeModel.hasCandles = b;
        cakeview.invalidate();

    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean userChange) {
        cakeModel.numCandle = progress;
        cakeview.invalidate();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) { //do nothing

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) { //do nothing

    }
}
