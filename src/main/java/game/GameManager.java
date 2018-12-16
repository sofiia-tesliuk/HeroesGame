package game;

import character.Character;
import factory.CharacterFactory;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class GameManager {
    private CharacterFactory chFactory;
    private Character player;
    private ArrayList<Character> enemies = new ArrayList<>();

    public GameManager(int enemiesNumber) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        chFactory = new CharacterFactory();
        player = chFactory.createCharacter();
        for (int i = 0; i < enemiesNumber; i++) {
            enemies.add(chFactory.createCharacter());
        }
    }

    public void fight(Character c1, Character c2){
        System.out.println("\nFight!");
        c1.printCharacteristics();
        System.out.println("\nVS");
        c2.printCharacteristics();
        while (c1.isAlive() && c2.isAlive()){
            System.out.format("\n%s kicked %s\n", c1.getName(), c2.getName());
            c1.kick(c2);
            c2.printCharacteristics();
            if (c2.isAlive()) {
                System.out.format("\n%s kicked %s\n", c2.getName(), c1.getName());
                c2.kick(c1);
                c1.printCharacteristics();
            }
        }
    }

    public void play(){
        printIntroduction();
        System.out.println("Players characteristics:");
        player.printCharacteristics();
        System.out.println();
        for (Character enemy: enemies) {
            System.out.format("\n\nYou met next enemy: %s\n", enemy.getName());
            fight(player, enemy);
            if (!player.isAlive()){
                printSadMessage();
                return;
            }
        }
        printCongratulations();
    }

    private void printIntroduction(){
        System.out.println("-------------| Heroes Game |--------------\n" +
                "You are starting the long way to the goal.\n" +
                "Making steps every day, sometimes you meet enemies, who haven't used to be nice to user.\n" +
                "To continue you way and reach your main goal, you should kill all enemies.\n\n");
    }

    private void printCongratulations(){
        System.out.println("Congratulations! You win!");
    }

    private void printSadMessage(){
        System.out.println("You lost! Try again.");
    }
}
