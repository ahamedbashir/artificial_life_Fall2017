public class Plant extends Organisms {
    private final int MAX_LIFE_YEAR = 10;

    public Plant(){
        super(0);
    }

    public Plant( int age ) {
        super(age);
    }

    @Override
    public void updateLife() {
        if ( getAge() > MAX_LIFE_YEAR ) {
         super.setAlive(false);
        }
    }

    @Override
    public String toString() {
        return " p ";
    }
}
