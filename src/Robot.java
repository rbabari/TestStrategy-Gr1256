public class Robot {
    private String name;
    private IBehaviour behaviour;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Robot()
    {
        this.name = "_sans_nom_";
    }

    public Robot(String name)
    {
        this.name = name;
    }
    public Robot(Robot robot)
    {
        this.name = robot.name;
    }
    public void setBehaviour(IBehaviour behaviour)
    {
        this.behaviour = behaviour;

    }
    public void move()
    {
        behaviour.moveCommand();

    }
}
