# How are Godot scenes and nodes different from Unity scenes and GameObjects?
> In Unity, a GameObject is an empty container, while Nodes in Godot are typed objects that already do something (like sprite2D).

> In Godot, scenes can be placed inside other scenes, Unity cannot nest scenes, but achieves similar effect through "prefabs"
# How does your game detect when the player collects a coin?
> The Coin scene’s root is an `Area2D` with a `CollisionShape2D` child that defines its pickup region. The Player scene’s root is a `CharacterBody2D`, which also has a `CollisionShape2D`. When the player’s body overlaps the coin’s area, the `Area2D` emits its built-in `body_entered(body)` signal, which fires logic for coin collection.

# How does the time limit affect the player's gameplay experience?
> It puts a sense of urgency on coin collection. It also imposes a theoretical max score based on spawn rates and total game time.

# What is the difference between the current score and the persistent high score?
> The current score is a record of the score as it exists in an instant. The persistent high score is the historical greatest value that the player has achieved as a score as is saved in a file for future reference.

# Which part of working in Godot was most different from working in Unity?
> The concept of using signals was the most unique, I like that different signals mapped to different functions within the same script. I found it a pleasant abstraction that didn't take away too many implementation details; perfect for a game engine.