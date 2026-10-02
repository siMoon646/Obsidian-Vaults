# CISC 3667: Game Design and Development

## Final Project: Check-In #1

- **Assigned:** Thursday, October 1
- **Due:** Tuesday, October 6, 2026, before class (11:00 AM)
- **Submission:** Individual Submission to Brightspace

## Purpose

This check-in is an opportunity to turn your early game idea into a more specific plan before we begin learning digital development. Your idea can still change as you learn new tools and test your design.

You are not expected to have built or programmed a prototype yet. You do not need to choose a development tool for this check-in.

## What to Submit

Write a brief response to each section below. You may include a sketch or diagram if it helps explain your idea.

### 1. Game Concept

Describe the game you are considering. Include:

- Its genre, theme, or setting
- The experience you want players to have
- The player's main goal

If you are deciding between ideas, focus on the one you are most likely to develop and briefly mention your alternative.

### Answer:

My game is called **Scrab**. It is a 2D sandbox with survival-crafting and automation elements, drawn in pixel art with sprites. Its main inspirations are Terraria (2D sandbox survival), Factorio and Satisfactory (simple factory logic that scales), and Subnautica (a plot the player uncovers by exploring).

- **Setting:** The player crash-lands on a ruined alien planet with amnesia. The only working tool in their lifepod is a scanner, which is how they learn about the world. The land is covered in a blue gas that is toxic to the player.
- **Experience:** I want players to feel vulnerable at first, then gradually feel clever and in control as they build structures and machines that solve their survival problems for them.
- **Main goal:** Survive on the planet and find a way to counteract the blue gas, using the scanner to learn what the world's resources and ruins are for.

I am not deciding between ideas at this point; Scrab is the one I plan to develop. However, not all of these features are going to be implemented. These ideas are more of like an abstract for full-release.

### 2. Core Mechanic and Gameplay Loop

What will the player repeatedly do in your game? Describe a typical cycle of play:

1. What action does the player take?
2. How does the game respond or change?
3. What feedback does the player receive?
4. What encourages the player to continue playing?

Identify at least one meaningful decision or challenge within this loop.
### Answer:

The player repeatedly leaves a safe area, gathers resources, and comes back to build something that makes the next trip easier.

1. **Action:** The player runs, jumps, and dodges. They can venture into the gas to harvest resources and scan unknown objects, fighting or avoiding enemies along the way.
2. **Game response:** Harvested blocks and items go into the inventory, scanned objects reveal information and new things to build, and the player's gas exposure and stamina change as they move and stay outside.
3. **Feedback:** Stamina and gas-exposure meters, items appearing in the inventory, scanner readouts, and visible changes to the world as blocks are removed or placed.
4. **Reason to continue:** Every trip pays for a build (shelter, tools, or a machine) that lets the player go farther, stay out longer, or stop doing a chore by hand.

**Meaningful decision:** The player can only be in the blue gas for a limited time, so every trip is a judgment call about how far to push before turning back. A second decision is what to spend resources on: something that helps right now (a weapon, food) or an automated machine that pays off later.

### 3. Game Elements and Rules

Identify the main objects or entities in your game and briefly explain their roles. Then describe:

- At least one attribute or state that changes during play
- At least two rules or constraints
- How the player will know whether they are making progress
- How the game could end

### Answer:

**Main objects and entities:**

- **Player:** Moves, harvests, builds, and fights.
- **Lifepod:** The starting point and first safe area.
- **Scanner:** The player's way of learning about the world and unlocking new things to build.
- **Blue gas:** The main environmental hazard; it covers the land and limits how long the player can be outside.
- **Resources and blocks:** Harvested from the world and placed to build, Terraria-style.
- **Machines:** Modular objects with simple logic that the player combines to automate survival tasks.
- **Enemies:** A few basic opposing agents that threaten the player while exploring.
- **Food and water:** Consumables the player needs to keep themselves alive.

**Attributes and states that change:** Stamina, gas exposure, health, hunger and thirst, and the contents of the inventory. The world itself also changes as blocks are harvested and placed.

**Rules and constraints:**

1. The player can only stay in the blue gas for a limited amount of time before it harms them.
2. Sprinting, jumping, and dodge rolling consume stamina; crouching does not. With no stamina, those actions are unavailable.
3. Something must be harvested before it can be built with or eaten.

**Progress:** The player knows they are progressing when they can stay in the gas longer, their scanner has more entries, their base grows, and machines are doing work they used to do by hand.

**How the game could end:** The player loses if their health runs out from gas, enemies, or going without food and water. The game is won when the player builds whatever counteracts the blue gas, making the area around their base safe.

### 4. Scope and Development Plan

Describe the smallest playable version of your idea that you could realistically create this semester. Identify:

- The features that are essential to make the game playable
- One or two features you could add later if time permits
- One feature you would cut if the project becomes too large

### Answer:

The smallest playable version is a single small map with the lifepod at the center and the blue gas everywhere else. The player harvests, builds, and works toward one gas-counteracting item that allows them to stay in the gas longer.

**Essential features:**

- Platformer movement with stamina (walk, sprint, jump, crouch)
- Harvesting and placing blocks
- The blue gas with an exposure timer
- A basic inventory and a short list of things to craft
- One enemy type and maybe two weapons (sword and gun)
- One simple machine that automates harvesting, so the automation idea is represented
- One craftable item that counteracts the gas, which acts as the win condition

**Add later if time permits:**

- More machines that connect to each other so players can build small factories
- A second weapon type (bow or spear) and parrying

**Cut if the project becomes too large:** Food and water. The blue gas already gives the player a survival pressure, so hunger and thirst can be removed without changing what the game is about.

### 5. Questions and Next Steps

What part of your design are you least certain about? What would you want to test first once we begin building games?

List two specific next steps you plan to take during the upcoming digital development workshops. Include any question you would like feedback on.

### Answer:

**Least certain:** The automation. I am not sure how simple the machine logic needs to be for it to be buildable this semester while still letting players come up with creative solutions. I am also unsure how much combat the game needs, since I have a long list of weapon ideas and only want a few.

**First thing to test:** Whether the core trip feels good: moving with stamina, going out into the gas, and making it back in time.

**Next steps:**

1. Build a player controller with walking, sprinting, jumping, and a stamina meter, and add a gas-exposure timer to a simple test level.
2. Prototype harvesting and placing blocks on a tile grid, then try one machine that harvests automatically.

**Question for feedback:** Is sandbox building plus one automated machine a realistic scope for one semester, or should I pick either the sandbox side or the automation side to focus on? I am currently planning to use Unity, with Aseprite for the art and LMMS for audio.

## Submission

Submit your own completed check-in to Brightspace by 11:00 AM on Tuesday, October 6. This is an individual final project, so your response should describe your own game concept and plans.

Your design does not need to be final. The goal is to establish a clear, manageable starting point that you can develop and revise throughout the semester.
