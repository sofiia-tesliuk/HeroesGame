package character;

import behaviour.KickBehaviour;
import lombok.Getter;
import lombok.Setter;


public class Character {
    @Getter @Setter
    private int power;
    @Getter @Setter
    private int hp;

    private KickBehaviour behaviour;

    public Character(int power, int hp, KickBehaviour behaviour){
        this.power = power;
        this.hp = hp;
        this.behaviour = behaviour;
    }

    public void setHP(int hp){
        if (hp < 0){
            this.hp = 0;
        } else{
            this.hp = hp;
        }
    }

    public void kick(Character c){
        behaviour.kick(this, c);
    }

    public boolean isAlive(){
        return this.hp > 0;
    }

    //public Character createCharacter(){
      //  return new Character(2, 5);
    //}
}
