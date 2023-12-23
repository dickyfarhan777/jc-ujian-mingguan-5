package com.juaracoding.utils;

public enum TestCase {
    T1("Admin Login Valid"),
    T2("Admin Login invalid without input username and password"),
    T3("Admin Login invalid with wrong username"),
    T4("Admin addcart product"),
    T5("Admin checkout product");

    private String testCaseName;
    TestCase(String value){
        testCaseName = value;
    }
    public String getTestCaseName(){
        return testCaseName;
    }
}
