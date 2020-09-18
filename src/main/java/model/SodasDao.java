package model;

import java.util.ArrayList;
import java.util.List;

public class SodasDao implements Sodas{

    private List<Soda> sodas = new ArrayList<>();

    public SodasDao(){
        Soda coke = new Soda("Coca-Cola",3);
        coke.setId(1L);
        sodas.add(coke);

        Soda drPepper = new Soda("Dr. Pepper", 3);
        drPepper.setId(2L);
        sodas.add(drPepper);

        Soda sprite = new Soda("Sprite", 3);
        sprite.setId(3L);
        sodas.add(sprite);

    }

    @Override
    public long createSoda(Soda soda) {
        soda.setId(sodas.size() + 1);

        sodas.add(soda);

        return soda.getId();
    }

    @Override
    public Soda findById(long id) {
        return sodas.get((int)id - 1);
    }
}
