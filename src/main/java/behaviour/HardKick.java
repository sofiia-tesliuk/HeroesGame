package behaviour;

import character.Character;

public class HardKick implements KickBehaviour {
    @Override
    public void kick(Character c1, Character c2) {
        if (c2.getPower() > c1.getPower()){
            c2.setHP(0);
        }
    }
}
