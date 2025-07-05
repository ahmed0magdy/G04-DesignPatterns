package Creational.AbstractFactory.Workout;

public class WeightLossFactory implements GoalFactory {

    @Override
    public MealPlan createMealPlan() {
        return new WeighLossMealPlan();
    }

    @Override
    public WorkoutPlan createWorkoutPlan() {
        return new WeightLossWorkout();
    }

}
