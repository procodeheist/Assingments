package EvaluationC2.InterFaceProblem;

public class ClassTwo extends ClassOne {
    @Override
    public void methodOne(){
        System.out.println("Inside methodOne of ClassTwo");
    }
    @Override
    public void methodTwo(){
        System.out.println("Inside methodTwo of ClassTwo");
    }
    @Override
    public String toString(){
        return "This is ClassTwo object";
    }

    public static void main(String[] args) {
        InterFaceThree interF3Obj = new ClassTwo();
        System.out.println(interF3Obj);
        interF3Obj.methodOne();
        interF3Obj.methodTwo();
        interF3Obj.methodThree();

        InterFaceOne interF1Obj = new ClassTwo();
        interF1Obj.methodOne();

        ClassTwo class2Obj = (ClassTwo) interF1Obj;
        class2Obj.methodTwo();
        class2Obj.methodThree();

    }
}
