## Short Response
1) What four defining traits of games does Jane McGonigal identify?
	- Feedback System
	- Rules
	- Voluntary Participation
	- Goal
2) Explain what is meant by lusory attitude. How does this concept relate to Bernard Suits' definition of a game?
	- Lusory attitude is the willingness to surrender to the rules and limitations of a game, in order to play it. It relates to Bernard Suits' definition of a game since he thinks that games are obstacle oriented and lusory attitude involves players having to surrender to the rules that compose the unnecessary obstacle.
3) What is iterative design, and why is playtesting important to this process?
	- It is when a game is designed and implemented in some form, for it to be tested and revised repeatedly. Playtesting is imperative to the iterative process to find flaws in the design of a game and guide subsequent revisions.
4) Explain the difference between LeBlanc's Challenge and Discovery kinds of fun.
	- LeBlanc's challenge fun involves achieving something difficult or overcoming a challenge, while LeBlanc's discovery fun is derived from exploration and learning.
5) What is the difference between Lazzaro's Hard Fun and Easy Fun?
	- Lazzaro's hard fun is a lot like LeBlanc's challenge fun--it derives fun from challenge and achievement. Lazzaro's easy fun describes fun derived from exploration, curiosity, and discovery.
6) Explain the difference between Bartle's Achievers and Explorers.
	- Bartle's Achievers are driven by achievement, challenge, scores, and the like. Explorers are driven by curiosity and discovery. Achievers would want to get 100% of achievements in a game, while explorers would rather look for something like hidden areas.
7) Identify the four elements of the Elemental Tetrad and briefly describe each.
	- Mechanics: the procedures as they exist within a game; how the game works.
	- Aesthetics: the sensory elements of the game (audio, graphics, feel).
	- Technology: the medium(s) required for the game to run/exist.
	- Story: the sequence of events that unfolds, whether scripted or emergent.
8) Explain the difference between an object, an attribute, and a state. Give an example from a game.
	- An object is an entity in a game. Attributes are data that belong to and compose an object, and an attribute’s current value is its state. For example, in Minecraft, a player is an object with a health attribute. If the player gets attacked, their health state decreases, representing the health lost from the attack.
9) Explain the difference between a basic action and a strategic action.
	- Basic actions are directly allowed by the rules of a game, while strategic actions are about how players are using their basic actions to achieve a larger goal. For example, moving a knight in chess is a basic action, while moving a pawn into a square guarded by that knight with the intent to occupy more space is a strategic action.
10) What is the difference between operational rules and foundational rules?
	- Operational rules are rules that players read and follow. Foundational rules are the underlying structures that make up the game and guide the creation of the more explicit operational rules.
11) Explain the difference between an unsportsmanlike player and a cheater.
	- Unsportsmanlike players harm the experience of a game by breaking implicit rules, but they still follow operational rules (e.g: taunting). Cheaters harm the experience of a game by breaking both the implicit and operational rules (e.g: peeking at cards).
12) What is a degenerate strategy, and why might it be a problem for game balance?
	- Degenerate strategies are strategies in a game that are especially strong so much so that they're often viewed as unfair. Degenerate strategies are problems for game balance, because they take away meaningful gameplay choices in favor of higher success-rates with the most effect tactic available.
13) Explain the difference between positive and negative feedback loops.
	- Positive feedback loops are a snowballing effect that rewards players for doing well in a game. Negative feedback loops are resistors that hinder winning players in favor of balancing the game for losing players.
14) What is Dynamic Difficulty Adjustment (DDA), and how might it improve the player experience?
	- Dynamic Difficulty Adjustment is when a game automatically changes its difficulty based on how well the player is doing. It improves the experience by keeping players in a state of flow, so the game never becomes boring from being too easy or frustrating from being too hard
15) Explain the difference between theoretical and practical probability.
	- Theoretical probability is the calculated chance that something will happen. Practical probability is the chance that something will happen based on past occurrences.
16) What is the difference between the gambler's fallacy and the lucky streak fallacy?
	- The gambler's fallacy is the idea that a player is due for a win after it hasn't happened for a while. The lucky streak fallacy is the idea that a player who has been doing well will continue to do well. 
17) What is the difference between symmetrical and asymmetrical balance?
	- Symmetrical balance is when all players begin with the same tools/abilities. Asymmetrical balance is when players begin with different tools and abilities that excel at different purposes, but the game is still fair overall.
