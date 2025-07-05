package Creational.AbstractFactory.Workout;

public class HomePage {
    private WorkoutPlan workoutPlan;
    private MealPlan mealPlan;

    public void setGoal(GoalFactory goalFactory) {
        mealPlan = goalFactory.createMealPlan();
        workoutPlan = goalFactory.createWorkoutPlan();
        System.out.println(workoutPlan);
        System.out.println(mealPlan);

    }
}
