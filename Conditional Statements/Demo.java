class Demo {
    public static void main(String[] args) {
        //looping statements
        int n=5;
        for(int i=0;i<=n;i++){
            if(i==3){
                continue;
            }
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("---------");
        
        while(n<5){
            n++;
            System.out.println(n);
        }
        do{
            System.out.println(n);
        }
        while(n<5);
        System.out.println("-----------");
        int[] arr={1,2,3,4,5,6};
        int size=arr.length;
       System.out.println("size "+size);

    //    for(int i=0;i<size;i++){
    //      System.out.println(arr[i]);
    //    }
    //advanced array
       for(int a:arr){
        System.out.println(a);
       }
    }
}
