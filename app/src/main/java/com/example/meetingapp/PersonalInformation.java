package com.example.meetingapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ToggleButton;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.UserProfileChangeRequest;

public class PersonalInformation extends AppCompatActivity {

    EditText nickname_ins, age_ins, university_ins, major_ins;
    ToggleButton btn_22, btn_33, btn_44, btn_gn, btn_sc, btn_aa, btn_jr, btn_hd, btn_js, btn_itw, btn_dc, btn_edit;
    Button button_tochat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personalinformaition);









        //채팅 보내기 임시 시작
        button_tochat = findViewById(R.id.to_chat);

        button_tochat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ChatActivity.class);
                startActivity(intent);
            }
        });
        //채팅 보내기 임시 끝
    }
}
