public class CSGame extends GameLoader{
    //Abstract methods from parent class 
    public void initalize() {
        System.out.println("Initializing CS");
    }

    public void loadAssets() {
        System.out.println("Loading CS Assets");
    }

    public void setupGame() {
        System.out.println("Setting Up CS");
    }

    public void startGame() {
        System.out.println("Starting CS");
    }
}