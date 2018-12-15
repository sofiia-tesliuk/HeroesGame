import org.reflections.Reflections;

import java.util.Set;

public class Main {
    public static void main(String[] args){
        Reflections reflections = new Reflections();
        Set<Class<? extends Character>> subTypes = reflections.getSubTypesOf(Character.class);
        System.out.println(subTypes.size());
    }
}
