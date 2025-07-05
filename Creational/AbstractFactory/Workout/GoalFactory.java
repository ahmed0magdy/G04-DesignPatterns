package Creational.AbstractFactory.Workout;

public interface GoalFactory {
    MealPlan createMealPlan();

    WorkoutPlan createWorkoutPlan();
}
