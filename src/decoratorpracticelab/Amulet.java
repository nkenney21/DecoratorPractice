

package decoratorpracticelab;

/**
 *
 * @author neilkenney
 */
public class Amulet extends GameCharacterDecorator{
    private double health;
    GameCharacter gc;
    
    public Amulet(GameCharacter gc, double health){
        this.gc = gc;
        this.health = health;
    }

    @Override
    public void setHealthModifier(double health) {
        this.health = health;
    }

    @Override
    public String getDescription() {
        return gc.getDescription() + " plus an amulet";
    }

    @Override
    public double getHealth() {
        
        return gc.getHealth() + health;
    }

}
