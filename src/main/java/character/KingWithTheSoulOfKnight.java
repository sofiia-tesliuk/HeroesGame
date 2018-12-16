package character;

import behaviour.RandomKick;
import config.Config;

public class KingWithTheSoulOfKnight extends Character {
    public KingWithTheSoulOfKnight(String name, int min, int max) {
        super(name, Config.generateRandom(min, max), Config.generateRandom(min, max), new RandomKick());
    }
}
