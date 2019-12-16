package com.example.meetingapp;

import java.util.HashMap;
import java.util.Map;

public class PersonalData {


    private String uid;
    private String nickname;
    private String age;
    private String university;
    private String major;


    public PersonalData() {
        this.uid = uid;
        this.nickname = nickname;
        this.age = age;
        this.university = university;
        this.major = major;
    }

    public PersonalData(String uid, String nickname, String age, String university, String major) {
        this.uid = uid;
        this.nickname = nickname;
        this.age = age;
        this.university = university;
        this.major = major;
    }

    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("uid", uid);
        result.put("nickname", nickname);
        result.put("age", age);
        result.put("university", university);
        result.put("major", major);

        return result;
    }



    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }





}
