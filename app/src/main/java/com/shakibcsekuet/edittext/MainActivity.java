package com.shakibcsekuet.edittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button submit;
    EditText name, password, email, contact, date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (EditText) findViewById(R.id.editText1);
        password = (EditText) findViewById(R.id.editText2);
        email = (EditText) findViewById(R.id.editText3);
        date = (EditText) findViewById(R.id.editText4);
        contact = (EditText) findViewById(R.id.editText5);
        submit = (Button) findViewById(R.id.button);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (name.getText().toString().isEmpty() || password.getText().toString().isEmpty() || email.getText().toString().isEmpty() || date.getText().toString().isEmpty()
                        || contact.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Enter the Data", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Name -  " + name.getText().toString() + " \n" + "Password -  " + password.getText().toString()
                            + " \n" + "E-Mail -  " + email.getText().toString() + " \n" + "Date -  " + date.getText().toString()
                            + " \n" + "Contact -  " + contact.getText().toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
