# Reflection: 

## Which game option did you choose? What is the player's goal?
- I chose game option B--Dodge and Survive. The goal is to reach a yellow box without colliding or coming in contact with enemies. 

## What objects and state values does your game track?
- The game objects and states that my game tracks are players, enemies, and time. Players and enemies have their positions and directions tracked, while time simply progresses in accordance with real-time. 

## How does your game detect contact or collisions?
My game checks for collisions by finding the minimum gap, before objects are considered "touching".  See below:

```
const player = {
  ...
  size: 24,
  ...
};

const enemy = {
  e1: {
    ...
    size: 50,
    ...
  },
  ...
};
```

- I thought about it as if both entities were already touching--I want the minimum gap:
	- Pe1
- Then I give one of them--`e1`, their size $/2$. `e1` is now buffered by $25$ units on both sides.
	- P|...25...e1...25...|
- Then I give the other--`P`, their size $/2$. `P` is now buffered by $12$ units on both sides.
	- |...12...P...12...||...25...e1...25|
- $12 + 25 = 37$. So when two objects are $37$ units apart, those respective objects have made contact. I have a generalized formula for calculating this in the game's implemented `script.js` that's used in a function for checking collisions specifically with the player.

## What did you change after testing?
- What I changed after testing was `enemy.e2.speed` $99 \rightarrow 95$. Just so players have a better chance of winning.

## Did you use an AI tool? If so, identify it and explain how you used it.
- I used Claude Code. For the most part, bug-fixing, explaining code, refactoring. Once for implementation--having enemies track the center of the player and not the top-left corner of the player. [More details](./AI_USAGE.md).
