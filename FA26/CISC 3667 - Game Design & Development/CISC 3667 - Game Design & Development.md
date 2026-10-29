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
	
	void Update() {
	
	}
	
}

```
