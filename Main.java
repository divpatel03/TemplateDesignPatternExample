public class Main {
    public static void main(String[] args) throws Exception {
        //Creating a GameLoader object for the R6 Game class
        GameLoader R6Loader = new R6Game(); 
        //Invoking the load method in GameLoader that will invoke the R6Game methods
        R6Loader.load();

        //Line break for styling
        System.out.println("----------------");

        //Creating a GameLoader object for the CS Game class
        GameLoader CSLoader = new CSGame();
        //Invoking the load method in GameLoader that will invoke the CSGame methods
        CSLoader.load();
    }   
}
