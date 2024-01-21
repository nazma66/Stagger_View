package com.example.straggerview;

import static android.icu.lang.UCharacter.DecompositionType.VERTICAL;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final int NUM_COLUMNS = 3 ;

private ArrayList<String> mImageUrlss = new ArrayList<>();
private ArrayList<String> mNamess = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initImageBitmaps();
    }




//
//mNames.add("Mahahual 🏝️");
//mNames.add("Frozen Lake ❄️");
//mNames.add("White Sands Desert 🏜️");
//mNames.add("Rocky Mountain 🏞️");
//mNames.add("Vibrant Mandala 🌟");
//mNames.add("Cool Tones 💙");
//mNames.add("Black & White ⚫⚪");
//mNames.add("Bright Colors 🌈");
//mNames.add("Pastel Shades 🍬");
//mNames.add("Bold Colors 🎨");
//mNames.add("Unique Blend 🌈");

    private void initImageBitmaps() {

        mImageUrlss.add("https://i.pinimg.com/736x/73/15/cf/7315cf94cca049ffc054e20998bdcc1f.jpg");
        mNamess.add("Radial Balance❤️⭕");

        mImageUrlss.add("https://i.pinimg.com/474x/74/85/a7/7485a7b5afe92c902be06662c1c02fc1.jpg");
        mNamess.add("Intricate Patterns");

        mImageUrlss.add("https://i.pinimg.com/474x/5b/b4/aa/5bb4aaef7f77ebcaab20b964348137e2.jpg");
        mNamess.add("Colorful Center");

        mImageUrlss.add("https://i.pinimg.com/474x/14/94/d0/1494d0f29ba05c0d879735138beb451e.jpg");
        mNamess.add("Dark Patterns\uD83D\uDDA4");

        mImageUrlss.add("https://i.pinimg.com/474x/f4/00/3e/f4003e627e108bc54566c0585742cd44.jpg");
        mNamess.add("Harmony Art");

        mImageUrlss.add("https://i.pinimg.com/736x/bd/85/4d/bd854d0317bfe51ad6d0d10883b9550e.jpg");
        mNamess.add("Unique Mandala");

        mImageUrlss.add("https://i.pinimg.com/474x/99/e7/b0/99e7b00c2f618b106c9c67d2d23fed20.jpg");
        mNamess.add("Hand-drawn Mandala");

        mImageUrlss.add("https://i.pinimg.com/474x/d9/df/c2/d9dfc2df79789280768508bd0648873a.jpg");
        mNamess.add("Harmony Art");

        mImageUrlss.add("https://i.pinimg.com/474x/1d/b4/20/1db420e7aec156eb2b87093c5ee37a4d.jpg");
        mNamess.add("Unique Mandala");

        mImageUrlss.add("https://i.pinimg.com/736x/9a/7f/b6/9a7fb68da0ec083b3eeeb7d304f59f94.jpg");
        mNamess.add("Dark Patterns\uD83D\uDDA4");

        mImageUrlss.add("https://i.pinimg.com/474x/47/d9/91/47d991f3cc0223e652d847284ca47f18.jpg");
        mNamess.add("Balance Representation");

        mImageUrlss.add("https://i.pinimg.com/736x/7d/fd/bf/7dfdbf2f990cea6f9462fe533d228f33.jpg");
        mNamess.add("Unique Mandala");
        mImageUrlss.add("https://i.pinimg.com/474x/e8/9a/b8/e89ab8784c1e615e8c1aa38dbf2062f8.jpg");
        mNamess.add("Balance Representation");

        mImageUrlss.add("https://i.pinimg.com/474x/e1/36/50/e13650a8641fb2102ae88924f74170ba.jpg");
        mNamess.add("Radial Balance");
        mImageUrlss.add("https://i.pinimg.com/474x/6a/40/b1/6a40b1279d299a8f07aec034ac748308.jpg");
        mNamess.add("Hand-drawn Mandala");
        mImageUrlss.add("https://i.pinimg.com/236x/8f/ec/48/8fec486aac7683509bf68fd03dafa8c4.jpg");
        mNamess.add("Concentric Design");

        mImageUrlss.add("https://i.pinimg.com/236x/56/39/41/5639410e01091f48a4967439104c548f.jpg");
        mNamess.add("Unique Mandala");
        mImageUrlss.add("https://i.pinimg.com/236x/42/66/81/4266815e3e62269adf93727cb09c9d4f.jpg");
        mNamess.add("Concentric Design");

        mImageUrlss.add("https://i.pinimg.com/236x/36/e8/9a/36e89a875feb10722d1605473b80e459.jpg");
        mNamess.add("Concentric Design");
        mImageUrlss.add("https://i.pinimg.com/736x/67/fa/80/67fa80d52446e6f410d484cdaadc7e13.jpg");
        mNamess.add("Radial Balance❤️⭕");

        mImageUrlss.add("https://i.pinimg.com/474x/49/91/7f/49917fe42fc21f59647009a1f3d3e1ab.jpg");
        mNamess.add("Radial Balance");

        mImageUrlss.add("https://i.pinimg.com/474x/40/eb/10/40eb10b7365cf46caa3a155d83f7003a.jpg");
        mNamess.add("Harmony Art");
        mImageUrlss.add("https://i.pinimg.com/736x/e3/3f/93/e33f93687d5d2aff14a8d34e4a2b1def.jpg");
        mNamess.add("Balance Representation");
        mImageUrlss.add("https://i.pinimg.com/474x/e6/33/27/e633278a86e2a3d11dffc007abf6657e.jpg");
        mNamess.add("Unique Mandala");

//        mImageUrls.add("https://i.pinimg.com/474x/14/94/d0/1494d0f29ba05c0d879735138beb451e.jpg");
//        mNames.add("Dark Patterns🖤");


//        mImageUrls.add("https://i.pinimg.com/474x/e1/36/50/e13650a8641fb2102ae88924f74170ba.jpg");
//        mNames.add("Radial Balance❤️⭕");

        initRecyclerView();
    }
    private void initRecyclerView() {
        //Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recycleview);

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNamess, mImageUrlss);
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(NUM_COLUMNS, LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);

        recyclerView.setAdapter(adapter);

    }
    }
