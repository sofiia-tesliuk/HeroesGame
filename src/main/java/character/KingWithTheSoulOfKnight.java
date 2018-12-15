package character;

import behaviour.RandomKick;
import config.Config;

public class KingWithTheSoulOfKnight extends Character {
    public KingWithTheSoulOfKnight(int min, int max) {
        super(Config.generateRandom(min, max), Config.generateRandom(min, max), new RandomKick());
    }
}
