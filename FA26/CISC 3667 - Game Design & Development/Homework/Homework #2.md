# Q1:
A die is rolled, and a coin is tossed. Find the probability that **the die**
**shows an odd number and the coin shows a head.** (3 pts)
### Solution:
- $A = Pr(\text{Odd Roll}) = \frac{1}{2}$  
- $B = Pr(\text{Head Coin-Toss}) = \frac{1}{2}$
- $Pr(\text{Odd Roll And Head Coin-Toss}) = A \times B = \frac{1}{2} \times \frac{1}{2} = \frac{1}{4} = 25\%$

### Answer:
- There is 25% chance that the dice rolls odd and the coin lands, showing heads.

# Q2: 
Assume that you pick **two cards from a deck of cards** (without replacing the
first card before you pick the second). What is the probability that **both are**
**number cards** (i.e., numbers 2 -- 10, not J, Q, K, A)? (4 pts)

Facts:
- In a standard deck of cards, there are 13 ranks (values), each having 4 suits (variants), making a total of 52 cards. 
### Solution:
- Jack, Queen, King, and Ace are just four ranks, accounting for their suits--that's 16 cards.
- $52 - 16 = 36$ number cards
- $A = Pr(\text{Picking A Number Card}) = \frac{36}{52}$

- $36-1 = 35$ remaining number cards after picking a card.
- $52 - 1 = 51$ remaining total cards after picking a card.
- $B = Pr(\text{Picking Another Number Card}) = \frac{35}{51}$

- $Pr(\text{Both Picked Cards Are Number Cards}) = A \times B = \frac{36}{52} \times \frac{35}{51} = \frac{1260}{2652} \approx 48\%$

### Answer: 
- There is an approximately 48% chance of picking two number cards in a row

# Q3: 
In the game of Tetris, there are seven shapes (called tetrominoes) that descend
during the game. The choice of which tetromino to select next is random, but
there is more than one way to implement this randomness.

Here are two possible random selection algorithms:
- **Random A**: At every iteration, **select a tetromino at random from all**
**seven possibilities.**

- **Random B**: At the beginning of the game, make a “bag” of seven
tetrominoes, one of each shape. At every iteration, **choose a tetromino at**
**random from the bag. After the tetromino is used, it is discarded from**
**the bag. After seven iterations, create a new bag and proceed as**
**above.**
## a) 
Suppose you have just been given a certain tetromino. What is the
probability that the next piece will have the same shape, using the
Random A strategy? (4 pts)

### Answer:
- 1/7 or ~14.3% probability.

## b) 
Suppose you have just been given a certain tetromino. What is the
probability that the next piece will have the same shape, using the
Random B strategy? (4 pts

### Answer:
- 0% probability. That tetromino has been "removed from the bag" so it shouldn't come up until drawing from a new bag. If this recently used tetromino was the "last one in the bag" then there is as 1/7 or ~14.3% probability that the next tetromino is the same shape.

# Q4:
I'm working on a new tabletop RPG / strategy game / party game. It's pretty
promising, but I'm a little over my head on some of the math. So I'm glad I just
hired you on as a designer!

Okay, so think I have a new combat mechanic worked out, but I'm not
sure. I need to know the following probabilities to be sure. Can you tell
me the following? Make sure to show your work so I can explain it to our
publishers later. (I'll use this shorthand a lot, so just FYI: "2d6" means
rolling two six-sided dice at once. So "4d10" means four ten-sided dice,
and so on.)
## a) 
**Rolling 2d4**, what is the probability of **rolling at least one 4?** (3 pts)
### Solution:
- $Pr(\text{No 4 On One Die)} = \frac{3}{4}$
- $Pr(\text{No 4 On Either Die}) = \frac{3}{4} \times \frac{3}{4} = \frac{9}{16}$
- $Pr(\text{At Least One 4} = 1 - \frac{9}{16} = \frac{7}{16} \approx 44\%)$
### Answer:
- Probability of 44% for rolling at least one 4 on 2d4
## b)
Rolling **2d6**, what is the probability of **rolling at least one 6**? (3 pts)
### Solution:
- $Pr(\text{No 6 On One Die}) = \frac{5}{6}$
- $Pr(\text{No 6 On Either Die}) = \frac{5}{6} \times \frac{5}{6} = \frac{25}{36}$
- $Pr(\text{At Least One 6}) = 1 - \frac{25}{36} = \frac{11}{36} \approx 31\%)$

### Answer:
- Probability of 31% for rolling at least one 6 on 2d6
## c) 
Rolling **2d6**, what is the probability of **getting both 5s**? (3 pts)
### Solution:
- $Pr(\text{Rolling 5 On One Die}) = 1/6$
- $Pr(\text{Rolling 5 On Other Die}) = 1/6$
- $Pr(Rolling 5 On Both Die) = \frac{1}{6} \times \frac{1}{6} = \frac{1}{36} \approx 3\%$

### Answer:
- Probability of 3% for rolling two 5s on 2d6

# Q5:
I think we need to simplify our combat system.

I'm thinking it'll work like this:
- **First, the player rolls a d4**; if they **roll a 4**, they **roll a d6**. If they **roll a 6 on that, then they roll a d20.**
- If they **roll higher than 15 on that, then they win!**

