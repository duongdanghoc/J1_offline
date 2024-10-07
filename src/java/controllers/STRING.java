
package controllers;
// lengh(): trar ve do dai chuoi
// charAt(int index): la ra ki tu tai index

import org.apache.tomcat.jakartaee.commons.lang3.StringUtils;

// subtring(begin_index,exit_index): lay ra 1 phan chuoi bat dau tu begin_index -> (exit_index - 1)
// indexOf(String) : tim vi tri dau tien cua chuoi con;
// lastIndexOf(String): vi tri xuat hien cuoi cung cua chuoi con;
//-------------PHUONG THUC SO SANH--------------------

// so sanh 2 chuoi con -- equals(String)
// equalsIgnoreCase: so sanh 2 chuoi ko tinh viet hoa viet thuong
// compareTo(string): so sanh chuoi theo thu tu tu dien
//-------
// trim(): dùng để loại bỏ khoảng trắng
// toUpperCase() - toLowerCase()
// replace(char old, char new): thay the ki tu old thanh new
// concat(): nối chuỗi dùng như +


// starsWith(): boolean -- co bat dau bang chuoi con khong
// EndsWith(s): boolean -- co ket thuc bang chuoi con khong

//------HARD-------
/* split: tách chuỗi theo kí tự của biểu thức chính quy chứ ko phải biểu thức chính quy
    String c = "Ha Duong"
     String[] a = c.split(" ");
     -> a có 2 phan tu Ha và Duong
     -> các phân tử tách nhau theo biểu thức chính quy;
*/
/* 
    stringBuilder là class cho phép tạo các chuỗi có thể thay đổi chuỗi
    -> chuỗi biến thiên
*/
// isEmpty(): tra ve chuoi co rong hay khong
// String.valueOf: chuyển đổi giá trị thành chuỗi
 // Interger.parseInt(): chuyển string thành int
// contain(<String>): Tìm xem chuỗi có chứa giá trị này hay ko -> trả về boolean

public class STRING {
    public static void main(String[] args) {
       // String a = "VuDuc";
        String b = new String("Duong");
        
        //System.out.println(a.length());
        //System.out.println(a.charAt(4));
        // String c = a.substring(1, 2);
        //System.out.println("Chuoi c la:");
        //System.out.println(c);
        //System.out.println(a.substring(1)); // lay tu vi tri 1 den het
        //System.out.println("Dung equals so sanh");
        //System.out.println(a.equals(c));
        //System.out.println("Dung equalsIgnoreCase so sanh");
        //System.out.println(c.equalsIgnoreCase("vud"));
       // System.out.println(a.indexOf(c));
        //System.out.println(a.lastIndexOf(c));
        //System.out.println("Dung compareTo de so sanh");
        //System.out.println(a.compareTo(c));
        String d = new String("Toi la Ha Tung Duong");
        System.out.println("Chuoi d là " + d.trim() + "11 tuoi");
        //System.out.println(b.toUpperCase());
        //System.out.println(b.toLowerCase());
       String[] a = d.split("\\W");
        for(String v : a){
            System.out.println(v);
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append(d).append('\t').append(b);
        System.out.println(sb.toString());// tra ve string
        System.out.println(sb);// tra ve stringbuilder
    }
}
