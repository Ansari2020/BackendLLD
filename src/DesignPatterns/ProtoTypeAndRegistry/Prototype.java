package DesignPatterns.ProtoTypeAndRegistry;

//generic because any class who wants to implement can implement with any return type
public interface Prototype<T> {

    T copy();
}
