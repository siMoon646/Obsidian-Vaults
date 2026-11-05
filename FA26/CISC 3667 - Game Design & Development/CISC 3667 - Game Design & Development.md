# Meeting 3: What Is A Game?
- Fun, subjective. What is a game to some might not be a game to others.
## Eight Funs (LeBlanc):
### Sensation:
- Games that engages the senses -- audio-visual. Sensory pleasure.
### Fantasy:
- Suspends disbelief -- fun comes from the imagination.
### Narrative:
- Story-based games.
### Challenge:
- Challenge is fun -- something to overcome/solve.
### Fellowship:
- Less about the game itself -- more about the community that surrounds the game.
### Discovery:
- Exploration -- fun comes from mystery.
### Expression:
- Comes from personalization of a game -- the player can integrate themselves into the game
### Submission:
- Playing the game mindlessly.
## Four Keys To Fun (Lazzaro):
### Hard Fun:
- Pleasure of achieving something.
### Easy Fun:
- No competition, game is paced to match the player.
### Serious Fun:
- Meaningful experiences and emotional engagement, fun with a purpose.
### People Fun:
- Fellowship of fun. The fun of collaboration and interaction.

## Four Player Types (Bartle's):
### Achievers:
- Players that play for the sake of achievements.
- Primary pleasure is challenge
### Explorers:
- Primary fun of discovery/puzzles
### Socializers:
- Primary fun of community
### Killers:
- Primary fun is competition -- against other players.
# <hr>
# Meeting 4: 
## Game-Spaces: 
- The environment in which a game is played:
### Example(s):
- Tic-tac-toe is played within a 3x3 grid.
### Zero-Space Games:
- Some games are played only with information.
#### Example(s):
- Some games like twenty questions are played without an environment, and are more mental models
## Discrete & Continuous Time:
- Controls how the game is played, the scheduler for game events.
### Clocks & Races
- Clocks set time limits on elements of games.
- Races set time records for events of games.
## Objects, Attributes, States:
- Objects: Anything that can be modified in a game.
- Attributes: Properties of objects in a game.
- States: The shape of data in an attribute.
## Modes:
- Some games have subset rules for a nested version of the game with special rules.
## Chance:
- An element of games that introduces unpredictability to a game.
# <hr>
# Meeting 6: 
## Randomness and Probability:
**The total number of outcomes for rolling a 6-sided die 4 times**
$6^4 = 1296$  total sequences
$5^4 = 625$ total sequences that exclude 1 
$1296 - 625 = 671$ total sequences that include 1

$P(\text{ sequence contains } 1) = 671/1296 \approx 0.5 \text{ or } 50\%$ 

## Expected Value: 
- How much value an action./entity has in a game.
### Conjunction Fallacy:
	$Pr(A \wedge B) \leq Pr(A)$
	Recall that $A$ is present in both. If a conjunction is made with $A$ the probability of just $A$ is always higher.
