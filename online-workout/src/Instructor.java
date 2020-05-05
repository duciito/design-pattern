public class Instructor {
    private Command command;

    public void changeExercise(Command command)  {
        this.command = command;
        this.command.execute();
    }
}
