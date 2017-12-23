import java.security.SecureRandom;

public class GenerateLife {
    static Organisms[][] life = new Organisms[Organisms.ROW][Organisms.COL];
    public static SecureRandom rand = new SecureRandom();

    public static void main(String[] args) {
        // initialize life
        initializeLife(life);

        for(int i = 0; i < Organisms.ROW; i++) {
            for (int j = 0; j < Organisms.COL; j++) {
                if (life[i][j] == null)
                    System.out.print(" ~ ");
                else
                    System.out.print(life[i][j]);
            }
            System.out.println();
        }
        // update life in a loop
    }


    public static void initializeLife(Organisms life[][]) {

        for( int i = 0; i < 50; i++) {
            int row = rand.nextInt(16);
            int col = rand.nextInt(16);
            int age = rand.nextInt(6);
            if( life[row][col] instanceof Plant || life[row][row] instanceof Animal)
                i--;
            else
                life[row][col] = new Plant(age);
        }
            for( int i = 0; i < 30; i++) {
                int row = rand.nextInt(16);
                int col = rand.nextInt(16);
                int age = rand.nextInt(6);
                int energy = rand.nextInt(6);
                if( life[row][col] instanceof Plant || life[row][row] instanceof Animal)
                    i--;
                else
                    life[row][col] = new Herbivore(age, energy);
            }

        for( int i = 0; i < 20; i++) {
            int row = rand.nextInt(16);
            int col = rand.nextInt(16);
            int age = rand.nextInt(6);
            int energy = rand.nextInt(10);
            if( life[row][col] instanceof Plant || life[row][row] instanceof Animal)
                i--;
            else
                life[row][col] = new Carnivore(age, energy);
        }
    }


    // Method for reproduction


    // method for move
}
