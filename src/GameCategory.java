/**
 * Created by t00021385 on 21/11/2016.
 */
public enum GameCategory {

    FPS, SPORTS, SIMULATIONS, MMO, ADVENTURE, RTS, PUZZLE, ACTION, COMBAT, STEALTH;

    public String toString()
    {
        switch (this) {
            case FPS:
                return "First Person Shooter";
            case SPORTS:
                return "Sports";
            case SIMULATIONS:
                return "Simulations";
            case MMO: return "MMO";
            case ADVENTURE: return "Adventure";
            case RTS: return "Real Time Strategy";
            case PUZZLE: return "Puzzle";
            case ACTION: return "Action";
            case COMBAT: return "Combat";
            case STEALTH: return "Stealth";



        } //end switch
        return null;
    }// end toString()
} //end class
