package CrediteraWidgets;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TableRow;
import android.widget.TextView;
import android.view.View.OnClickListener;

import com.example.android.animationsdemo.R;

/**
 * Created by turtlepig on 1/9/14.
 */
public class ToggleWidget extends TableRow implements OnClickListener {

    ImageView personalButton;
    ImageView businessButton;
    String playerName, playerPosition;
    int playerIndex;
    Button  editButton;
    OnClickListener clickums;
    OnTouchListener touchums;

    public ToggleWidget(Context context){
        super(context);
        initialize();
//		playerView.setHeight(this.getHeight());
        // TODO Auto-generated constructor stub
    }

    public ToggleWidget(Context context, AttributeSet attrs){
        super(context, attrs);
        initialize();
    }

//    public ToggleWidget(Context context, AttributeSet attrs, int defStyle){
//        super(context, attrs, defStyle);
//        initialize();
//    }

    public void initialize(){
        personalButton = new ImageView(this.getContext());
        personalButton = (ImageView) findViewById(R.layout.widget);
//        businessButton = (ImageView) this.findViewById(R.drawable.iconbusinesson);
//        this.addTouchables();

//        playerView = new TextView(context);
//        playerView.setTag(playerIndex);
//        playerView.setOnTouchListener(touchums);
//        playerView.setLayoutParams(new android.widget.TableRow.LayoutParams(android.widget.TableRow.LayoutParams.WRAP_CONTENT,
//                android.widget.TableRow.LayoutParams.WRAP_CONTENT, 1.0f));
//        playerView.setTextSize(22);


        this.addView(personalButton);
//        this.addView(businessButton);
    }




    @Override
    public void onClick(View arg0) {
        // TODO Auto-generated method stub
    }

}
