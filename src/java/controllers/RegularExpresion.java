package controllers;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//RE: tìm kiếm kiểm tra và thao tác với chuỗi văn bản
//regex 
// lớpL matcher và pattern
// '.' bất cứ kí tự nào 
// '*' 0 hoặc nhiều lần lặp lại
//'+' 1 hoặc nhiều lần lặp
//'?' 0 hoặc 1 lần lặp 
//'^' bắt đầu RE, $ kết thúc

// \d: số từ 0-9
// \D: các kí tự ko phải số
//\w: các kí tự số hoặc chữ
//\W: các kí tự ko phải só hoặc chữ
//\s: khoảng trắng
//\S: ko phải khoảng trắng
//
//[]: tất cả các kí tự trong dấu ngoặc vuông
//[^]: không phải những kí tự nằm trong ngoặc vuông
//` `: là nháy đơn
//(): nhóm
public class RegularExpresion {
    public static void main(String[] args) {
         //Tao bieu thuc chinh quy cho email
    String emailRegex = "^[A-Za-z0-9]+@gmail\\.com$";
    
    //Tao mail kiem tra
    String email = "hatungduong11112004@gmail.com";
    // Tao pattern tu bieu thuc chinh quy
    Pattern pt = Pattern.compile(emailRegex);
    
    // Khop mau voi chuoi email
    Matcher mc = pt.matcher(email);
    
    if(mc.matches()){
            System.out.println("ok");
    } else{
            System.out.println("no");
    }
    
}
}
