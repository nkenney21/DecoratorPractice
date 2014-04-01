

package decoratorpracticelab;

/**
 *
 * @author neilkenney
 */
public class Ring extends GameCharacterDecorator {
    private double health;
    GameCharacter gc;
    
    public Ring(GameCharacter game, double health){
        this.gc = game;
        this.health = health;
    }

    @Override
    public void setHealthModifier(double health) {
        this.health = health;
    }

    @Override
    public String getDescription() {
        return gc.getDescription() + " plus a ring";
    }

    @Override
    public double getHealth() {
        
        return gc.getHealth() + health;
    }


}
