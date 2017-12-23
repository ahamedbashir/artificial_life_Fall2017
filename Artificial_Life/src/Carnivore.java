public class Carnivore extends Animal {
    private final int MaxLife = 7;

    public Carnivore() {
        super();
    }

    public Carnivore(int age, int energy) {
        super(age, energy);
    }

    @Override
    public void updateLife() {
        if ( super.getAge() > MaxLife|| super.getEnergy() < 0)
            super.setAlive(false);
    }
    @Override
    public String toString() {
        return " c ";
    }
}
