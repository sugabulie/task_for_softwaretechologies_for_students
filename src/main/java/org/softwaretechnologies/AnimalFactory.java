package org.softwaretechnologies;

import org.softwaretechnologies.animals.*;

public class AnimalFactory {

    /**
     * Метод для создания животных по типу
     * @param name - имя животного
     * @param type - тип животного
     * @return животное, соответствующее каждому из типов.
     */


    public static Animal createAnimal(String name, AnimalType type) {
        switch (type){
            case DOG -> {return new Dog(name);}
            case CAT -> {return new Cat(name);}
            case COW -> {return new Cow(name);}
            }
        return createAnimal(name,type);
    }
}
