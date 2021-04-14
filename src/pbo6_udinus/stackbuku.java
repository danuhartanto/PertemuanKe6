/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6_udinus;

/**
 *
 * @author Administrator
 */
public class stackbuku {
  Pbo6_udinus top;
    public stackbuku(){
        top=null;
    }
    public void push(Pbo6_udinus a){
        if(top==null) top=a;
        else{
            a.next=top;
            top=a;
        }
    }
    public void pop(){
        if(top==null) System.out.println("kosong");
        else{
            System.out.println("Popping Data . . .");
            top.view();
            top=top.next;
        }
    }
    public void view(){
        if(top==null) System.out.println("kosong");
        else{
            Pbo6_udinus ptr=top;
            while(ptr!=null){
                System.out.println("- - - - -");
                ptr.view();
                ptr=ptr.next;
            }
        }
    }

 
}