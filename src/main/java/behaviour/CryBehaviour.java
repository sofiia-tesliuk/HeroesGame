package behaviour;

import character.Character;

public class CryBehaviour implements KickBehaviour{
    @Override
    public void kick(Character c1, Character c2) {
        cry();
    }

    public void cry(){
        System.out.println("Cry, cry, cry.");
    }
}
