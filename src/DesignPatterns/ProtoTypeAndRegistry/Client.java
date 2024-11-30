package DesignPatterns.ProtoTypeAndRegistry;

public class Client {
    public static void main(String[] args) {
        Student st=new Student("Danish",26,"dummy batch");

//    Student st2=st it is will copy only reference

        StudentRegistry studentRegistry=new StudentRegistry();
        studentRegistry.fillRegistry();

        Student st1=studentRegistry.get("apr23");
        st1.setName("danish1");
    }




}
