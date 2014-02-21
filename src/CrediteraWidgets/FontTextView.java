package CrediteraWidgets;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;


/**
 * Created by turtlepig on 1/2/14.
 */
public class FontTextView extends TextView{

    public FontTextView(Context context){
        super(context);
        initialize();
    }
    public FontTextView(Context context, AttributeSet attrs){
        super(context, attrs);
        initialize();
    }
    public FontTextView(Context context, AttributeSet attrs, int defStyle){
        super(context,attrs,defStyle);
        initialize();
    }

    private void initialize(){

        this.setTypeface(Fonts.getFont(Fonts.FONT_BOLD, this.getContext()));
    }
}
