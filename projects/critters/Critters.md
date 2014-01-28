1. Act, getActors, processActors, getMoveLocations, setMoveLocation, makeMove
2. getActors, processActors, getMoveLocations, selectMoveLocation, makeMove
3. No, because getActors controls everything around it and not the actual object. 
4. It looks for color, location, and what the object.
5. getActors looks for everything around it to see how it will react. getMoveLocation it looks for locations that the critter can move to. The makeMove actually moves the critter.
6. You just import the critter and dont have to contruct it. 

set 8

1. The method calls alll the other methods so when Chameleon overrides processActors and makeMove, it will behave different.
2. It needs to call the Actors class.
3. Just add the flower act to the makeMove
4. It does not override because getActors needs to run the way it is to determine how many spaces it can go.
5. It is located in actor.
6. It calls getGrid from the actor class.

set 9
1. It does not to change anything and everything it needs for the process is the same as its parents critter class.
2. It checks the spaces next to it to see what type of actor it is. If it is not a rock or a critter, it will eat everything else.
3. It needs to predict where the things it is going to eat are facing and where they are going to go.
4. (2,4) (4,4) (2,3) (2,5) (3,3) (3,5) (4,3) (4,5)
5. They can both move left and right.
6. When it cant move left or right.
7. A crabCritter is a critter and a crabCritter does not eat critters
