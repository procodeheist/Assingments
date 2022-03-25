package WeekEnd;
@FunctionalInterface
public interface InterFac {
    abstract void func1();
    static void statMeth(){
        System.out.println("Static method example");
    }
    default void defMeth(){
        System.out.println("Default meth works");
    }

}
