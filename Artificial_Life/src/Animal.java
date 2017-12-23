public class Animal extends Organisms {
    private int energy;
    private int[][] visited = new int[ROW][COL];

    public Animal() {
        super(0);
        this.energy = 0;
    }

    public Animal(int age, int energy) {
        super(age);
        this.energy = energy;
    }

    public void setEnergy(int energy) {
        this.energy = this.energy + energy;
    }

    public int getEnergy() {
        return this.energy;
    }

    @Override
    public void updateLife() {
        if ( super.getAge() > 5 || this.getEnergy() < 0)
            super.setAlive(false);
    }

    public int lastVisited(int row, int col){
        return this.visited[row][col];
    }
    public void setVisited(int row, int col) {
        for (int i = 0; i < ROW; i++)
            for (int j = 0; j < COL; j++) {
                if (i == row && j == col)
                    this.visited[row][col] = 1;
                this.visited[i][j]++;
            }
    }
}
