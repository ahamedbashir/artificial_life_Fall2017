public abstract class Organisms {
    public static int ROW= 16;
    public static int COL = 16;

    private int age;
    private boolean alive = true;

    public Organisms() {
        this(0);
    }

    public Organisms(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge() {
        this.age++;
    }

    public boolean isAlive() {
        return this.alive;
    }
    public void setAlive(boolean alive){ this.alive = alive; }

    public void updateLife(){ }
}
