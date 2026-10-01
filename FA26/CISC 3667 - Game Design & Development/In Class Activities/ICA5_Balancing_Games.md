# Part 1: Analyze an Unbalanced Game
## 1.
Fairness: Is the game symmetrical? Does giving both players identical
actions necessarily guarantee a fair experience? Consider the starting
conditions, available actions, and turn order.
### Answer:
- The game is mostly symmetrical. The difference between the players that makes it asymmetrical is that one gets to go before the other, which is inherently advantageous in a racing game.

## 2.
Meaningful Choices: Compare the three available actions. Does each
action offer a meaningful strategic advantage? Explain whether players
have a reason to select different actions depending on the situation.
### Answer:
- Safe Move: Guarantees that the player can move forward; choice that player can make to guarantee progress
- Risky Move: Player can move a forward by a greater distance; choice that player can make to hopefully gain an advantage.
- Power move: Just moves the player forward by a larger, fixed amount of spaces; might choose this to brashly get past another player.

## 3.
Dominant Strategies: Does the game contain a dominant strategy? If so,
identify it and explain how it affects player decision-making and the overall
gameplay experience.
### Answer:
- Players have a 50% chance to end the game in four moves or are guaranteed to end the game. The ordering of actions for ending the game is not important. 
	- End in four moves: Use both power moves, succeed in rolling a risky move (50% chance), and then a single safe move
	- End in six moves: Use Both power moves, then four safe moves.
- The optimal strategy is to try to end the game in four moves, because even if they fail the first roll, they still have a another move to try again, as latter strategy requires six moves. This will make almost every game look the same. It'll become boring.

## 4.
Challenge: Evaluate the game's level of challenge. Does the current
design require meaningful decisions or strategic thinking? Explain how the
available mechanics influence the difficulty of winning.
### Answer:
- The current game design indeed requires more meaningful decisions and currently offers little strategic thinking. The current power move is a meaningless mechanic--it practically just makes the game shorter by ten tiles. If you think about it, there is no benefit to holding off on using the power moves, since all players could just expend their two power moves right at the start of the game, making it as if they both started at tile ten. Similarly, the game's safe move does the same thing but to a lesser magnitude. 
- Additionally, the fixed numbers attributed to guaranteed movement mechanics make the game too deterministic which gives an advantage to player 1 since they always get to go first. Naturally the sequential nature of turn-based games would favor player 1 reaching the win-condition first.
- The risky move is good--gambling.

## 5.
Triangularity: Examine the relationship between risk, reward, and
certainty in the original game. Does the Risky Move offer a meaningful
alternative to the other actions? Explain your reasoning.
### Answer:
- Yes, the risky move allows players to take a risk to get ahead of another participating player and may even force the other participating player to play a risky move to regain a lead (if they lost it.)

## 6.
Identifying Balancing Problems: Based on your analysis, identify three
potential balancing concerns or trade-offs. For each problem, explain
which mechanic or rule causes it and how it affects the gameplay
experience.
### Answer:
- Player 1 gets the first turn -- unfair.
	- The moves are too deterministic. In a sequential game with turns, this favors player 1.
- Power moves -- meaningless.
	- These need to be reworked to have more meaningful interactions. In this version of the game, this basically cuts the tile-set in half.
- Risky moves -- not enough value
	- The game is too deterministic as it currently is. Player 2 is forced to take a risky move if they want to win, while player 1 simply wins because they get to go before player 2. There needs to be more value for risky moves to encourage its use and make the game more interesting.


# Part 2: Investigate the Game Mechanics
## 1.
Calculate the expected number of spaces a player advances when selecting
each of the original game's three actions. Show your calculations and complete
the following table.
### Solution:
Expected Value Of Risky Move $= (\frac{3}{6} \times 7) + (\frac{3}{6} \times 0) = 3.5 + 0 = 3.5$
Everything else has 100% probability of success...

### Answer:

| Action     | Possible Outcomes | Probability Of Each Outcome | Expected Movement |
| ---------- | ----------------- | --------------------------- | ----------------- |
| Safe Move  | 1                 | 100%                        | 3                 |
| Risky Move | 2                 | 50%                         | 3.5               |
| Power Move | 1                 | 100%                        | 5                 |

## 2.
Compare the Actions: Based on your calculations, which action provides the
highest expected movement? Does this automatically make it the most effective
action in every possible situation? Explain your reasoning.
### Answer:
-  The power move provides the highest expected movement. While it is still available in the game, it is the most effective action, as it guarantees larger movement than the safe move and eliminates the uncertainty associated with the risky move.