18) Explain what makes a choice meaningful in game design.
	- A meaningful choice has a real impact on what happens next and how the game turns out. The options must actually differ, and none can be clearly better than the rest (a dominant strategy), or it’s like having no choice at all.
19) What is triangularity, and how does it relate to risk and reward?
	- Triangularity is the relationship between risk, reward, and certainty; it gives players the choice to pick between safe, low-reward options and risky, high-reward options.
20) What is game state in JavaScript? Give two examples of variables that might represent a game's state.
	- In JavaScript, a game state is likely the set of variables that track the values of attributes for objects representing game elements. Two variables representing a game's state could be `player.health` and `score`. 
21) Explain the purpose of update() and draw() in a JavaScript game loop.
	- The `update()` function is meant to update the game states in a JavaScript game loop, then the `draw()` function re-renders the visuals of the game to provide a graphical representation for the game with its current state(s). The game loop calls these functions to progress the game.
22) What is collision detection, and how can it affect a game's state?
	- Collision detection is when the game checks for elements touching or overlapping. The game may mutate its state(s) on the condition that collision is detected.
## True or False
1) According to Jane McGonigal, competition is one of the four defining traits of games.
	- False
2) A lusory attitude involves voluntarily accepting a game's rules and limitations.
	- True
3) LeBlanc's Eight Kinds of Fun are mutually exclusive, meaning a game can only provide one kind of fun at a time.
	- False
4) Bartle's Socializers primarily enjoy interacting and forming relationships with other players.
	- True
5) The four elements of the Elemental Tetrad can influence one another.
	- True
6) An attribute represents the current value of an object's property, while a state represents the property itself.
	- false
7) Behavioral rules involve expectations about appropriate player behavior and sportsmanship.
	- true
8) A player who uses an unusual but legal strategy is automatically cheating.
	- false
9) Positive feedback loops can cause an advantage to grow over time.
	- true
10) Negative feedback loops always make a game easier for every player.
	- false
11) Dynamic Difficulty Adjustment can respond to a player's performance.
	- true
12) When rolling two six-sided dice, all possible totals are equally likely.
	- false
13) If a fair coin lands on heads five times in a row, tails becomes more likely on the next flip.
	- false
14) Expected value represents the average outcome expected over many occurrences.
	- true
15) An asymmetrical game can still be balanced and fair.
	- true
16) A dominant strategy can reduce meaningful choices.
	- true
17) JavaScript arrays begin at index 1.
	- false
18) The JavaScript expression score += 5 is equivalent to score = score + 5.
	- true
19) The logical OR operator (||) requires both conditions to be true.
	- false
20) The draw() function is generally responsible for changing a game's rules and updating its state.
	- false
21) A JavaScript object can store multiple attributes of a game character.
	- true
22) requestAnimationFrame() can be used to repeatedly schedule frames in a JavaScript game
	- true
## Multiple Choice
1) Which of the following best represents Jesse Schell's definition of a game?  
	- A. A form of play with goals and structure. 
	- B. A voluntary attempt to overcome unnecessary obstacles. 
	- C. A problem-solving activity approached with a playful attitude.  
	- D. An activity defined by goals, rules, feedback systems, and voluntary participation
		- C
2) A child uses a collection of building blocks to construct towers and experiment with different structures. There is no specific goal, scoring system, or opponent. According to Chris Crawford's classification, this activity is best described as a: 
	- A. Puzzle  
	- B. Toy  
	- C. Challenge  
	- D. Game
		- B
3) Two players participate in a timed puzzle-solving contest. Each solves an identical puzzle independently, and neither can interfere with the other's progress. The player who finishes first wins. According to Crawford's classification, this is best described as:  
	- A. A puzzle  
	- B. A conflict  
	- C. A competition  
	- D. A game
		- C
4) A player enjoys customizing their character, designing a house, and creating outfits. They also enjoy exploring the game's world to discover hidden furniture and decorations. Which two of LeBlanc's kinds of fun are most directly represented?  
	- A. Expression and Discovery  
	- B. Fantasy and Challenge  
	- C. Fellowship and Submission  
	- D. Narrative and Sensation
		- A
5) Which of the following best demonstrates the difference between a basic action and a strategic action?  
	- A. Pressing a button to jump is a strategic action, while deciding when to jump is a basic action.  
	- B. Moving a chess piece is a basic action, while sacrificing a piece to gain a positional advantage is a strategic action.  
	- C. Basic actions are always simple, while strategic actions must involve multiple players.  
	- D. Basic actions are defined by the game's story, while strategic actions are defined by its technology.
		- B
