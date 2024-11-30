package DesignPatterns.ProtoTypeAndRegistry;

public class IntelligentStudent extends Student {

    private int iq;

     IntelligentStudent(String name, int age,String batch, int iq) {
        super(name, age,batch);
        this.iq = iq;

    }

      IntelligentStudent(IntelligentStudent student) {
        super(student);
        this.iq=student.iq;

    }

    public IntelligentStudent copy(){
        return new IntelligentStudent(this);
    }
}
