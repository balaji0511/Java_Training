public class Main{
    public static void main(String[] args){
        //conditional statements
        int num=10;
        if(num>0){
            System.out.println("positive");
            if(num%2==0){
                System.out.println("positive AND even");
            }
            else{
                System.out.println("odd");
            }
        }
        else if(num==0){
            System.out.println("zero");
        }
        else{
            System.out.println("negative");
        }

        System.out.println("exit");
        

    }
}