### Law of Small Numbers:
- Mistaken belief that small samples will reflect the properties of the larger population from which they are drawn.
### Representative Heuristic:
- Mental shortcut that people use to judge the probability of an event based on how similar it is to a prototype or stereotype.
### Baye's Theorem:
- Mathematical formula that describes how to update the probability based on new evidence:
	$Pr(A|B) = [Pr(B|A \times Pr(A)]/Pr(B)$
### Skill and Chance:
#### Estimating Chance As A Skill:
- In many games, what separates the skilled players from the unskilled is their ability to predict what is going to happen next, often through calculating probabilities.
#### Skills Have Probability Of Success:
- Naively, one might think that completely skill-based games, such as chess or baseball, have no aspects of randomness or risk in them.
#### Estimating An Opponent's Skill Is A Skill:
- Players estimating an opponent's success.
#### Predicting Pure Chance Is An Imagined Skill:
- Humans look for patterns, consciously and subconsciously, to help predict what is going to happen next. Our mania for patterns often leads us to look for an find patterns where none exist.
#### Controlling Pure Chance Is An Imagined Skill:
- Not only do our brains actively seek patterns, but they also actively and desperately seek cause-and-effect relationships.
# <hr>

# Meeting 9?
- **Textual Scripting**
	- Coding textually; conventional.
- **Node Scripting**
	- Coding with node/blocks; abstract.
## Introduction To Unity
- Unity is a cross-platform game engine used to make 2d and 3d games and interactive applications.

### Components:
**Scenes**:
- Represents a part of a game. Contains the GameObjects that make up a level, menu, or other game environment.
**GameObjects**:
- Fundamental object in a Unity scene. Players, enemies, collectibles, etc.
**Components**:
- Data or functionality to a GameObject can contain multiple components that work together to produce its behavior.
- **Types**:

| Component       | Purpose                                                       |
| --------------- | ------------------------------------------------------------- |
| Transform       | Stores the object's position, rotation, and scale             |
| Sprite Renderer | Display a 2d image represeting the object.                    |
| RigidBody2D     | Allows the object to participate in Unity's 2D physics system |
| Collider2D      | Defines a shape used for collision detection or triggers      |
| PlayerMovement  | A custom C# scrip that control player movement                |

**Sprites**:
- Two-dimensional graphic used to represent an object.
**Prefab**:
- Reusable game object; template; stores an object's components and configuration.
- Allows devs to create multiple instances without rebuilding the object each time.

### Unity Script Lifecycle:
- Unity automatically calls certain methods on active monobehavior components at particular points during execution

## C\# Programming
- Similar syntax to TypeScript.
- ***C-family language***

# Meeting 10: Unity

Follow instructions on doc + 16:10 aspect ratio for game.
`PlayerMovement.cs`:
``` CS
using UnityEngine;
using UnityEngine.InputSystem;

public class PlayerMovement : MonoBehavior {
	[SerializeField] private float speed = 5f;

	[SerializeField] private float leftBoundary = -5f;
	[SerializeField] private float rightBoundary = 5f;
	// update is called once per frame:
	void Update(){
		// avoid error if no keyboard available
		if(Keyboard.current == null) return;
		float direction = 0f; // no movement
		
		if(Keyboard.current.aKey.isPressed || Keyboard.current.leftArrowKey.ispressed) {
		direction = -1f;
		}
		if(Keyboard.current.dKey.isPressed || Keyboard.current.rightArrowKey.ispressed) {
		direction = 1f;
		}
		
		// start with the player's current position
		Vector3 position = transform.position;
		
		// move horizontally (w/ deltaTime for hardware-variation movement consistency)
		position.x += direction * speed * Time.deltaTime;
		
		// keep player between boundaries (left and right)
		position.x = Math.Clamp(position.x, leftBoundary, rightBoundary);
		
		transform.position = position;
	}
}
```

`BalloonMovement.cs`
``` CS
using UnityEngine;

public class BalloonMovement : MonoBehavior {

	[SerializeField] private float speed = 7f;
	[SerializeField] private float leftBoundary = -9f;
	[SerializeField] private float rightBoundary = 9f;
	
	// hardcoded so that balloons start with moving to the right
	private bool movingRight = true;
	

	void update() {
		// convert boolean state into a direction
		float direction = movingRight ? 1f : -1f;
		
		// current position:
		Vector3 position = transform.position;
		
		position.x = direction * speed * Time.deltaTime;
		
		if(position.x >= rightBoundary) {
			position.x = rightBoundary;
			movingRight = false;
		} else if (position.x <= leftBoundary) {
			position.x = leftBoundary;
			movingRight = true;
		}
	}
}
```

## Prefab Asset:
- different from regular game objects in that we can re-use it in various scenes -> basically a premade game object(?).

Customize Pin gameobject to have tag "Pin" and give it 2DRigidbody + box collider 2d w/ is trigger
`PinMovement.cs`:
``` cs
using UnityEngine;

public class PinMovement : MonoBehavior {
	[SerializeField] private float speed = 8f;
	// boundary for which to destroy the pin:
	[SeriealizeField] private float destroyY = 6f;
	
	void update() {
		transform.position += Vector3.up * speed * Time.deltaTime;
	}
	
	// check if the pin has reached destroy boundary
	if(transform.position.y > destroyY) {
		Destroy(gameObject); // game object = game object this file is attached to.
	}
}
```
Add above script to the Pin prefab.

`PlayerShoot.cs`:
``` cs
using UnityEngine;

public clsas PlayerShoot : MonoBehavior{
	
	// need to know what gameobject to spawn as projectile
	[SerializeField] private GameObject pinPrefab;
	// need to know where the spawn the pin from
	[SerializeField] private Vector3 launchOffset = new Vector(0f, 0.6f, 0f);
	
	void update(){
	
		if (keyboard.current == null) {
			return;
		}
		// if space is pressed first
		if(Keyboard.current.spaceKey.wasPressedThisFrame){
			// avoid trying to create an object if no prefab is available
			if(pinPrefab != null){
				Instantiate(
					pinPrefab, 
					transform.position + launchOffset, 
					Quaternion.identity
				);
			}
		} else {
			Debug.Logwarning("Assign Pin prefab in Inspector panel.");
		}
	}
}
```
Attach the above script to player GameObject + attach the pin prefab to the component in the player game object. Enable Is Trigger

Attach Circle Collider 2d Component to the balloon GameObject + adjust component.

`BalloonHit.cs`:
``` cs
using System.Collections; // idk
using Unity Engine; // Unity library
using UnityEngine.SceneManagement; // Unity library for helping keep track of score

public class BalloonHit : MonoBehavior {
	// score manager
	[SeralizeField] private ScoreManager scoreManager;
	
	// audio source for balloon popping
	[SerializeField] private AudioSource popAudio;
	
	// how long the baloon stays hidden after being hit
	[SerializeField] private float respawnDelay = 0.25f;
	
	// stop multiple pins from scoring during one pop
	private bool alreadyPopped;
	
	private Collider2D balloonCollider;
	
	private SpriteRenderer balloonRenderer;
	
	void Awake(){
		balloonCollider = GetComponent<Collider2D>();
		balloonRenderer = GetComponent<SpriteRenderer>();	
	}
	
	void OnTriggerEnter2D(Collider2D other){
		// ignore collisions that are not with the pin
		if(!other.CompareTag("Pin" || alreadyPopped) {
			return;
		}
		// by this line, the hit should award a point
		if(scoreManager != null){ // make sure that the score manager exists first
			scoreManager.AddPoint();
		}
		if(popAudio != null){
			popAudio.Play();
		}
		// destroy the pin if it collided with the balloon
		Destroy(other.GameObject);
		
		// hide balloon, wait, restore
		StartCoroutine(PopAndRespawn()); 
	}
	
	IEnumerator PopAndRespawn(){
		// turn off collider (prevent duplicate hits)
		if (balloonCollider != null){
			balloonCollider.enabled = false;
		}
		
		if(balloonRenderer != null){
			balloonRenderer.enabled = false;
		}
		
		yield return new WaitForSecond(respawnDelay);
	
		// restore sprite and collision for next shot
		if (balloonRenderer != null) {
			balloonRenderer.enabled = true;
		}
		
		if (balloonCollider != null) {
			balloonRenderer.enabled = true;
		}
		alreadyPopped = false;
	}
}
```

Add a canvas game object, nest a text field in it

Make an empty object

`ScoreManager.cs`:
``` cs
using TMPro;
using UnityEngine;

public class ScoreManager : MonoBehavior {

	[SerializeField] private TEMP_Text ScoreText;
	
	// score for current play session
	private int score = 0;
	
	void Start() {
		UpdateScoreDisplay();	
	}
	
	public void AddPoint(){
		score++;
		UpdateScoreDisplay();
	}
	
	public void ResetScore(){
		score = 0;
		updateScoreDisplay();
	}
	
	void updateScoreDisplay(){
		if(scoreText != null){
			scoreText.text = "Score : " + score;
		}
	}
}

```

# Meeting 11: Godot
**Unity -> Godot Translation**:

| Unity                 | Godot                             |
| --------------------- | --------------------------------- |
| GameObjects           | Nodes                             |
| Hierarchy             | Scene Tree                        |
| Scenes and Prefabs    | Scenes (includes reusable scenes) |
| C#                    | GDScript or C#                    |
| Input System          | Input Map and Input Actions       |
| Colliders and Physics | Collision Nodes and Physics       |
| Events                | Signals                           |
| Canvas and UI         | Control Nodes                     |
| Scene Manager         | SceneTree methods                 |
## Nodes and Scenes:
- Godot uses these to organize a game.
- **Node**
	- Individual building block that provides a specific function of behavior. Different node types are designed for different purposes.
- **Scene**

## What is GDScript:
- Syntactically similar to python.
- A lot of type-annotation -> types follow the identifier.

# Meeting 12: GoDot Lab:
- UI is practically the same as Unity
- **Assets folder**:
	- Spritesheet for player object movement 
	- standalone sprite (coin)
	- background asset
	- title page img
- **Script Folder:**
	- game logic
- **Godot Objects:**
	- AnimatedSprite2D 
		- how to animate a sprite
		- can be nested in player object to represent player animations
	- CollisionShape2D
		- how to detect object collisions
	- Player 
		- represents the player.

`PlayerMovement.gd
``` gd
extends CharacterBody2D #root node of Player

#modify in inspector: this is the same as [SerializeField]
@export var speed: float = 250.0

#same as awake() function
#`$` grabs child node with matching name of attached game node.
@onready var animated_sprite: AnimatedSprite2D = $AnimatedSprite2D

func _physics_process(delta: float) -> void:
	var direction := Input.getVector("ui_left", "ui_right", "ui_up", "ui_down", "idle")
	
#ser movement speed
velocity = direction * speed
move_and_slide()

#play animation on directional movement
if direction == Vector2.ZERO:
	animated_sprite.player("idle")
elif abs(direction.x) > abs(direction.y):
	if direction.x > 0:
		animated_sprite.play("walk_right")
	else:
		aniamted_sprite.play("walk_left")
elif direction.y > 0:
	animated_sprite.play("walk_up")
else:
	animated_sprite.play("walk_down")
```

`Coin.gd`
```
extends Area2D

var collected: bool = fals 

func _ready() -> void:
	$LifetimeTimer.start()
	
func _on_body_entered(body: Node2D) -> void:
	if collected:
		return
	
	if body.is_in_group("player"):
		collected = true
		GameManager.collection_coin()
		queue.free()
		
func _on_lifetime_timer_timeout() -> void:
	if not collected:
		queue.free()
```

`GameManager.gd`
``` gd
extends Node

signal score_changed(new_score: int)
signal round_completed

var score: int = 0
var final_score: int = 0
var high_score: int = 0

var round_finished: bool = false

const SAVE_PATH = "user:://save_data.json"

func _ready() -> void:
	load_high_score()
	
func start_round() -> void:
	score = 0
	final_score = 0
	round_finished = false
	
	score_changed.emit(score)

func collect_coin() -> void:
	#prevent score from increasing if program has ended
	if round_finished:
		return
	
	score += 1
	score_changed.emit(score)
	
func finish_round() -> void:
	if round_finihsed:
		return
	
	round_finished = true
	final_score = score
	
	if final_score > high_score:
		high_score = final_score
		save_high_score()
	
	round_completed.emit()
	
func save_high_score() -> void:
	var file = FileAccess.open(SAVE_PATH, FileAccess.WRITE)
	
	if not file:
		push_error("Could not open the save file.")
		return
	
	var data = {"high_score": high_score}
	file.store.string("JSON.stringify(data))

func load_high_score() -> void:
	high_score = 0
	
	if not FileAccess.file_exists(SAVE_PATH):
		return
		
	var vile = FileAccess.open(SAVE_PATH, FileAccess.READ)
	
	if not file: 
		return
		
	var data = JSON.parse_string(file.get_as_text())
	
	if data is Dictionary:
		var saved_score = data.get("high_score", 0)
		
		if saved_score is int and saved_score >= 0:
			high_score = saved_score
```

Make GameManager.go the first script to start for the game.

`Game.gd`
```
extends Node2D

#preload coin scene so new intances can be created during gameplay.
const COIN_SCENE = preloada("res://scenes/Coin.tscn")

@onready var score_label: Label = $ScoreLabel
@onready var time_label: Label = $TimeLabel
@onready var spawn_points: Node2D = $SpawnPoints
@onready var spawn_time: Timer = $SpawnTimer
@onready var round_timer: Timer = $RoundTimer

func _ready -> void:
	GameManager.score_changed.connect(_on_score_changed)
	GameManager.round_completed.connect(_on_round_completed)
	
	GameManager.start_round()
	
	#update score and timer displays
	_on_score_changed(GameManager.score)
	_update_time_label()
	
func _process(delta: float) -> void:
	_update_time_label()
	
func _update_time_lavel() -> void:
	time_label.text = "Time: " + str(ceili(round_timer.time_left))
	
	_spawn_coin()
	spawn_timer.start()
	round_timer.start()
	
func _spawn_coin() -> void:
	if GameManager.round_finished:
		return
		
	var points = spawn_points.get_children()
	
	if points.is_empty():
		push_warning("add Marker2D nodes under SpawnPoints.)
	
	var coin = COIN_SCENE.instantiate()
	add_child(coin)
	
	var chosen_point = points.pick_random()
	
	coin.global_position = chosen_point.global_position

# a coin has despawned, this is the time it takes until the next one spawns
func _on_spawn_timer_timeout() -> void:
	_spawn_coin()
	
func _on_round_timer_timeout() -> void:
	GameManager.finish_round()
	
func _on_score_changed(new_score: int) -> void
	score_label.text = "Score: " + str(new_score)
	
func _on_round_completed() -> void:
	spawn_timer.stop()
	round_timer.stop()
	
	get_tree().change_scene_to_file("res://Scenes/GameOver.tscn")	
```

`MainMenu.gd`
```
extends Control

func _on_start_button_pressed() -> void:
	get_tree().change-scene_to_file("res://Scenes/Game.tscn")
	
func _on_instructions_button_pressed() -> void:
	get_tree(),change_scene_to_file()
```