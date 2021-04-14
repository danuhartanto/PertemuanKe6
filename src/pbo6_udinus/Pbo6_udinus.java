/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6_udinus;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Pbo6_udinus {
 int id,tahun;
    String judul;
    Pbo6_udinus next;
    public static Scanner in=new Scanner(System.in);
    public static Scanner str=new Scanner(System.in);
    public void input(){
        System.out.print("Masukkan id buku      : ");
        id=in.nextInt();
        System.out.print("Masukkan judul        : ");
        judul=str.nextLine();
        System.out.print("Masukkan tahun terbit : ");
        tahun=in.nextInt();
        next=null;
    }
    public void view(){
        System.out.println("id buku      : "+id);
        System.out.println("judul        : "+judul);
        System.out.println("tahun terbit : "+tahun);
    }
    public static void main(String[] args) {
        int menu=0;
        stackbuku st=new stackbuku();
        while(menu!=4){
            System.out.print("1.push\n2.pop\n3.view\n4.exit\n : ");
            menu=in.nextInt();
            if(menu==1){
                Pbo6_udinus baru=new Pbo6_udinus();
                baru.input();
                st.push(baru);
            }
            else if(menu==2) st.pop();
            else if(menu==3) st.view();
            else if(menu==4) System.out.println("keluar . . .");
            else System.out.println("salah . . .");
            System.out.println(" ");
        }
    }    
}
    

