// package Basics;

class Program1{
    int id;
    String name;
    static int pincode=517583;
    public static void main(String[] args){
        int val;
        // System.out.println("Basics");
        pincode=1000;
        System.out.println(pincode);
        //System.out.println(id);  //non static
        Program1 p1=new Program1();
        // System.out.println(p1);
        System.out.println(p1.id+" "+p1.name+" "+p1.pincode);
        p1.id=94;
        p1.name="sai";
        p1.pincode=100;
        System.out.println(p1.id+" "+p1.name+" "+p1.pincode);
        val=pincode;
        Program1 p2=new Program1();
        p2.id=96;
        p2.name="balaji";
        p2.pincode=200;
        System.out.println(p2.id+" "+p2.name+" "+p2.pincode);


        Program1 p3=new Program1(97);
        p3.pincode=500;

        System.out.println(p1.id+" "+p1.name+" "+p1.pincode);
        System.out.println(p2.id+" "+p2.name+" "+p2.pincode);
        System.out.println(p3.id+" "+p3.name+" "+p3.pincode);
        System.out.println(val);
    }

    public Program1(){ 
        System.out.println("constructor");  
    }
    public Program1(int id){
        System.out.println("constructor and one value assigned");  
        this.id=id;
    }
    
}