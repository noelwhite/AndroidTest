package CrediteraWidgets;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.Button;

import com.example.android.animationsdemo.R;


/**
 * Created by turtlepig on 12/19/13.
 */
public class ActionButton extends Button{

    public ActionButton(Context context){
        super(context);
        initialize();
    }
    public ActionButton(Context context, AttributeSet attrs){
        super(context, attrs);
        initialize();
    }
    public ActionButton(Context context, AttributeSet attrs, int defStyle){
        super(context, attrs, defStyle);
        initialize();
    }

    private void initialize(){
        this.setBackgroundColor(this.getResources().getColor(R.color.lightblue));
        Typeface tf = Typeface.createFromAsset(this.getContext().getAssets(),
                "fonts/ProximaNova-Regular.otf");
        this.setTypeface(tf);

    }
}
