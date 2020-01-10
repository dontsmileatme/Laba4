import Entities.*;
import Enums.*;
import Exceptions.*;

public class Main {
    public static void main(String[] args) {
        Bird.golubkaSpeech();
        Human alice = new Human("Алиса", Size.TALL, 7);
        try{
            if (alice.getAge() < 0) {
                throw new NegativeAgeException();
            }
        }
        catch(NegativeAgeException ex){
            ex.printStackTrace();
        }
        BodyParts partsOfAlice = new BodyParts("Части тела Алисы") {
            @Override
            public String getName() {
                return name;
            }
        };
        BodyParts.Mouth mouth = partsOfAlice.new Mouth("Рот", Condition.NEW);
        mouth.setOwner(alice);
        BodyParts.Neck neck = partsOfAlice.new Neck("Шея", Condition.NEW);
        neck.setOwner(alice);
        BodyParts.Hands hands = partsOfAlice.new Hands("Руки", Condition.NEW);
        hands.setOwner(alice);
        Trees trees = new Trees("Деревья");
        alice.wade(trees);
        Trees.Branches branches = new Trees.Branches("Ветки");
        neck.cling(branches, Adverbs.ALLTHETIME);
        alice.stop();
        alice.out(trees);
        FairyMushroom pieces = new FairyMushroom("Кусочки волшебного гриба");
        alice.remember();
        hands.hold(pieces);
        alice.getout(Location.FREEPLACE);
        FairyMushroom thisOne = new FairyMushroom("Этот Кусочек");
        FairyMushroom thatOne = new FairyMushroom("Тот Кусочек");
        mouth.bite(thisOne, thatOne, Adverbs.WITHTHEGREATESTCARE);
        alice.toBecomeNormal();
        mouth.setCondition(Condition.OLD);
        neck.setCondition(Condition.OLD);
        hands.setCondition(Condition.OLD);
        alice.wean(Adverbs.AWKWARDLY);
    }
}


