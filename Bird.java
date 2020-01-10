package Entities;

import Enums.*;
import Interfaces.*;

public class Bird extends AEverything {
    public Bird(String name) {
        super(name);
        System.out.println("Создана " + this.getName());
    }

    @Override
    public String getName() {
        return "Птица " + "\"" + name + "\"";
    }

    public static void golubkaSpeech() {
        class Golubka extends Bird implements Sayable {
            public Golubka(String name) {
                super(name);
            }

            @Override
            public String say(String phrase, Adverbs adv) {
                return this.getName() + " " + adv.getTitle() + " сказала: \"" + phrase + "\"";
            }
        }

        Golubka golubka = new Golubka("Голубка");
        System.out.println(golubka.say("Ах вот как? Ну, тогда проваливай!", Adverbs.RUDELY));
        golubka.sitDown(Location.NEST);
    }

    public void sitDown (Location location){
       System.out.println(this.getName() + " начала усаживаться в " + location.getTitle());
    }
}