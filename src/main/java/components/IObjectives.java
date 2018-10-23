package components;

import java.util.List;

public interface IObjectives {
    int getNbBambous();

    String getColor();

    int getScore();

    void setNbBambous(int nbBambous);

    void setColor(String color);

    void setScore(int score);

    int checkObjectif();
}
