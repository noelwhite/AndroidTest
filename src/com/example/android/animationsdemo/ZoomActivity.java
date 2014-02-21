/*
 * Copyright 2012 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.animationsdemo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.NavUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * A sample showing how to zoom an image thumbnail to full-screen, by animating the bounds of the
 * zoomed image from the thumbnail bounds to the screen bounds.
 *
 * <p>In this sample, the user can touch one of two images. Touching an image zooms it in, covering
 * the entire activity content area. Touching the zoomed-in image hides it.</p>
 */
public class ZoomActivity extends FragmentActivity{
    /**
     * Hold a reference to the current animator, so that it can be canceled mid-way.
     */
    private Animator mCurrentAnimator;

    /**
     * The system "short" animation time duration, in milliseconds. This duration is ideal for
     * subtle animations or animations that occur very frequently.
     */
    private int mShortAnimationDuration;
    ImageAdapter imageAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

//        GridView gridview = (GridView) findViewById(R.id.gridview);
//        imageAdapter = new ImageAdapter(this);
//        gridview.setAdapter(imageAdapter);
        // Hook up clicks on the thumbnail views.
        //createBitmap(int width, int height, Bitmap.Config config)
        //TODO make an image out of the view for this animation, that way the view can be dynamic and display different scores
////    Returns a mutable bitmap with the specified width and height.
//        Bitmap image = Bitmap.createBitmap(mapRelativeView.getWidth(), mapRelativeView.getHeight(), Bitmap.Config.RGB_565);
//
////draw(Canvas canvas) -- Manually render this view
////(and all of its children) to the given Canvas.
//        yourView.draw(new Canvas(image));
//
////insertImage(ContentResolver cr, Bitmap source, String title, String description)
////    Insert an image and create a thumbnail for it.
////uri is the path after the image has been saved.
//        String uri = Images.Media.insertImage(getContentResolver(), image, "title", null);

    }



    final public void startNext(){
        Intent intent = new Intent(this, ScreenSlideActivity.class);
        startActivity(intent);
    }



//    @Override
//    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//            if(i==0){
//                zoomImageFromThumb(imageAdapter.getView(0, null, null), R.drawable.experianpersonaltile);
////                    Toast.makeText(ZoomActivity.this, "case 0 hit with position " + i, Toast.LENGTH_SHORT).show();
////                    Intent intent = new Intent(this, ScreenSlideActivity.class);
////                    startActivity(intent);
//            }
//            if(i==4){
//                zoomImageFromThumb(imageAdapter.getView(4, null, null), R.drawable.experianpersonaltile);
////                    Toast.makeText(ZoomActivity.this, "case 4 hit with position " + i, Toast.LENGTH_SHORT).show();
////                    Intent intent = new Intent(this, ActivityPlans.class);
////                startActivity(intent);
//            }
//
//    }
}
