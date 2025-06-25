import java.util.*;
public class studentRecordManagement {

    static Scanner sc=new Scanner(System.in);

    //creating arraylist
    static ArrayList<Student> al=new ArrayList<Student>();

    static class Student{
        int ID;
        String name;
        int marks;
    }

    public static void update(int updidx){
        System.out.println("enter id,name,marks:");
        Student std=new Student();
        std.ID=sc.nextInt();
        std.name=sc.next();
        std.marks=sc.nextInt();
        al.set(updidx,std);
    }

    public static void view(){
        for (Student std : al) {
            System.out.print(std.ID+"   ");
            System.out.print(std.name+"   ");
            System.out.println(std.marks+"   ");
        }
    }

    public static Student add(){
        System.out.println("enter id,name,marks:");
        Student std=new Student();
        std.ID=sc.nextInt();
        std.name=sc.next();
        std.marks=sc.nextInt();
        al.add(std);
        return std;
    }

    public static void main(String[] args) {
        
        int opt;
        System.out.println("1.ADD");
        System.out.println("2.VIEW");
        System.out.println("3.UPDATE");
        System.out.println("4.DELETE");

        
        
        while (true) {
            System.out.print("enter option:");
            opt=sc.nextInt();
            switch (opt) {
                case 1:
                    add();
                    break;
                case 2:
                    view();
                    break;
                case 3:
                    System.out.println("enter the index of object to update:");
                    int updidx=sc.nextInt();
                    update(updidx);
                    break;
                case 4:
                    System.out.println("enter the index to remove:");
                    int remidx=sc.nextInt();
                    al.remove(remidx);
                    break;
                default:
                    break;
            }
            
            System.out.println("do you want to continue(y/n)?");
            char ch=sc.next().charAt(0);
            if(ch=='n') break;
        }
        sc.close();
        
    }
}