## 3.
Risk Versus Reward: Compare the Risky Move and the Power Move. Does
the potential reward of the Risky Move justify its uncertainty? Explain why a
player might or might not choose it over the Power Move.
- The risky move's potential reward does justify its uncertainty. The potential reward is the greatest movement in the game. However, this relies too heavily on chance to be a stable long-term strategy. For this reason, I believe players are more likely to opt to consume all of their power moves before trying a risky move.

## 4.
Suppose you could only modify the numerical values of the three actions without
introducing additional rules or mechanics.
- What values would you change to make the actions more competitive?

Propose at least one numerical adjustment and explain how it might influence
player decisions.

These preliminary adjustments do not have to be the same as the changes you
develop in Part 3

### Answer:
- I would most like to change the safe moves movement value from 3 to 2. This would discourage safe play, slowing down the game and providing more opportunities for the players to try risky moves. The increased abundance of opportunities for risky moves destabilizes the game, undermining the advantage born of simply having the first turn.

# Part 3: Redesign and Balance the Game

## A.
Evaluate the original game's starting conditions and determine whether either player receives an unintended advantage.
- Propose at least one adjustment intended to improve fairness. You may consider modifying turn order, introducing compensating advantages, or adjusting other mechanics.
- Explain why your proposed change should improve fairness and whether it introduces any new balancing concerns.
### Answer:
- The first player to move cannot use power moves until their fourth turn. This eliminates their chance of winning the game on their fourth turn, which gives the opposing player a chance at victory.
## B.
### Answer:

|    Move    |                                                    Effect                                                     |                         Advantage                         |                                  Disadvantage                                   |
| :--------: | :-----------------------------------------------------------------------------------------------------------: | :-------------------------------------------------------: | :-----------------------------------------------------------------------------: |
| Safe Move  |                                  Roll d6; Consume turn.<br>Move that amount.                                  |                   Chance for high roll                    |                               Chance for low roll                               |
| Risky Move | Roll d6; Consume turn.<br>Odd value - move backward 2 tiles.<br>Even value - opponent moves backward 4 tiles. |           Chance to move<br>opponent backwards            |                        Chance to move<br>self backwards                         |
| Power Move |       Roll d6; Doesn't consume turn<br>Next movement $\times 1.5$<br><br>Can only be used twice a game.       | Multiplies safe roll magnitude positively;<br>go forwards | If failing a roll<br>on a risky move<br>can move self<br>backwards $\times 1.5$ |
- These changes undermine the advantage that player 1 gets from going first by introducing instability to the game via nondeterminism. They also take away the absoluteness of strategic might that Power move used to have by allowing it to backfire.

- Safe moves:
	- Player wants to move forward
- Risky moves:
	- Player wants to interfere with opposing player and move them backwards with a 50% success rate. If they fail, the roller moves backwards instead, but at a lower penalty.
- Power moves:
	- Player wants to invest in a multiplier for their next safe roll. 50% rate of moving backwards or forwards by accident.
## C.
Consider how your redesigned mechanics affect the difficulty of winning. 

Your game should provide an appropriate level of challenge without making success entirely dependent on chance or creating unnecessary frustration.

Identify one mechanic in your redesigned game that contributes to its challenge.

Explain:
- How the mechanic works.
- What decisions players must make in response to it.
- How it contributes to the overall gameplay experience.

Consider whether your changes allow players to make strategic decisions
throughout the game, including when they are ahead or behind.

### Answer:
- The power move mechanic. It's simply a multiplier that can make the game more or less challenging depending on who benefits from it. A player who invokes the power move must decide if they want to use it on a Risky move to sabotage an opponent or if they want to use it to increase their movement. This allows more strategic gameplay--choosing between making an attempt at moving past them or moving them backwards with the risk that you move backwards instead.

## D. Complete Revised Rules
Write a complete set of rules for your redesigned game.

Your rules should clearly explain the starting conditions, available actions, any new restrictions or mechanics, turn structure, and win condition.

Another student should be able to understand how your redesigned game works without requiring additional explanations

### Answer:

**Setup:**
- Two players play
- Both players begin on space 0 of a 20-space track
- Player 1 always takes the first turn.
- Players alternate turns until someone wins.

**Gameplay:**
On each turn, a player may select a move. If the move states that it consumes their turn, then their turn ends after playing that move.


