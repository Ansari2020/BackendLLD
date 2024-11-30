package DesignPatterns.ProtoTypeAndRegistry;

import java.util.HashMap;

public class StudentRegistry {
    private HashMap<String, Student> students;
    public StudentRegistry() {
        students = new HashMap<>();
    }

    public void add(String key, Student student) {
        students.put(key, student);

    }
    public void remove(String key) {
        students.remove(key);
    }

    public Student get(String key) {
        return students.get(key).copy();
    }
    public void fillRegistry() {
        Student apr23=new Student("Danish",26,"ap23");
        Student mar23=new Student("asif",22,"mar23");
        Student feb23=new Student("rashid",19,"feb23");
        Student dec23=new Student("anish",17,"dec23");

        students.put("ap23",apr23);
        students.put("mar23",mar23);
        students.put("feb23",feb23);
        students.put("dec23",dec23);
    }
}
