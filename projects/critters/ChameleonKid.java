import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
// import info.gridworld.grid.Location;
import info.gridworld.grid.*;
import java.util.ArrayList;
import java.awt.Color;


public class ChameleonKid extends ChameleonCritter  {
    public ArrayList<Actor> getActors() {
        ArrayList<Actor> a = new ArrayList<Actor>();
        if (getGrid().isValid(getLocation().getAdjacentLocation(getDirection()))) {
            a.add(getGrid().get(getLocation().getAdjacentLocation(getDirection())));
        }
            
        if (getGrid().isValid(getLocation().getAdjacentLocation(getDirection() -180))) {
            a.add(getGrid().get(getLocation().getAdjacentLocation(getDirection()-180))); 
         } 

         if(a.size() == 2) {
            Color c = getColor();
            int red = (int) (c.getRed() * (.95));
            int green = (int) (c.getGreen() * (.95));
            int blue = (int) (c.getBlue() * (.95));
            setColor(new Color(red, green, blue));

        }

        
        return a;
    }
}
