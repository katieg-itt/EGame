/**
 * Created by Keith Hussey on 25/11/2016.
 */
public enum Category {

    MMO,SIMULATIONS,ADVENTURE,RTS,PUZZLE,ACTION,STEALTH,COMBAT,HORROR,SANDBOX,FPS;

    public String toString(){
        switch(this){

            case MMO :
                return "MMO";

            case SIMULATIONS:
                return "Simulation";

            case ADVENTURE:
                return "Adventure";

            case RTS:
                return "Real time Strategy";

            case PUZZLE:
                return "Puzzle";

            case ACTION:
                return "Action";

            case STEALTH:
                return "Stealth";

            case COMBAT:
                return "Combat";

            case HORROR:
                return "Horror";

            case SANDBOX:
                return "SandBox";

            case FPS:
                return "First Person Shooter";

            default:
                return "Game Genre not specified";

        }
    }


}
