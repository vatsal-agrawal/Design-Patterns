package Creational.Singleton.AEagerInitialization;

public class SingletonClass {

    private static SingletonClass sSoleInstance = new SingletonClass();

    //private constructor.
    private SingletonClass(){}

    public static SingletonClass getInstance() {
        return sSoleInstance;
    }
}