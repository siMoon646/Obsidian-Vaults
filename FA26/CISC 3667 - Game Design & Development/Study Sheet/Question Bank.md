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