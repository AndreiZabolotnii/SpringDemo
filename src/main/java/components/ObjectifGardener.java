package components;

public class ObjectifGardener implements IObjectives {
	private int nbBambous;
	private String color;
	private int score;

    public ObjectifGardener(int nb, String color, int score){
        this.color = color;
        this.nbBambous = nb;
        this.score = score;
    }

    public int getNbBambous() {
        return nbBambous;
    }

    public String getColor() {
        return color;
    }

    public int getScore() {
        return score;
    }

    public void setNbBambous(int nbBambous) {
        this.nbBambous = nbBambous;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public int checkObjectif() {
        System.out.println("Bamboos:"+ this.nbBambous + " Color:" + this.color + " Score:"+this.score);
        return 0;
    }
}
