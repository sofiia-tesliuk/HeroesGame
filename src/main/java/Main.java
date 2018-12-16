import game.GameManager;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        GameManager gm = new GameManager(3);
        gm.play();
    }
}