6) A board game's rules state that players must roll a six-sided die and move that many spaces. A group decides that players must instead roll two dice and move according to their sum. Which statement best describes this change?
	- A. The group has changed a behavioral rule because players are expected to  follow the new procedure.  
	- B. The group has created a house rule that modifies the game's operational rules.  
	- C. The group has changed only the game's aesthetics because the objective remains the same.  
	- D. The group has created a foundational rule without affecting how the game is played.
		- B
7) A player discovers a legal strategy that makes it extremely difficult for opponents to respond. Although the strategy does not violate the game's formal rules, the community considers repeated use of it unfair. Which statement is most accurate?
	- A. The player is automatically cheating because the strategy is unfair.  
	- B. The player is a spoil-sport because they are attempting to win.  
	- C. The strategy may be degenerate, and its use may raise concerns about behavioral rules without necessarily being cheating.  
	- D. The strategy cannot be considered problematic because it is permitted by the formal rules.
		- C
8) In a strategy game, capturing territory provides additional resources. These resources allow players to build stronger armies, making it easier to capture more territory. Which statement best describes this system?  
	- A. It is a negative feedback loop because capturing territory changes the game's state.  
	- B. It is a positive feedback loop because an initial advantage can create further advantages.  
	- C. It is DDA because the game automatically changes difficulty.  
	- D. It is circular balance because players have multiple strategic options.
		- B
9) A racing game gives stronger items to players who are behind. However, a player who is far ahead continues to receive powerful items because of a programming error. Which statement best describes the intended system and the possible effect of the error?  
	- A. The intended system uses positive feedback, and the error creates negative feedback.  
	- B. The intended system uses negative feedback, while the error may reinforce the leading player's advantage.  
	- C. Both systems are examples of negative feedback because items are distributed randomly.  
	- D. Both systems are examples of DDA because the game changes item distribution.
		- B
10) A player rolls a fair six-sided die 120 times and records 26 rolls of a 6. Based on these results, which statement is most accurate?  
	- A. Rolling a 6 occurred approximately 5 percentage points less frequently than theoretically expected, suggesting the die may be biased.  
	- B. Rolling a 6 occurred approximately 5 percentage points more frequently than theoretically expected, but this does not change the probability of rolling a 6 on the next roll.  
	- C. Rolling a 6 occurred approximately 5 percentage points more frequently than theoretically expected, suggesting this pattern is likely to continue.  
	- D. Rolling a 6 occurred approximately 5 percentage points less frequently than theoretically expected, but the difference should disappear after enough additional rolls.
		- B
11) A fighting game has two characters. Character A is fast but deals low damage, while Character B is slow but deals high damage. Both are designed to have reasonable chances of winning. Which statement is most accurate?  
	- A. The game demonstrates symmetrical balance because both characters can win.  
	- B. The game demonstrates asymmetrical balance because different abilities can remain competitively viable.  
	- C. The game demonstrates circular balance because one character must always defeat the other.  
	- D. The game is necessarily unbalanced because the characters have different abilities.
		- B
12) Consider the following JavaScript code:  
```
	let score = 8;  
	let health = 20;  
	let gameOver = false;  
	if (score >= 10 || health <= 20) {  
		score += 5;  
	}  
	if (score >= 10 && health > 0) {  
		gameOver = true;  
	} 
```
What are the final values of score and gameOver?
-  A. score = 8, gameOver = false  
- B. score = 13, gameOver = false  	
- C. score = 13, gameOver = true  
- D. score = 8, gameOver = true
	- C
## Probability & Game Balance Calculations:
**Question 1: Basic Probability**  
A player rolls a fair six-sided die.  
- a. What is the probability of rolling a number greater than 4?  
	- 2/6 or ~33.33% probability.
- b. What is the probability of NOT rolling a number greater than 4?  
	- 4/6 or ~66.66% probability.
- c. Express both answers as fractions.
	- 2/6 chance of rolling a number greater than 4.
	- 4/6 chance of NOT rolling a number greater than 4.

**Question 2: Multiple Dice**  
A player rolls two fair six-sided dice.  
- a. How many possible ordered outcomes are there?  
	- 36 outcomes. Each of the 2 dice have 6 possible outcomes. $6^2 = 36$
