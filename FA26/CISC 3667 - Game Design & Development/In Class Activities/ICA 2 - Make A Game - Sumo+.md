# Group Members:
- Simon Tang
- Isaiah Marte
- Jonathan Davydev 

# Video Game:
## Mechanics:
- Move + Push
## Objects:
- Player
- Platforms
- Resources

## Goal:
- Push the opposing player out of bounds. 

## Core Mechanics:
- Dodging opponent's pushes
	- The player can press a hotkey to sidestep a push.
	- Has 1 second cooldown.
- Push opponent off out of bounds.
	- The player can press a hotkey to attempt to push the opponent.
- Resources can be used as a "second-life" if the holder is pushed out of bounds.
	- Automatically consumed.
	- Resources spawn every 10-15 seconds.

## How They Work Together:
- Player can try to push opponents. Opponents can respond by dodging the push. Resources can be used to give players a second chance.

# Rules:
- Players begin on opposite sides of a platform.
- The platform shrinks if the players grab resources.
- Players can attempt to push each other off the platform.
- The game ends when a player is pushed off the platform, and they have no items to recover.


# Role Of Objects In Game:
1) Player: 
	- There are multiple
	- The players are to push each other off the platform until only one remains.
2) Platform:
	- The space in which the game is played.
3) Resource:
	- A buff-item that grants players an advantage in surviving on the platform or attacking other players.
	- Types:
		- Second-life item.
		- Knockback item.
		- Throwable AOE nausea item - can backfire.

# Interactions:
- Grabbing a resource -> Platform shrinks
- Grabbing a "knockback item" -> obtainer does more knockback for 15 seconds.
- Hitting an player with "nausea item" -> Player's interface distorts (makes it hard to aim and push other players) for 15 seconds.
- Grabbing "second-life" item -> Player returns to platform when pushed off. The "second-life" item is consumed when used.
- Player uses the dodge mechanic -> their dodge goes on 1 second cool down
- Player gets pushed -> they are knocked towards the edge of the platform.

# Attributes:
Player:
- Status effect(s). (can be a knock back buff, duration of nausea if they're afflicted, or if an attribute of them having a second life)
- Alive - Tracks if the player has been eliminated from the game.
Platforms:
- Shape
- Length
Resource:
- Spawn frequency: number
- Type: string (could be knock back item, nausea AOE item, second life item)

# States: (The value of an attribute)
Platform:
- Length attribute can update to a smaller number (platform shrinks) when the player picks up a resource.
Player: 
- "Alive" attribute can update to false when the player is pushed off the platform and they do not have a "second-life" item.

# Abstract Sketch Of Game:

![[Pasted image 20260910191238.png]]

For ease of viewing:
https://excalidraw.com/#json=m3jyixhOVVA6kL5nkQKBO,Tb8cI4cXwkC8KljywxyJfA


# Mental Simulation Of Game:
Suppose that three players initiate a game. Their playable characters will spawn at the edges of a platform that they choose from a pre-game UI--let's say that their platform is a circle. The players spawn equidistant from each other, at the edges of the circular platform. No resources have spawned yet, so their goal is simple--find safety, or eliminate other players.

after 10 seconds of game-time, a resource spawns, but it's close to the edge. Player 1 approaches the resource, so does Player 2. They fight for it. Player 3 sits at the center of the platform. Player 2 reaches the resource first and randomly obtains the second-life item. Player 2 tries to push the recently aggressive player 1 off the platform, but player 1 uses a well-timed dodge to avoid the push and put some distance between them. During that interaction, player 3 had moved to third-party player 1, and pushes player 1 off the edge of the platform, eliminating them.

15 seconds have passed, another resource has spawned, it's at the center of the platform. Both players 2 and 3 are near the edge, with 3 being closer to the edge of the platform after having eliminated player 1. As both players approach the resource, player 3 pushes player 2 away from the resource, and obtains the resource for themselves, an AOE nausea item. They use the AOE nausea item on player 2. Player two now has poor visual clarity of the game. Player 3 continues to pressure player 2 until they're pushed off the edge of the platform. Player 2's second life item is consumed and they respawn at the center of the platform.

Another 13 seconds had passed, another resource has spawned, but player 2 ignores it in favor trying to push player 3 off the platform...