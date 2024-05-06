public abstract class GameLoader {
    //Loader method that will invoke the methods of the chosen subclass
    public void load() {
        initalize();
        loadAssets();
        setupGame();
        startGame();
    }

    //Methods needed to be implemented in the subclasses of GameLoader
    public abstract void initalize();
    public abstract void loadAssets();
    public abstract void setupGame();
    public abstract void startGame();
}
