package CrediteraWidgets;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.Button;

import com.example.android.animationsdemo.R;

/**
 * Created by turtlepig on 12/19/13.
 */
public class NavigationButton extends Button{





    public NavigationButton(Context context){
        super(context);
        initialize();
    }
    public NavigationButton(Context context, AttributeSet attrs){
        super(context, attrs);
        initialize();
    }
    public NavigationButton(Context context, AttributeSet attrs, int defStyle){
        super(context,attrs,defStyle);
        initialize();
    }

    private void initialize(){
        Typeface tf = Typeface.createFromAsset(this.getContext().getAssets(),
                "fonts/ProximaNova-Regular.otf");
        this.setTypeface(tf);
        this.setBackgroundColor(this.getResources().getColor(R.color.tangrey));
    }
}
