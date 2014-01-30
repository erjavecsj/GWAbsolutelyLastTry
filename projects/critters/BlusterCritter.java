import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
import info.gridworld.actor.Rock;
import java.awt.Color;

import java.util.ArrayList;


public class BlusterCritter extends Critter{
	
	private int c;
	public BlusterCritter(int c) {
		super();
		this.c = c;
	}

	public ArrayList<Actor> getActors()
	{

		ArrayList<Actor> critters = new ArrayList<Actors>();
		Location loc = getLocation;
		for (int r= loc.getRow() - 2; r<= loc.getRow() +2; r++) {
			for (int z = loc.getCol() -2; r<= loc.getCol +2; z++) {
				if (getGrid().isValid(loc2)) {
					if (getGrid().get(loc2) instanceof Critter) {
						c++;
					}
				}
			}
		}
	    
	}

	public void processActors(ArrayList<Actor> actors, int c)
	{
	    for (Actor a : actors)
	    {
	        if (!(a instanceof Rock) && !(a instanceof Critter))
	            a.removeSelfFromGrid();
	        if (c<a.size) {
	        	lighten();
	        } else {
	        	darken();
	        }
	    }


	}

	public void darken() {
		Color c = getColor();
		int red = (int) (c.getRed() * (.95));
		int green = (int) (c.getGreen() * (.95));
		int blue = (int) (c.getBlue() * (.95));
		setColor(new Color(red, green, blue));
	}

	public void lighten() {
		Color c = getColor();
		int red = (int) (c.getRed() * (1.05));
		int green = (int) (c.getGreen() * (1.05));
		int blue = (int) (c.getBlue() * (1.05));
		setColor(new Color(red, green, blue));
	}
}