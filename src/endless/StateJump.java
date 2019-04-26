package endless;

import endless.model.Player;

public class StateJump extends State {


    public StateJump(Player p) {
        super(p);
    }

    public void jumpPressed(){
        p.jump();
        p.setState(new StateJump2(p));
    }

    public void crawlPressed(){}

    public void crawlReleased(){}

    public void enterGround(){
        p.enterGround();
        p.setState(new StateIdle(p));
    }

}
