package endless;

import endless.model.Player;

public class StateIdle extends State {

    public StateIdle(Player p) {
        super(p);
    }

    public void jumpPressed(){
        p.jump();
        p.setState(new StateJump(p));
    }

    public void crawlPressed(){
        p.crawl();
        p.setState(new StateCrawl(p));
    }

    public void crawlReleased(){}

    public void enterGround(){ }

}
