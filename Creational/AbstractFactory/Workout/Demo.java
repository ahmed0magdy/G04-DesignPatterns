package Creational.AbstractFactory.Workout;

public class Demo {
    public static void show() {
        var homePage = new HomePage();
        homePage.setGoal(new BuildMuscleFactory());
        homePage.setGoal(new WeightLossFactory());
    }
}
