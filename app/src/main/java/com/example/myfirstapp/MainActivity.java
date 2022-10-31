package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.phone_number);


        EditText userText = findViewById(R.id.text);
        EditText userTextPersonName = findViewById(R.id.textPersonName);
        EditText userPhone = findViewById(R.id.phone);
        EditText userNumber = findViewById(R.id.number);
        EditText userTextPassword = findViewById(R.id.textPassword);
        EditText userTextEmailAddress = findViewById(R.id.textEmailAddress);
        EditText userDate = findViewById(R.id.date);

        Button save = findViewById(R.id.save);

        TextView UserText = findViewById(R.id.UserText);
        TextView UserTextPersonName = findViewById(R.id.UserTextPersonName);
        TextView UserPhone = findViewById(R.id.UserPhone);
        TextView UserNumber = findViewById(R.id.UserNumber);
        TextView UserTextPassword = findViewById(R.id.UserTextPassword);
        TextView UserTextEmailAddress = findViewById(R.id.UserTextEmailAddress);
        TextView UserDate = findViewById(R.id.UserDate);


        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String txtUserText = userText.getText().toString();
                String txtUserTextPersonName = userTextPersonName.getText().toString();
                String txtUserPhone = userPhone.getText().toString();
                String txtUserNumber = userNumber.getText().toString();
                String txtUserTextPassword = userTextPassword.getText().toString();
                String txtUserTextEmailAddress = userTextEmailAddress.getText().toString();
                String txtUserDate = userDate.getText().toString();

                /*
                Object [] dataArray = new String [7];

                dataArray[0] = txtUserText;
                dataArray[1] = txtUserTextPersonName;
                dataArray[2] = txtUserPhone;
                dataArray[3] = txtUserNumber;
                dataArray[4] = txtUserTextPassword;
                dataArray[5] = txtUserTextEmailAddress;
                dataArray[6] = txtUserDate;

                userData.setText(dataArray, 0, 7);
                */

                UserText.setText(txtUserText);
                UserTextPersonName.setText(txtUserTextPersonName);
                UserPhone.setText(txtUserPhone);
                UserNumber.setText(txtUserNumber);
                UserTextPassword.setText(txtUserTextPassword);
                UserTextEmailAddress.setText(txtUserTextEmailAddress);
                UserDate.setText(txtUserDate);
            }
        });

    }
}