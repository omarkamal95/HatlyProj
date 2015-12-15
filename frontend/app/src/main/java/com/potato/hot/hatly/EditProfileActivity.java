package com.potato.hot.hatly;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;

public class EditProfileActivity extends AppCompatActivity {



    // UI references.
    private AutoCompleteTextView mEmailView;
    private EditText mFirstNameView, mLastNameView, mDateOfBirthView, mCityView, mCountryView;
    public static final String uInfo = "UserInfo";
    SharedPreferences user;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);


        mEmailView = (AutoCompleteTextView) findViewById(R.id.email);
        mFirstNameView = (EditText) findViewById(R.id.first_name);
        mLastNameView = (EditText) findViewById(R.id.last_name);
        mDateOfBirthView= (EditText) findViewById(R.id.date_of_birth);
        mCityView = (EditText) findViewById(R.id.city);
        mCountryView = (EditText) findViewById(R.id.country);

    }

    public void submitEdit(View view) {
        user = getSharedPreferences(uInfo, Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = user.edit();
        editor.putString("Name", String.valueOf(mFirstNameView.getText())+ String.valueOf(mLastNameView.getText()));
        editor.putString("Email", String.valueOf(mEmailView.getText()));
        editor.putString("Birthday", String.valueOf(mDateOfBirthView.getText()));
        editor.apply();
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }

}
