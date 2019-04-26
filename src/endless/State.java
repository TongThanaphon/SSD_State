package endless;

import endless.model.Player;

public abstract class State {

    protected Player p;

    public State(Player p){
        this.p = p;
    }

    public void jumpPressed(){}

    public void crawlPressed(){}

    public void crawlReleased(){}

    public void enterGround(){}

}
