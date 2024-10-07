/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class Cau_Truc_Du_Lieu {
    public static void main(String[] args) {
        //ArrayList gồm cấc phần tử kiểu String
        ArrayList<String> alist = new ArrayList();
        alist.add("Ha Duong");
        System.out.println(alist.get(0));
        
        LinkedList<String> llist = new LinkedList();
        llist.add("Quoc Dung");
        llist.add("Thanh Hang");
        llist.addFirst("Minh");
        
        Stack<String> slist = new Stack();
        slist.push("Quốc Dũng");
        slist.push("Thanh Hang");
        String a = slist.pop();
        System.out.println(a);
        
        Queue<String> qlist = new LinkedList();
        qlist.add("Quoc Dung");
        qlist.add("Thanh Hang");
        System.out.println(qlist.poll());
        
        //Hash Map
        HashMap<Integer,String>hlist = new HashMap<>();
        hlist.put(1,"Quoc Dung");
        
        HashSet<String> setlist = new HashSet();
        
        //add(): theem phan tu vao bo suu tap
        // remove(): xoa phan tu trong bo suu tap
        //contain(): kieemr tra bo suu tap co chua phan tu cu the hay ko
        //size(): so luong phan tu trong bo suu tap
        //clear(): xoa tat ca phan tu trong bo suu tap
        //isEmpty(): kiem tra xem bo suu tap co rong hay ko
        
        
        
    }
}
