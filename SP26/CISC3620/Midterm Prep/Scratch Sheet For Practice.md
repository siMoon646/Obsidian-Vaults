38) 
	Ambient: Provides an even illumination of objects along their surfaces. This light cannot cast shadows.
	Point: Light is emitted from a central point in the scene. This light can cast shadows.
	Directional: Casts light in the direction of its target. All objects in the scene are illuminated by this light on the same face (face being something like a square's face facing north and the light is coming from the north). This light can cast shadows
	Spotlight: Casts a cone of light in the direction of its target. This light has an origin. Objects located in the opposite direction of the spotlight's target are not illuminated.
	Hemisphere light: simulates skylights

// 41
	A technique to create shadows. The scene is rendered from the perspective of a light, where the scene's depths are recorded into a shadow map data structure. The records of these depths are then used to decide which pixels will be modified for shadows.

// 45
	Hierarchical modeling is when objects are grouped together to make a complex object. This complex object is valuable, because it streamlines the process of applying transformations across the underlying objects that compose it.