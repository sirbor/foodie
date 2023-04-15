package com.example.foodie;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etEmail, etPassword, etSearch;
    private TextView tvWelcome, tvRegister, tvCategories, tvCategory1, tvCategory2, tvRestaurants, tvRestaurant1;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etEmail = findViewById(R.id.et_email);
        etPassword = findViewById(R.id.et_password);
        etSearch = findViewById(R.id.et_search);
        tvWelcome = findViewById(R.id.tv_welcome);
        tvRegister = findViewById(R.id.tv_register);
        tvCategories = findViewById(R.id.tv_categories);
        tvCategory1 = findViewById(R.id.tv_category1);
        tvCategory2 = findViewById(R.id.tv_category2);
        tvRestaurants = findViewById(R.id.tv_restaurants);
        tvRestaurant1 = findViewById(R.id.tv_restaurant1);
        btnLogin = findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Check if email and password are valid
                String email = etEmail.getText().toString();
                String password = etPassword.getText().toString();
                if (isValidEmail(email) && isValidPassword(password)) {
                    // Login successful
                    Toast.makeText(MainActivity.this, "Login successful!", Toast.LENGTH_SHORT).show();
                } else {
                    // Login failed
                    Toast.makeText(MainActivity.this, "Invalid email or password!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private boolean isValidEmail(String email) {
        // TODO: Add email validation logic
        return true;
    }

    private boolean isValidPassword(String password) {
        // TODO: Add password validation logic
        return true;
    }
}
