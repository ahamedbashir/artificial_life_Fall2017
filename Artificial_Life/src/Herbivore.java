public class Herbivore extends Animal {
    private final int MAX_LIFE = 5;

    public Herbivore() {
        super();
    }

    public Herbivore(int age, int energy) {
        super(age, energy);
    }

    @Override
    public void updateLife() {
        if ( super.getAge() > MAX_LIFE || super.getEnergy() < 0)
            super.setAlive(false);
    }

    @Override
    public String toString() {
        return " h ";
    }
}
