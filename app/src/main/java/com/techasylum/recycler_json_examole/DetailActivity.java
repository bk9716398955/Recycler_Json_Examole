package com.techasylum.recycler_json_examole;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import static com.techasylum.recycler_json_examole.MainActivity.EXTRA_CREATOR;
import static com.techasylum.recycler_json_examole.MainActivity.EXTRA_LIKES;
import static com.techasylum.recycler_json_examole.MainActivity.EXTRA_URL;
public class DetailActivity extends AppCompatActivity {


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_detail);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);
            Intent intent = getIntent();
            String imageUrl = intent.getStringExtra(EXTRA_URL);
            String creatorName = intent.getStringExtra(EXTRA_CREATOR);
            int likeCount = intent.getIntExtra(EXTRA_LIKES, 0);
            ImageView imageView = findViewById(R.id.image_view_detail);
            TextView textViewCreator = findViewById(R.id.text_view_creator_detail);
            TextView textViewLikes = findViewById(R.id.text_view_like_detail);
            Picasso.get().load(imageUrl).fit().fit().centerCrop().into(imageView);
            textViewCreator.setText(creatorName);
            textViewLikes.setText("Likes: " + likeCount);

        }


 }