/**
 * Created by t00021385 on 21/11/2016.
 */
public class EGameSystem {

    public EGameSystem(String gameName, String gameStatus, String gameCategory, String gamePurchasedDate,
                       String gamePlayTime, String gameAuthCode)
    {
        this.gameName = gameName;
        this.gameStatus = gameStatus;
        this.gameCategory = gameCategory;
        this.gamePurchasedDate = gamePurchasedDate;
        this.gameAuthCode = gameAuthCode;
        this.gamePlayTime = gamePlayTime;

    }
   private String gameName;
   private String gameStatus;
   private String gameCategory;
   private String gamePurchasedDate;
   private String gamePlayTime;
   private String gameAuthCode;

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }


    public String getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(String gameStatus) {
        this.gameStatus = gameStatus;
    }

    public String getGameCategory() {
        return gameCategory;
    }

    public void setGameCategory(String gameCategory) {
        this.gameCategory = gameCategory;
    }

    public String getGamePurchasedDate() {
        return gamePurchasedDate;
    }

    public void setGamePurchasedDate(String gamePurchased) {
        this.gamePurchasedDate = gamePurchased;
    }

    public String getGamePlayTime() {
        return gamePlayTime;
    }

    public void setGamePlayTime(String gamePlayTime) {
        this.gamePlayTime = gamePlayTime;
    }

    public String getGameAuthCode() {
        return gameAuthCode;
    }

    public void setGameAuthCode(String gameAuthCode) {
        this.gameAuthCode = gameAuthCode;
    }

    public String toString(){
        return "Game Name: " + gameName + "\nGame Status: " + gameStatus +
                "\nGame Category: " + gameCategory + "\nGame Purchase Date: " + gamePurchasedDate +
                "\nGame Time: " + gamePlayTime + " hrs"  +"\nGame Code: " + gameAuthCode;
    }



} //end class
