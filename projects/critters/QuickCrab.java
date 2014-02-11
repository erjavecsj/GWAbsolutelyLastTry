import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Rock;
import java.awt.Color;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import java.util.ArrayList;

public class QuickCrab extends CrabCritter {

       public ArrayList<Location> getMoveLocations()
       {
           ArrayList<Location> locs = new ArrayList<Location>();
            int l = getDirection() -90;
            int r = getDirection() + 90;
            getLocationTwoAway(locs, r);
            getLocationTwoAway(locs, r);

           return locs;
       }

       public void  getLocationTwoAway(ArrayList<Location> locs, int direction) {
        
        Grid gr = getGrid();



        Location neighborLoc1 = getLocation().getAdjacentLocation(direction);
        if (gr.isValid(neighborLoc1) && gr.get(neighborLoc1) == null) {
            Location neighborLoc2 = neighborLoc1.getAdjacentLocation(direction);
            if (gr.isValid(neighborLoc2) && gr.get(neighborLoc2) == null) {
                locs.add(neighborLoc2); 
            }
        }


       }
}

