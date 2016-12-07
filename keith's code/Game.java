/**
 * Created by Keith Hussey on 25/11/2016.
 */
public class Game {

    private String gameName;

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public Category getGameCategory() {
        return gameCategory;
    }

    public void setGameCategory(Category gameCategory) {
        this.gameCategory = gameCategory;
    }

    public String getGamePurchaseDate() {
        return gamePurchaseDate;
    }

    public void setGamePurchaseDate(String gamePurchaseDate) {
        this.gamePurchaseDate = gamePurchaseDate;
    }

    public double getGamePlayTime() {
        return gamePlayTime;
    }

    public void setGamePlayTime(double gamePlayTime) {
        this.gamePlayTime = gamePlayTime;
    }

    public boolean isGamePurchasedFromStore() {
        return gamePurchasedFromStore;
    }

    public void setGamePurchasedFromStore(boolean gamePurchasedFromStore) {
        this.gamePurchasedFromStore = gamePurchasedFromStore;
    }

    public String getGameCode() {
        return gameCode;
    }

    public void setGameCode(String gameCode) {
        this.gameCode = gameCode;
    }

    private Category gameCategory;
    private String gamePurchaseDate;
    private double gamePlayTime;
    private boolean gamePurchasedFromStore;
    private String gameCode;

    public Game(String gameName, Category gameCategory, String gamePurchaseDate, double gamePlayTime,
                boolean gamePurchasedFromStore, String gameCode)
    {
        this.gameName = gameName;
        this.gameCategory = gameCategory;
        this.gamePurchaseDate = gamePurchaseDate;
        this.gamePlayTime = gamePlayTime;
        this.gamePurchasedFromStore = gamePurchasedFromStore;
        this.gameCode = gameCode;
    }

    @Override
    public String toString() {
        return "\nGameName: " + gameName +
                "\nGameCategory: " + gameCategory +
                "\nGamePurchaseDate:" + gamePurchaseDate +
                "\nGamePlayTime: " + gamePlayTime + "hrs" +
                "\nGamePurchasedFromStore: " + gamePurchasedFromStore +
                "\nGameCode: " + gameCode + "\n";
    }
//end class
}
