package Evaluation.InterFaceProblem;

public abstract class ClassOne implements InterFaceThree{
    @Override
    public void methodThree() {
        System.out.println("Inside methodThree of ClassOne");
    }
}
