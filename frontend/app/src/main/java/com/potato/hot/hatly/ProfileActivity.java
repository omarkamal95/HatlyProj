package com.potato.hot.hatly;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.facebook.login.widget.ProfilePictureView;

public class ProfileActivity extends AppCompatActivity {
    public static final String uInfo = "UserInfo";
    ProfilePictureView profilePictureView;
    SharedPreferences user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        user = getSharedPreferences(uInfo, Context.MODE_PRIVATE);

        TextView nametext = (TextView) findViewById(R.id.profile_name);
        nametext.setText(user.getString("Name", "").toString());

        TextView gendertext = (TextView) findViewById(R.id.profile_gender);
        gendertext.setText(user.getString("Gender", "").toString());
        TextView emailtext = (TextView) findViewById(R.id.profile_email);
        emailtext.setText(user.getString("Email", "").toString());
        TextView birthdaytext = (TextView) findViewById(R.id.profile_bd);
        birthdaytext.setText(user.getString("Birthday", "").toString());
        TextView name2text = (TextView) findViewById(R.id.profilename);
        name2text.setText(user.getString("Name", "").toString());

        profilePictureView = (ProfilePictureView) findViewById(R.id.imageMain);

        profilePictureView.setProfileId(user.getString("Id", "").toString());
    }

    public void editClick(View view) {

        Intent intent = new Intent(this, EditProfileActivity.class);
        startActivity(intent);
    }

    public void goToFollowers(View view) {
        Intent intent = new Intent(this, followersActivity.class);
        startActivity(intent);
    }

    public void goToFollowing(View view) {
        Intent intent = new Intent(this, followersActivity.class);
        startActivity(intent);
    }
}
