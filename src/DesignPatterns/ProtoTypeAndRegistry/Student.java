package DesignPatterns.ProtoTypeAndRegistry;

public class Student implements Prototype<Student>{
    private String name;
    private int age;
    private String batch;

    Student(String name, int age,String batch) {
        this.name = name;
        this.age = age;
        this.batch = batch;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

     Student(Student st){
        this.name=st.name;
        this.age=st.age;
    }
    @Override
    public Student copy() {
        return new Student(this);
    }
}
