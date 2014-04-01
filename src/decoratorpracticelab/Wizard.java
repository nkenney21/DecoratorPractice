

package decoratorpracticelab;

/**
 *
 * @author neilkenney
 */
public class Wizard extends GameCharacter{
       
    

    @Override
    public double getHealth() {
        return 100;
    }

    @Override
    public String getDescription() {
        return "Wizard";
    }



}
