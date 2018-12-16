package character;

import behaviour.KickBehaviour;
import lombok.Getter;
import lombok.Setter;


public class Character {
    @Getter @Setter
    private int power;
    @Getter @Setter
    private int hp;
    @Getter
    private String name;

    private KickBehaviour behaviour;

    public Character(String name, int power, int hp, KickBehaviour behaviour){
        this.power = power;
        this.hp = hp;
        this.behaviour = behaviour;
        this.name = name;
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

    public void printCharacteristics(){
        System.out.format("Name: %s", name);
        if (isAlive()){
            System.out.format("\tHP: %d\tPower: %d", hp, power);
        } else{
            System.out.println("\tDead!");
        }
    }

}
