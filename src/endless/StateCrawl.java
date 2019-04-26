package endless;

import endless.model.Player;

public class StateCrawl extends State {


    public StateCrawl(Player p) {
        super(p);
    }

    public void jumpPressed(){ }

    public void crawlPressed(){ }

    public void crawlReleased(){
        p.stopCrawling();
        p.setState(new StateIdle(p));
    }

    public void enterGround(){}

}
