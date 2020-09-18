package model;


//This DAO Factory class is used as a window into every Bean type we create.
//This class has a magic Claaaw for each Beach type.
public class DaoFactory {

    // We don't want to require accessing the BurgersDAO directly, instead we will reference its interface.
    private static Ingredients ingredientsDao;
    private static Burgers burgersDao;
    private static Sodas sodasDao;

    // any Bean type we have will get a method called get[Bean]Dao()

    public static Burgers getBurgersDao(){
        if(burgersDao == null){
            burgersDao = new BurgersDAO();
        }
        return burgersDao;
    }

    public static Ingredients getIngredientsDao(){
        if(ingredientsDao == null){
            ingredientsDao = new IngredientsDao();
        }
        return ingredientsDao;
    }

    public static Sodas getSodasDao(){
        if(sodasDao == null){
            sodasDao = new SodasDao();
        }
        return sodasDao;
    }



}
