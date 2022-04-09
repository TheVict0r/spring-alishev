package ru.alishev.springcourse;

public class ClassicalMusic implements Music {

    //private constructor
    private ClassicalMusic(){
    }

    //factory method
    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }


    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
