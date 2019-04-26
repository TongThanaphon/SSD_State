package endless;

import endless.model.Player;

public class StateJump2 extends State {

    public StateJump2(Player p) {
        super(p);
    }

    public void jumpPressed(){ }

    public void crawlPressed(){ }

    public void crawlReleased(){ }

    public void enterGround(){
        p.enterGround();
        p.setState(new StateIdle(p));
    }

}
