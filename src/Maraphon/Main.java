package Maraphon;

import Maraphon.competitors.Cat;
import Maraphon.competitors.Competitor;
import Maraphon.competitors.Human;
import Maraphon.competitors.Robot;
import Maraphon.obstacle.Cross;
import Maraphon.obstacle.Obstacle;
import Maraphon.obstacle.Wall;

public class Main {
    public static void main(String[] args) {
        Competitor[] competitors = {new Human("Вася"), new Cat( "Барсик"), new Robot("T-800")};
        Obstacle[] obstacles = {new Wall(2), new Cross(1500), new Wall(20)};

        for (Competitor c:competitors){
            for (Obstacle o: obstacles){
                o.doIt(c);
                if(!c.isDistance()){
                    break;
                }
            }
        }

        for (Competitor c:competitors){
            c.info();
        }
    }

}
