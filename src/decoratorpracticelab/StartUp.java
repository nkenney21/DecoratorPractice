
package decoratorpracticelab;

public class StartUp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        GameCharacter gc = new Wizard();
        gc = new Ring(gc, 10);
        
        
       
        
        System.out.println(gc.getDescription());
        System.out.println("Health: " + gc.getHealth());
    }
    
}
