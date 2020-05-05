public class GoDown implements Command {
    private Trainee trainee;

    public GoDown(Trainee trainee) {
        this.trainee = trainee;
    }

    @Override
    public void execute() {
        this.trainee.setExercise("Down");
    }
}
