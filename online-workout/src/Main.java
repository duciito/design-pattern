public class Main {
    public static void main(String[] args) {
        Instructor instructor = new Instructor();
        Trainee trainee = new Trainee();

        trainee.subscribe(new Viewer("Ivan"));
        trainee.subscribe(new Viewer("Gosho"));
        trainee.subscribe(new Viewer("Petur"));

        instructor.changeExercise(new GoDown(trainee));
        instructor.changeExercise(new GoUp(trainee));
    }
}

