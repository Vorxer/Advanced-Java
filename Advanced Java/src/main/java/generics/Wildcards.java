package generics;

import misc.*;
import misc.Character;

import java.util.ArrayList;
import java.util.List;

public class Wildcards {
    public static void main(String[] args) {

        List<Character> characters = new ArrayList<>();
        characters.add(new Character("Critikal"));
        characters.add(new Character("Kaiser"));
        printChars(characters);


        List<NPC> NPCs = new ArrayList<>();
        NPCs.add(new NPC("Lydia"));
        NPCs.add(new NPC("Serana"));
        printCharsWildcard(NPCs);

        List<Enemy> Enemies = new ArrayList<>();
        Enemies.add(new Enemy("Alduin"));
        Enemies.add(new Enemy("Adam"));
        printCharsWildcard(Enemies);

        addNPCtoList(characters);
    }

    public static void printChars(List<Character> characters){
        for (Character c: characters) {
            System.out.println(c.getName());
        }
    }

    public static void printCharsWildcard(List<? extends Character> characters){
        for (Character c: characters) {
            System.out.println(c.getName());
        }
    }

    public static void addNPCtoList(List<? super NPC> list){
        list.add(new NPC("autogenNPC"));
    }


}
