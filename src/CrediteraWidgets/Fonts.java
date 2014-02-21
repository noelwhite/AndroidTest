package CrediteraWidgets;

import android.content.Context;
import android.graphics.Typeface;

/**
 * Created by turtlepig on 1/3/14.
 */
public class Fonts {

    public static final int FONT_BOLD =1;
    public static final int FONT_BOLD_ITALICS =2;
    public static final int FONT_LIGHT =3;
    public static final int FONT_LIGHT_ITALICS =4;
    public static final int FONT_REGULAR =5;
    public static final int FONT_REGULAR_ITALICS =6;
    public static final int FONT_SEMIBOLD =7;
    public static final int FONT_SEMIBOLD_ITALICS =8;

    static public Typeface getFont(int magicNumber, Context context){
        Typeface typeface;
        switch (magicNumber){
            case FONT_BOLD: typeface = Typeface.createFromAsset(context.getAssets(),
                    "fonts/ProximaNova-Bold.otf");
                break;
            case FONT_BOLD_ITALICS: typeface = Typeface.createFromAsset(context.getAssets(),
                    "fonts/ProximaNova-Boldit.otf");
                break;
            case FONT_LIGHT: typeface = Typeface.createFromAsset(context.getAssets(),
                    "fonts/ProximaNova-Light.otf");
                break;
            case FONT_LIGHT_ITALICS: typeface = Typeface.createFromAsset(context.getAssets(),
                    "fonts/ProximaNova-LightItalic.otf");
                break;
            case FONT_REGULAR: typeface = Typeface.createFromAsset(context.getAssets(),
                    "fonts/ProximaNova-Regular.otf");
                break;
            case FONT_REGULAR_ITALICS: typeface = Typeface.createFromAsset(context.getAssets(),
                    "fonts/ProximaNova-RegItalic.otf");
                break;
            case FONT_SEMIBOLD: typeface = Typeface.createFromAsset(context.getAssets(),
                    "fonts/ProximaNova-Semibold.otf");
                break;
            case FONT_SEMIBOLD_ITALICS: typeface = Typeface.createFromAsset(context.getAssets(),
                    "fonts/ProximaNova-SemiboldItalic.otf");
                break;
            default: typeface = Typeface.createFromAsset(context.getAssets(),
                    "fonts/ProximaNova-Regular.otf");
        }

        return typeface;
    }
}
