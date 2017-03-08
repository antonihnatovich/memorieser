package com.example.yoant.memorieser.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.yoant.memorieser.R;

import org.w3c.dom.Text;

public class WelcomeActivity extends AppCompatActivity {

    private Button signInButton,
                   signUpButton;
    private TextView textViewSkip;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        final Intent toSignInIntent = new Intent(this, LoginActivity.class),
                toSignUpIntent = new Intent(this, RegistrationActivity.class),
                toMainIntent = new Intent(this, MainActivity.class);
        signInButton = (Button)findViewById(R.id.awSignInButton);
        signUpButton = (Button)findViewById(R.id.awSignUpButton);
        textViewSkip = (TextView)findViewById(R.id.awSkipTextView);

        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(toSignUpIntent);
            }
        });
        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(toSignInIntent);
            }
        });
        textViewSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(toMainIntent);
            }
        });

    }
}
