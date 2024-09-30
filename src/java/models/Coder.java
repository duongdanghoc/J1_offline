/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Admin
 */
public class Coder extends Person {
    private String programingLanguage;

    public Coder() {
    }

    public Coder(String programingLanguage, String name, int age, String phone) {
        super(name, age, phone);
        this.programingLanguage = programingLanguage;//phan biet thuoc tinh va tham so
    }

    public String getProgramingLanguage() {
        return programingLanguage;
    }

    public void setProgramingLanguage(String programingLanguage) {
        this.programingLanguage = programingLanguage;
    }
    
    
    
}
