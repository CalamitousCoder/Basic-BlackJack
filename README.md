# Basic Black Jack
This program allows the user to play rounds of Black Jack. At the end of each game they are asked if they'd like to stop playing. Once they are finished they are told how many rounds they lost and won.


## How It's Made:

**Concepts used:** if statements, loops, and logical operators.
I seperated this program into handling the player's turn, computer's turn, win conditions and quit condition. 

### The Player & Computer Turns
During the player's turn, A random number from 1 - 11 is generated and stored in the randomCard variable. The player is then asked to if they'd like to hit or if they are done. If they choose'hit,' the value of randomCard is added to their score. Then they are asked again if they'd want to hit or stop. This continues until either the player busts (their score goes over 21) or they say they are ready to stop.


During the computer's term, it is given a random card until its score it at least 17 or it busts.

### Post Game
After the game, the scores of the player and computer are compared and the winner is determined. Then variables are incremented to keep track of the player's win and loss. The player will be asked if they'd like to play another round or not. When they decide to quit their win and loss rate will be printed. The 'quitting' is handled via a massive while loop that is exited when the player says they are done playing.

## Lessons Learned:
Computer's can mimick seemingly complex behavior with simple code. 
  I was surprised at how difficult it was to defeat the computer opponent despite how simple its behavior was.

Polish make's a big difference.
  There are lot things done with print statements like adding extra lines just to make the program look a bit nicer. Although they don't change functionality, those touches greatly improved the experience for     users.

 
