# Title: 
- **Apt Archers Association**
## What is it?
- A Skyrim Special Edition mod.
## Where to Access:
- Probably GitHub and some mod-site mirrors like Nexus Mods.
## Abstract: 
- When the player reaches level 30 in Archery, the courier NPC will seek out the player to hand them a note that invites them to the "Cyrodil's Greatest Archer Contest". The player doesn't have to immediately attend, they may delay their attendance however long they want.
## Sequence of Events:
- Player reaches level 30
- Courier NPC reaches out to player to invite them to Archery event
- The player reads "**An Arrow's Invitation**" letter item:
	- Dear \<playername>,
	  
	  it has come to attention, your mastery of the bow. so I am inviting you to the Apt Archer's Association to test your skills. I suggest you attend, as we are rewarding the finest archer with a specially made bow and hefty pool of septims for runner-ups. I hope this letter has piqued your interest.
	  
	  Should you decide to come, I will be at an Inn at solitude. May the divines bless you.
- The player is issued a quest marker to the quest NPC in Solitude.
- Player find the NPC and confirms will to attend with the NPC
- Player is relocated to a game cell where archery takes place.
- A player will be taken to an easy range, where they score points
- then a medium range, where they score points
- then a hard range, where they score points
- points are tallied at the end
- points sum is compared against arbitrary quantities of points attributed to other "competitors"
- decide if player wins
## Mechanics:
### Shooting Range:
- The shooting range will consist of three levels that subsequently increase in difficulty for landing projectile hits on targets.
#### Stage 1:
- The targets should be easy to hit, the points should be low, and the targets should be sizeable.
#### Stage 2:
- The targets are at a medium distance and consist of smaller objects that are harder to hit.
#### Stage 3:
- The targets are at a far distance and consist of tiny objects that are incredibly difficult to hit, but is the densest in points.
### Persisting Game Impact:
- The player receives a toggleable buff in the game that gives them a permanent 10% bow/arrow damage bonus.
## Outcomes:
- Player Wins:
	- They are rewarded with the custom bow
- Player Loses:
	- Depending on how player's score compares other scores, they may receive some quantity of ingame currency.
- Player attacks quest NPCs:
	- The quest fails. No reward.

## Likely Tooling of Mod:
- Papyrus:
	- Scripting language for Skyrim.
- Skyrim Creation Kit:
	- Basically the editor Bethesda used to build Skyrim’s content. Visuals in this mod are likely to be entirely derived from the base game, just reordered and custom placed to create a new scene.
- Comfy UI:
	- AI-generating voice-lines
	- Probably inserting my own voice as data, just to avoid more licensing and ethical concerns.
	- Might be doing music, but the creation kit already has the base game's music in it.
- Claude:
	- Learning assistant
- GPT-OSS via Odysseus:
	- Coding Assistant