|    Move    |                                                    Effect                                                     |                         Advantage                         |                                  Disadvantage                                   |
| :--------: | :-----------------------------------------------------------------------------------------------------------: | :-------------------------------------------------------: | :-----------------------------------------------------------------------------: |
| Safe Move  |                                  Roll d6; Consume turn.<br>Move that amount.                                  |                   Chance for high roll                    |                               Chance for low roll                               |
| Risky Move | Roll d6; Consume turn.<br>Odd value - move backward 2 tiles.<br>Even value - opponent moves backward 4 tiles. |           Chance to move<br>opponent backwards            |                        Chance to move<br>self backwards                         |
| Power Move |       Roll d6; Doesn't consume turn<br>Next movement $\times 1.5$<br><br>Can only be used twice a game.       | Multiplies safe roll magnitude positively;<br>go forwards | If failing a roll<br>on a risky move<br>can move self<br>backwards $\times 1.5$ |

**Additional Rules:**
- Players may choose any action for which they meet the requirements.
- Each player may use Power Move at most twice per game. Safe Move and Risky Move have no usage limits.
- Players can interfere with each other.
- The first player to reach or pass space 20 immediately wins.
- Players cannot be moved backwards past the 0 tile.

**Changes:**
- Players can now interfere with one another.
- Changed effects of *Safe Move*, *Risky Move*, & *Power Move*
- Player turns no longer end as soon as they pick a move, effects now dictate the end of their turn.

# Part 4: Triangularity and Risk-Reward Analysis
## Scenario A: Approaching the Finish Line:
- Both players are tied on space 17. It is Player 1's turn.
-  Using your redesigned rules:
	-  What actions are available to Player 1, and what are their possible outcomes?
		- Safe move: greater than 50% chance to win the game.
		- Risky move: troll the game and send the opposing player backwards 4 tiles or send self backwards 2 tiles.
		- Power move: If they still have any uses of it left, they could increase their chances of winning the game.
	-  Which action would you consider selecting in this situation? Explain your reasoning.
		- If I have any power moves left over, I would use one to boost a safe roll, which would increase my chances of winning.
	-  Does your design provide multiple reasonable options, or does one action become clearly preferable? Explain
		- This scenario places both players too close to the end of the game to make any other decision reasonable. In this case, however, there is indeed a "best choice".

## Scenario B: Falling Behind:
-  Player 1 is on space 15, while Player 2 is on space 8. It is Player 2's turn.
-  Using your redesigned rules:
	-  What options does Player 2 have for attempting to recover?
		- If player 2 has any power moves left, use one, and attempt a risky move to move player 1 backwards by 6 tiles (-4 tiles from risky move $\times -1.5$ = -6 tiles)
	-  Does your game provide meaningful decisions for a player who is significantly behind?
		- Not really, the game is symmetrically nondeterministic, meaning that a lot of it hinges on chance. There's not much that a player can do if they rolled something like four consecutive 1's.
	-  Would you introduce any additional balancing adjustments to address this situation? Explain why or why not.
		- Yes, perhaps some sort of logarithmic negative feedback loop, so that players closer to the end of the game have a harder time to progress, giving losing players a chance to catch up and make the game more interesting. For example, players safe move roll values are 25% smaller past tile 10, and 50% smaller past tile 15.


### Scenario C: Repeated Strategies:
- Imagine that a player repeatedly selects the same action throughout the game.
- Under your revised rules, could repeatedly selecting one action become a dominant strategy? Explain.
	- No, if the player chooses the power move action, they have to then pick a second action. They could alternatively be selecting the safe move again and again, but they would be missing out on the multiplier offered by the power move action. If they repeated this combination, that would be ideal for progressing the game, but then they'd be sacrificing the chance to move opposing players backwards.
- Identify a situation in which choosing a different action would be beneficial.
	- The other player is ahead of you by 6 tiles, you could invoke the power move and use it on a risky move to try and move the other player backwards 6 tiles.
- What additional adjustment, if any, could encourage players to consider alternative strategies?
	- None

# Final Evaluation and Revision
After analyzing the three scenarios, evaluate your redesigned game as a whole.
- Identify one potential balancing problem that may remain in your design or emerge because of your changes.
	- Too much of the game hinges on chance, leaves much out of player control.
- Propose one additional adjustment to address this problem.
	- Add an action to guarantee player movement.
- Explain which mechanic you would change, why you would change it, and how you expect the adjustment to affect fairness, challenge, or meaningful choices. You do not need to rewrite your complete rules or implement this final adjustment. Remember that your conclusions are based on theoretical analysis. Actual playtesting would be necessary to determine whether your redesigned mechanics function as intended.
	- Changing the safe move to have a minimum value, so instead of allowing players to roll a 1 and moving 1 tile, they would roll a 1 but move a minimum of 3 tiles. If they roll x > 3, then they move x tiles. Something to regulate the pacing of the game and make safe moves more valuable.