I think all the rolling will be pretty exciting.

What percentage of the time will a player win? (6 pts)

### Solution:
- $A = Pr(\text{Roll 4 On d4}) = \frac{1}{4}$
- $B = Pr(\text{Roll 6 On d6}) = \frac{1}{6}$
- $C = Pr(\text{Rolling 4 On d4, Then Rolling 6 On d6}) = \frac{1}{4} \times \frac{1}{6} = \frac{1}{24}$
- $D = Pr(\text{Rolling > 15 On d20}) = \frac{1}{4}$
- $Pr(\text{Rolling 4 On d4, Then Rolling 6 On d6, Then Rolling > 15 On d20}) = \frac{1}{24} \times \frac{1}{4} = \frac{1}{96} \approx 1.04\%$

### Answer:
- Players will win about 1.04% of the time.
# Q6:
The working title of our game is "The Six Trials of the Hero".

Right now, the core mechanic is pretty simple: the player **rolls a D10 each turn,** **and they need to roll higher than the turn number to proceed.**

So they need to roll a **2 or more on turn 1, a 3 or more on turn 2, and so on.**

**If they get past all six trials, they win the game and become a hero.**

But is it too hard, though?

What percentage of the time will a player win? (6 pts)
### Solution:
- $Pr(\text{Rolling A d10} \geq 2 \text{ On Turn 1}) = \frac{9}{10}$ 
- $Pr(\text{Rolling A d10} \geq 3 \text{ On Turn 2}) = \frac{8}{10}$ 
- $Pr(\text{Rolling A d10} \geq 4 \text{ On Turn 3}) = \frac{7}{10}$ 
- $Pr(\text{Rolling A d10} \geq 5 \text{ On Turn 4}) = \frac{6}{10}$ 
- $Pr(\text{Rolling A d10} \geq 6 \text{ On Turn 5}) = \frac{5}{10}$ 
- $Pr(\text{Rolling A d10} \geq 7 \text{ On Turn 6}) = \frac{4}{10}$ 
- The player must pass every trial, so multiply: 
	- $Pr(\text{Passing All Six Trials}) = \frac{9}{10} \times \frac{8}{10} \times \frac{7}{10} \times \frac{6}{10} \times \frac{5}{10} \times \frac{4}{10} = \frac{60480}{1000000} = \frac{189}{3125} \approx 6.05\%$

### Answer:
- Players will win 6.05% of the time. This win-rate might make the game last too long--it's too hard.

# Q7:
Mary is playing an adventure game. She is wandering around her game world,
and she comes to a fork in the road.

The fork has 3 choices:
- The left fork leads to the cave of the evil ogre, next to which is a medium-sized bag of money.
- The middle fork leads to a small bag of money.
- The right fork leads to a large bag of money, which is guarded by an angry dragon.

Mary’s goal in the game is to collect as much money as she can, without getting
killed by the evil ogre or the angry dragon.

She knows that the evil ogre is lazy and sleeps 75% of the time (she can grab
the nearby money bag while he sleeps).

She also knows that the **angry dragon is full of energy and only sleeps 10%**
**of the time.**

Mary needs to decide what to do; i.e., which fork to take.

- The large bag of money is worth 10 points in the game
- The medium bag is worth 5 points
- The small bag is worth 1 point
- Getting killed is worth -10 points (and if Mary goes near the ogre or the dragon when they are awake, she will definitely be killed).

## a)
What is the expected value of going down the **left** path? (3.5 pts)
### Solution:
- $\text{Expected Value Of Left Path} = \text{Medium Bag Value} \times \text{Success Rate} = 5 \times 0.75 = 3.75$
- $\text{Expected Loss Value Of Left Path} = \text{Death Value} \times \text{Failure Rate} = -10 \times 0.25 = -2.5$
- $\text{Expected Net Value Of Left Path} = 3.75 -2.5 = 1.25$
### Answer:
- The expected value of going down the left path is 1.25.
## b)
What is the expected value of going down the **middle** path? (3.5 pts)
### Solution:
- $\text{Expected Value Of Middle Path} = \text{Small Bag Value} \times \text{Success Rate} = 1 \times 1 = 1$
- $\text{Expected Loss Value Of Middle Path} = \text{Death Value} \times \text{Failure Rate} = -10 \times 0 = 0$
- $\text{Expected Net Value Of Middle Path} = 1 - 0 = 1$
### Answer:
- The expected value of going down the middle path is 1.

## c)
What is the expected value of going down the **right** path? (3.5 pts)
### Solution:
- $\text{Expected Value Of Right Path} = \text{Large Bag Value} \times \text{Success Rate} = 10 \times 0.10 = 1$
- $\text{Expected Loss Value Of Right Path} = \text{Death Value} \times \text{Failure Rate} = -10 \times 0.90 = -9$
- $\text{Expected Net Value Of Right Path} = 1 - 9 = -8$

### Answer:
- The expected value of going down the right path is -8.

## d)
Which way should Mary go? (3.5 pts)
### Answer:
- Mary should take the left path, because it has the highest expected value. <sub><sub><sub><sub><sub>but gambling is more fun, so right path</sub></sub><sub></sub></sub></sub></sub>
