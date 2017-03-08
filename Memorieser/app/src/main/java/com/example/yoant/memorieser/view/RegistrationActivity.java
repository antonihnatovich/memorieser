package com.example.yoant.memorieser.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.yoant.memorieser.R;

import org.w3c.dom.Text;

public class RegistrationActivity extends AppCompatActivity {

    private TextView toSignInTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final Intent intent = new Intent(this, LoginActivity.class);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        toSignInTextView = (TextView)findViewById(R.id.signInTextView);

        toSignInTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }
        });

    }
}
