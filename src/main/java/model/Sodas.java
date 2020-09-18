package model;

public interface Sodas {

    long createSoda(Soda soda);


    //we want a method to find an ingredient by its ID
    Soda findById(long id);

}
