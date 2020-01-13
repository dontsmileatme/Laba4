package Entities;

import Enums.*;

public class BodyParts extends AThing {
    private Condition condition;
    private Human Owner;
    public BodyParts(String name) {
        super(name);
        System.out.println("Создана " + this.getName());
    }

    @Override
    public String getName() {
        return "Часть тела \"" + name + "\"";
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
        System.out.println(this.getName() + " присвоено свойство \"" + condition.getTitle() + "\"");
    }

    public void setOwner(Human human) {
        this.Owner = human;
        System.out.println(this.getName() + " принадлежит " + human.getName());
    }

    public Human getOwner(){
        return Owner;
    }

    @Override
    public String toString() {
        return this.getCondition().getTitle() + " " + this.getName();
    }

    public class Hands extends BodyParts {
        public Hands(String name, Condition condition) {
            super(name);
            this.setCondition(condition);
        }

        public void hold(AThing thing) {
            System.out.println("В " + this.getName() + " остался " + thing.getName());
        }
    }

    public class Neck extends BodyParts {
        public Neck(String name, Condition condition) {
            super(name);
            this.setCondition(condition);
        }

        public void cling(Trees branches, Adverbs adv) {
            System.out.println(this.toString() + " " + adv.getTitle() + " зацепилась за " + branches.getName());
        }
    }

    public class Mouth extends BodyParts {
        public Mouth(String name, Condition condition) {
            super(name);
            this.setCondition(condition);
        }

        public void bite(FairyMushroom thisOne, FairyMushroom thatOne, Adverbs ad) {
            System.out.println(getOwner().getName() + " " + ad.getTitle() + " стала откусывать то " + thisOne.getName() + ", то " + thatOne.getName());
            System.out.println("Для " + getOwner().getName() + " сначала" + getOwner().setSize(Size.TALL) + ", затем" + getOwner().setSize(Size.SHORT));
        }
    }
}
