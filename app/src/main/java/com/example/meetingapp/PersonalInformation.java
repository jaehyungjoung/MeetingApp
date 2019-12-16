package com.example.meetingapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ToggleButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.internal.firebase_auth.zzew;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.FirebaseUserMetadata;
import com.google.firebase.auth.GetTokenResult;
import com.google.firebase.auth.UserInfo;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.auth.zzy;
import com.google.firebase.auth.zzz;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonalInformation extends AppCompatActivity {

    EditText nickname_ins;
    EditText age_ins;
    EditText university_ins;
    EditText major_ins;
    ToggleButton btn_22, btn_33, btn_44, btn_gn, btn_sc, btn_aa, btn_jr, btn_hd, btn_js, btn_itw, btn_dc, btn_edit;
    Button button_tochat, button_enter;
    String uid, nickname, age, university, major, idToken, id, pw, name, birth, gender, disease, purpose;
    int height, weight;
    private DatabaseReference myRef;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personalinformaition);

        nickname_ins = findViewById(R.id.nickname);
        age_ins = findViewById(R.id.age);
        university_ins = findViewById(R.id.university);
        major_ins = findViewById(R.id.major);


        button_enter = findViewById(R.id.enter);

        button_enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatabaseReference mDBReference = null;
                HashMap<String, Object> childUpdates = null;
                Map<String, Object> userValue = null;
                PersonalData inf = null;

                mDBReference = FirebaseDatabase.getInstance().getReference();
                childUpdates = new HashMap<>();


                inf = new PersonalData(uid, nickname, age, university, major);

                uid = FirebaseAuth.getInstance().getUid();
                nickname = nickname_ins.getText().toString();
                age = age_ins.getText().toString();
                university = university_ins.getText().toString();
                major = major_ins.getText().toString();

                userValue = inf.toMap();


                childUpdates.put("/User_info/" + uid, userValue);
                mDBReference.updateChildren(childUpdates);
            }
        });








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
