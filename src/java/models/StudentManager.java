package models;

import java.util.ArrayList;
import java.util.Scanner;
public class StudentManager {
    static int x;
    static ArrayList<Student> st = new ArrayList<Student>();
    // Hien thi menu
    public static void menu(){
        System.out.println("1.Xem danh sach sinh vien\n2.Them sinh vien\n3.Xoa sinh vien\n4.Sua sinh vien\n5.Tim kiem theo ten sinh vien\n6.Exit");
    }
    // Nhap lua chon
    public static void nhap(){
        do{
        System.out.println("Chose number");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        }
        while(x < 1 || x > 7);
    }
    // Hien thi danh sach sinh vien
    public static void Display(){
        if(st.size() == 0){
            System.out.println("No student in Class");
        }
        else{
            for (int i = 0; i < st.size(); i++) {
                Student mem = st.get(i);
                System.out.println(mem.id +"."+ mem.name);
            }  
        }
    }
    // Them sinh vien 
    public static void addStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten sinh vien");
        String name = sc.nextLine();
        System.out.println("Nhap tuoi sinh vien");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap nganh hoc cua sinh vien");
        String major = sc.nextLine();
        Student mem = new Student(name,age,major);
        st.add(mem);
    }
    // Xoa sinh vien
    public static void removeStudent(){
    Scanner sc = new Scanner(System.in);
    System.out.println("nhap id muon xoa: ");
     int key = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < st.size(); i++) {
            Student mem = st.get(i);
            if (mem.id == key) {
                st.remove(i); // Xóa sinh viên theo chỉ số
                System.out.println("Da xoa sinh vien có ID: " + key);
                found = true;
                break; // Thoát khỏi vòng lặp sau khi tìm thấy sinh viên
            }
        }
        if (!found) {
            System.out.println("Khong tim thay sinh vien co ID: " + key);
        }
    }
    // Sua sinh vien
    public static void suaStudent(){
       Scanner sc = new Scanner(System.in);
    System.out.println("nhap id muon sua: ");
     int key = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < st.size(); i++) {
            Student mem = st.get(i);
            if (mem.id == key) {
                System.out.println("Ban muon sua gi\n1.name\n2.age\n3.major\n4.Ket thuc sua\nChose number:");
                int tmp = sc.nextInt();
                sc.nextLine();
                    if(tmp == 1){
                        System.out.println("New name:");
                        mem.setName(sc.nextLine());
                    } else if(tmp == 2){
                       System.out.println("New age");
                       mem.setAge(sc.nextInt());
                    } else if(tmp == 3){
                    System.out.println("New Major");
                    mem.setMajor(sc.nextLine());
                    }
                }
                System.out.println("Da sua sinh vien có ID: " + key);
                found = true;
                break; // Thoát khỏi vòng lặp sau khi tìm thấy sinh vien
        }
        if (!found) {
            System.out.println("Khong tim thay sinh vien co ID: " + key);
        }
        
    }
    public static void solve(int x){
        if(x == 6){
            System.exit(0);
        }
        else if(x == 1){
            Display();
        }
        else if (x == 2){
            addStudent();
        }
        else if(x == 3){
            removeStudent();
        }
        else if(x == 4){
            suaStudent();
        }
    }
    public static void main(String[] args) {
        menu();
        while(true){
        nhap();
        solve(x);
        }
    }
 
}
