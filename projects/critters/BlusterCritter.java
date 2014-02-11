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

		ArrayList<Actor> actors = new ArrayList<Actor>();
		Location loc = getLocation();
		for (int r= loc.getRow() - 2; r<= loc.getRow() +2; r++) {
			for (int z = loc.getCol() -2; r<= loc.getCol() +2; z++) {
				Location loc2 = new Location (r,z);
				if (getGrid().isValid(loc2)) {
					
					Actor a = getGrid().get(loc2);
					actors.add(a);
					
				}
			}
		}

		return actors;
	    
	}

	public void processActors(ArrayList<Actor> actors)
	{
	    for (Actor a : actors)
	    {
	        if (this.c > actors.size()-1) {
	        	lighten();
	        } else {
	        	darken();
	        }
	    }


	}

	public void darken() {
		Color c = getColor();
		int red = c.getRed();
		int green = c.getGreen();
		int blue = c.getBlue();

		if (red > 0)  red --;
		
		if (green > 0) 	green--;
		
		if (blue > 0) blue--;
		setColor(new Color(red, green, blue));
		
	}

	

	public void lighten() {
		Color c = getColor();
		int red = c.getRed();
		int green = c.getGreen();
		int blue = c.getBlue();

		if (red > 255) red ++;
		
		if (green > 255) green++;
		
		if (blue > 255)	blue++;

		setColor(new Color(red, green, blue));
	}
}