- b. What is the probability of rolling a total of 7?  
	- Six possible combinations...
	  $(1,6),(6,1)$
	  $(2,5),(5,2)$
	  $(3,4),(4,3)$
	- $6/36 = 1/6 \approx .167$
	- There is a 16.7% probability of rolling a total of 7 with two dice.
- c. What is the probability of rolling a total of 12?  
	- One possible combination...
	  (6,6)
	- $1/36 \approx .028$
	- There is an approximate 2.8% probability of rolling a total of 12 with two dice.
- d. Explain why these probabilities differ.
	- The number of combinations that sum to 7 is greater than the number of combinations that sum to 12. This means that there are more chances to get a combination that sums to 7 than 12, which explains the difference in probabilities.

**Question 3: Practical Probability**  
A player rolls a six-sided die 80 times and rolls a 6 on 12 occasions.  
- a. What is the practical probability of rolling a 6?  
	- $12/80 = 0.15$
	- The practical probability of rolling a 6 is 15%.
- b. What is the theoretical probability?  
	- $1/6 \approx 0.167$
	- The theoretical probability is about 16.7%
- c. Explain why the two values might differ.
	- Theoretical probability is what should happen mathematically (1/6). Practical probability is what actually happened in the trials (12/80). They differ because of random variation, and 80 rolls is a small sample. With more rolls, the practical probability should get closer to the theoretical one

**Question 4: Expected Value**  
A treasure chest has the following possible rewards:

| Rewards  | Probability |
| -------- | ----------- |
| 2 coins  | 50%         |
| 5 coins  | 30%         |
| 10 coins | 20%         |
- a. Calculate the expected value of opening the chest.
	- $EV = 2 \times .5 + 5 \times .3 + 10 \times .2 = 4.5$
- b. Explain what the expected value represents.  
	- Essentially, if the player opens the chest repeatedly, they can expect to gain an average of 4.5 coins per chest.
- c. Does the expected value guarantee that the player will receive that number of coins from one chest? Explain.
	- No, the expected value is not something guaranteed, nor will they receive that number of coins from one chest. The expected value is more like an expected rate of value that they will receive as they continue to interact with chests repeatedly.

**Question 5: Risk, Reward & Triangularity**  
A player can choose between two attacks:  
- Safe Attack: Deals 6 damage with 100% probability.  
- Risky Attack: Deals 18 damage with 40% probability and 0 damage otherwise.  
	- a. Calculate the expected damage of each attack.  
		- Safe Attack: $EV = 6 \times 1 = 6$
		- Risky Attack: $EV = 18 \times .4 + 0 \times .6 = 7.2$
	- b. Which attack has the higher expected value?  
		- Risky Attack has the higher expected value.
	- c. Explain why a player might still choose the attack with the lower expected value.  
		- In this case, the lower expected value attack is the safe attack--it does less damage. If the game contains an enemy that has a maximum health of 6 points, the player could use that attack to guarantee the enemy's defeat.
	- d. How does this example relate to triangularity?
		- Triangularity is about the relationship between risk, reward, and certainty. In this scenario, the player can choose to play the safe attack with guaranteed certainty of reward/damage, or they can choose to play the risky attack with less certainty of more reward/damage.

**Question 6: Bayes' Theorem**  
A game has two types of treasure chests:  
- 40% of chests are rare.  
- 60% of chests are common.  
- A rare chest has an 80% chance of containing a gem.  
- A common chest has a 20% chance of containing a gem.  
A player opens a chest and finds a gem.  
- a. What is P(Rare)?  
	- $P(Rare) = .4$
- b. What is P(Gem|Rare)?
	- $P(Gem|Rare) = .8$
- c. Calculate the overall probability of finding a gem, P(Gem).
	-  $Pr(Gem) = Pr(Rare) \times Pr(Gem|Rare) + Pr(Common) \times Pr(Gem|Common) =$ 
	  $.4 \times .8 + .6 \times .2 = .32 + .12 = .44$
- d. Use Bayes' theorem to calculate P(Rare|Gem), the probability that the chest was rare given that it contained a gem.
	- About a 72.7% chance that the chest is rare give that it contained a gem.
$$\Pr(\text{Rare} \mid \text{Gem}) = \frac{\Pr(\text{Gem} \mid \text{Rare}) \times \Pr(\text{Rare})}{\Pr(\text{Gem})} = \frac{0.8 \times 0.4}{0.44} \approx 0.727$$
