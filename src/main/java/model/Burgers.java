package model;

//this interface will define all the methods we need to access the data from our Bean.
//This is the interface the DAO will implement.
public interface Burgers {

    //We need a method to go find a burger by its ID
    Burger findByID(long id);


    //We need a method to create a new burger, and retrun the ID(long) once its successfully created.
    long createBurger(Burger burger);

}
