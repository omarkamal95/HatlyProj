package com.potato.hot.hatly;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;

public class FriendProfileActivity extends AppCompatActivity {


    boolean following = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friend_profile);


    }

    public void followClick(View view) {
        Button follow_btn = (Button) findViewById(R.id.follow_button);
        if (!following) {
            follow_btn.setBackgroundColor(0xFF8c9eff);
            follow_btn.setText("following");
            following = true;
        } else {
            follow_btn.setBackgroundColor(0xFFe0e0e0);
            follow_btn.setText("follow");
            following = false;
        }
    }

}
