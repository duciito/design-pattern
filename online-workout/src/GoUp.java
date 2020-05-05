public class GoUp implements Command {
    private Trainee trainee;

    public GoUp(Trainee trainee) {
        this.trainee = trainee;
    }

    @Override
    public void execute() {
        this.trainee.setExercise("Up");
    }
}
