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
        x++; //6 x=x+1
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

        //binary operator
        c=a+b;
        //ternary operator
        c=a>b?a:b;
        // if(a>b){
        //     c=a;
        // }
        // else{
        //     c=b;
        // }

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
        int num3=15;
        boolean b1=num1>num2;
        boolean b2=num2>num3;
        if(b1 && b2){
            System.out.println("num1 is max");
        }
        else{
            System.out.println("remaining max");
        }
        //logical AND bitwise AND
        /*
         * T T -> T
         * T F -> F
         * F T -> F
         * F F -> F
        */

        //logical OR bitwise OR
        /*
         * T T -> T
         * T F -> T
         * F T -> T
         * F F -> F
        */

        //logical NOT bitwise NOT
        // T -> F
        // F -> T

        //assignment operator 

        a=10;
        a++; //a=a+1
        a+=5; //a=a+5
        a-=5; //a=a-5
        

    }
}