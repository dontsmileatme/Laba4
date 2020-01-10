package Entities;

public class Trees extends AThing {
    public Trees(String name){
        super(name);
        System.out.println("Создан " + this.getName());
    }

    public static class Branches extends Trees{
        public Branches(String name){
            super(name);
            System.out.println("Созданы части объекта \"Деревья\": " + this.getName());
        }
    }
}