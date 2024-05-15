package com.example.appbienvenido;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText editTextUsername, editTextPassword;
    private Button buttonSubmit;
    private TextView textViewWelcomeMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        editTextUsername = findViewById(R.id.editTextUsername);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonSubmit = findViewById(R.id.buttonSubmit);
        textViewWelcomeMessage = findViewById(R.id.textViewWelcomeMessage);

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleSubmitButtonClick();
            }
        });
    }
    private void handleSubmitButtonClick() {
        String username = editTextUsername.getText().toString();
        String password = editTextPassword.getText().toString();

        if (username.isEmpty() || password.isEmpty()) {
            textViewWelcomeMessage.setText("Por favor, complete todos los campos.");
        } else {
            String welcomeMessage = "¡Bienvenido, " + username + "!";
            textViewWelcomeMessage.setText(welcomeMessage);
        }
    }
}
