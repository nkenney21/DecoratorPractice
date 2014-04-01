

package decoratorpracticelab;

/**
 *
 * @author neilkenney
 */
public class Barbarian extends GameCharacter{
   

    @Override
    public double getHealth() {
        return 120;
    }

    @Override
    public String getDescription() {
        return "Barbarian";
    }

}
