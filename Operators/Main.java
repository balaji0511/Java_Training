class Main{
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c;
        c=a+b;  //a,b are operands and '+' is operator
       // System.out.println(c);

        //unary operator 
        // post-increment , pre-increment
        int x=5;
        int y=5;
        x++; //6 
        ++y; //6
        // System.out.println(x+" "+y);   
        int m=x--;
        // System.out.println(m+" "+x);
        a=10;  //a=11
        b=15;  //b=16 17
        int z= a++ + b++ + ++b + ++a;   
        // z= 10 + 15 + 17 + 12
        //System.out.println(z); //54
         
        a=1;
        b=2;

        int p,q,r,s;
        p= a++ + ++b;  // 1+3 -- a=2,b=3,p=4
        q= ++a + b++;  // 3+3 --a=3,b=4,q=6
        r= b-- + a++;  // 4+3 --a=4,b=3,r=7
        s=p++ + q+r;   // 4+6+7 -- a=4,b=3,p=5,q=6,r=7,s=17

        System.out.println(a+" "+b+" "+p+" "+q+" "+r+" "+s);

        int d= (p+q)*s-r+a/b;    //bodmas
        // d= 11*17 -7 + 1 = 101
        System.out.println(d);

        //left shift operator
        System.out.println(a<<b);// 4*2**3 ==> 4 * (2*2*2) ==> 4*8 ==> 32

        //right shift 
        int num=12>>2;
        System.out.println(num);// 12/(2**2) ==> 12/(4) ==> 3
        
        //logical operator 
        int num1=5;
        int num2=10;
        if(num1==5 && num2==10){
            System.out.println("right");
        }
        else{
            System.out.println("wrong");
        }

    }
}