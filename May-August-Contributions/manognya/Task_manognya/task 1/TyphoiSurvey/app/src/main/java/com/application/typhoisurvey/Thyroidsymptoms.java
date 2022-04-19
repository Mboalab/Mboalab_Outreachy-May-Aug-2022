package com.application.typhoisurvey;

import java.util.ArrayList;

public class Thyroidsymptoms {

    private String name,mail;
    private  String patientName, patientID, gender;
    private String fever,street;
    private int age;
    private int r1,r2,r3,r4,r5,r6,r7;

    private ArrayList<String> arr ;
    private ArrayList<String> test ;


    public Thyroidsymptoms(){}
    public Thyroidsymptoms(String name,int age ,String pname, String pId, String mail,
                           String gender,String fever, ArrayList<String> arr, ArrayList<String> test,
                           int r1, int r2,int r3, int r4, int r5,int r6,int r7 )
    {
        this.name=name;
        this.fever=fever;
        this.age=age;
        this.mail = mail;
        this.gender = gender;
        this.arr = arr;

        this.patientName = pname;
        this.patientID = pId;

        this.test = test;
        this.r1 = r1;
        this.r2 = r2;
        this.r3 = r3;
        this.r4 = r4;
        this.r5 = r5;
        this.r6 = r6;
        this.r7 = r7;

    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public int getR1() {
        return r1;
    }

    public void setR1(int r1) {
        this.r1 = r1;
    }

    public int getR2() {
        return r2;
    }

    public void setR2(int r2) {
        this.r2 = r2;
    }

    public int getR3() {
        return r3;
    }

    public void setR3(int r3) {
        this.r3 = r3;
    }

    public int getR4() {
        return r4;
    }

    public void setR4(int r4) {
        this.r4 = r4;
    }

    public int getR5() {
        return r5;
    }

    public void setR5(int r5) {
        this.r5 = r5;
    }

    public int getR6() {
        return r6;
    }

    public void setR6(int r6) {
        this.r6 = r6;
    }

    public int getR7() {
        return r7;
    }

    public void setR7(int r7) {
        this.r7 = r7;
    }

    public ArrayList<String> getTest() {
        return test;
    }

    public void setTest(ArrayList<String> test) {
        this.test = test;
    }



    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFever() {
        return fever;
    }

    public void setFever(String fever) {
        this.fever = fever;
    }

    public ArrayList<String> getArr() {
        return arr;
    }

    public void setArr(ArrayList<String> arr) {
        this.arr = arr;
    }
}
