package models;
public class Student {
    public int id;
    public String name;
    public int age;
    public String major;
    public static int count =0;

    public Student() {
    }

    public Student(String name, int age, String major) {
        count++;
        this.id = count;
        this.name = name;
        this.age = age;
        this.major = major;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
 }
