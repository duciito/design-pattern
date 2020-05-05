public class Viewer implements Observer {
    private String name;
    private Observable trainee;

    public Viewer(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        if (trainee == null) {
            System.out.println("No exercise!");
        }

        String exercise = trainee.getState();
        System.out.println(this.name + " just got " + exercise);
    }

    @Override
    public void setObservable(Observable observable) {
        this.trainee = observable;
    }
}
