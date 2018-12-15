package behaviour;
import character.Character;
import config.Config;

public class RandomKick implements KickBehaviour{
    @Override
    public void kick(Character c1, Character c2){
        int kickPower = Config.generateRandom(1, c1.getPower());
        c2.setHP(c2.getHp() - kickPower);
    }
}
