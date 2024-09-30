package controllers;
import java.util.Scanner;
import models.Coder;
public class OOP {
    public static void main(String[] args) {       
        Coder coder = new Coder();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhap ten: ");
        String name = sc.nextLine();
        coder.setName(name);
        
        System.out.println("Nhap ngon ngu:\n1.Java\n2.C\n3.C#\n4.Python");
        int op = sc.nextInt();
        switch(op){
            case 1:
                coder.setProgramingLanguage("Java");
                break;
            case 2:
                coder.setProgramingLanguage("C");
                break;
            case 3:
                coder.setProgramingLanguage("C#");
                break;
            case 4:
                coder.setProgramingLanguage("Python");
            default:
                System.out.println("Vui long chon lai");
                break;
        }
       
        System.out.println("Nhap tuoi: ");
        int age = sc.nextInt();
        coder.setAge(age);
        while(coder.getAge() == 0)
        {
            age = sc.nextInt();
            coder.setAge(age);
        }
        
        System.out.println("Nhap sdt");
        String phone = sc.next();
        coder.setPhone(phone);
        
       
        System.out.println("Ngon ngu: "+coder.getProgramingLanguage());
        System.out.println("Ten: " + coder.getName());
        System.out.println("Age: " + coder.getAge());
        System.out.println("Phone: " + coder.getPhone());
    }
    
}
