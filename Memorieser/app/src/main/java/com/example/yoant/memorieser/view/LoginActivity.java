package com.example.yoant.memorieser.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.yoant.memorieser.R;

public class LoginActivity extends AppCompatActivity {

    private Button signInButton, signViaGoogleButton, signViaVkontakteButton, signViaFacebookButton;
    private EditText loginField, passwordField;
    private TextView registrationTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        final Intent intent = new Intent(this, MainActivity.class),
                intentToRegistration = new Intent(this, RegistrationActivity.class);
        signInButton = (Button) findViewById(R.id.singInButton);
        signViaFacebookButton = (Button) findViewById(R.id.facebookSignInButton);
        signViaVkontakteButton = (Button) findViewById(R.id.vkontakteSignInButton);
        passwordField = (EditText) findViewById(R.id.passwordTextBox);
        loginField = (EditText) findViewById(R.id.emailTextBox);
        registrationTextView = (TextView)findViewById(R.id.registrationTextField);


        registrationTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intentToRegistration);
            }
        });
        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (loginField.getText().toString().equals("admin") &&
                        passwordField.getText().toString().equals("admin"))
                    startActivity(intent);
                else
                    Toast.makeText(getApplicationContext(), "Wrong login&password pair", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
