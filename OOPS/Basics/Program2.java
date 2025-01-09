public class Program2 {
    int id;
    String name;

    public static void main(String[] args) {
        Program2 sai=new Program2(100,"sai");
        sai.assign(101,"sai kumar");
        sai.display();
    }

    public Program2(){
    }
    public Program2(int id,String name){
        this.id=id;
        this.name=name;
    }
    public void assign(int id, String name){
        this.id=id;
        this.name=name;
    }
    public void display(){
        System.out.println("Details:");
        System.out.println(id+" "+name);
    }


}
