package Entities;

import Exceptions.*;

public abstract class AEverything {
    public String name;

    public AEverything(String name) throws WrongNameException {
        this.name = name;
        if((this.name == "") || (this.name == null)) {
            throw new WrongNameException("Данное имя недопустимо");
        }
    }

    public String getName(){
        return "Объект " + "\"" + this.name + "\"";
    }

    @Override
    public String toString(){
        return "Созданный объект: " + "\"" + this.name + "\"";
    }

    @Override
    public int hashCode(){
        return this.name.hashCode();
    }

    @Override
    public boolean equals(Object obj){
        AEverything t = (AEverything) obj;
        return (this.name == t.name) ? true : false;
    }
}
