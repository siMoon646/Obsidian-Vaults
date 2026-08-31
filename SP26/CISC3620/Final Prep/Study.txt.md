1) What does the Law of Reflection state about the angles of incidence and reflection?
	- When measured from the normal (perpendicular to the surface at the point of contact), they are equal.

2) How is the angle of incidence related to the angle of reflection in a mirror?
	- The angle of incidence is equal to the angle of reflection when measured perpendicular to the point of contact

3) Why is reflection considered view-dependent?
	- View-dependent, because what you see depends on where you are viewing from. People see, because light rays are reflected from a surface at a specific angle into your retinas.

4) What is a convex polygon?
	- Polygon with "no indentations"

5) Explain the difference between reflection and refraction.
	- Reflection: Light bounces off of a surface at equal angles
	- Refraction: Light travels through a surface, and may come out at an angle (depending on coefficient of refraction). E.g: Light travels through space, but when it hits the Earth's atmosphere, the angle of the light's direction will change.

6) Why are vanishing points important in perspective projection?
	- Creates the illusion of depth and distance in a 2D projection. They make things look 3D. 
	- They are called vanishing points -> simulates how objects appear to shrink in the distance before they "vanish"

7) Why is the coefficient of restitution important in collision simulations?
	- Determines the parting velocity of two objects after collision with each other.

8) What are the two types of Oblique projections? How do they differ from one another?
	- Cavalier Projection:
		- Projecting lines emerge parallel from object surface and incident at $45^o$ rather than $90^o$ at projecting plane. 
	- Cabinet Projection:
		- Differs from cavalier projection in that incident angle at projecting plane is $63.4^o$ rather than $45^o$

9) What are the two standard categories of global lighting algorithms?
	- Radiosity: 
		- Any surface that is not completely black is treated as a light source if it glows.
	- Ray-tracing
		- Color and brightness of an object are determined by how light interacts with object's material.

10) Explain Ray tracing and its two distinct concepts.
	- Ray-tracing causes objects to vary in appearance depending on how light interacts with the material of those objects. A simulation of how light rays interact with environment before reaching our eyes.
	- Two distinct concepts:
		- Forward ray-tracing / light-tracing:
			- Follows the light particles from the light source to the object -> results in wasted calculations for rays that do not contribute to the final image.
		- Backward ray-tracing / eye tracing:
			- Follows light particles from the viewing line to the object -> eye ray to object, from object to light source to compute reflections and relative shadows.

11) Explain the role of a graphics processing unit (GPU).
	- Specializes in making large quantities of simple and identical calculations in parallel. Important for graphics computing, because the speed + efficiency of execution makes graphics processing fast.

12) What is the purpose of a frame buffer in computer graphics?
    - Stores what is basically the rasterized frame before displaying to user.

13) Define raster graphics and provide an example of its use.
	- Raster graphics are pixel graphics, the position and color of each pixel is computed. Raster graphics are used for "literal capture", like capturing an image, or scanning a paper.

14) What are vector graphics, and how do they differ from raster graphics?
	- Vector graphics are "relative graphics". Vector graphics are composed of geometric data. To get an image from vector graphics they have to be rasterized. They can be used for scalable imaging to retain a sharp image. 

15) What is the difference between the vertex shader and the fragment shader?
	- The vertex shader transforms mesh geometry vertices. These vertices are placed relative to their origin.
	- The fragment shader runs after rasterization. Computes final color of each pixel using lighting, texture samples, and material props

16) List the six major components of a computer graphics system.
	- GIFCOM
		- GPU
		- Input Devices
		- Frame Buffer
		- CPU
		- Output Devices
		- Memory

17) What is the difference between absolute and relative positioning in terms of input
    devices? Give an example of an input device for each.
	- The difference lies in the continuity of input: 
		- Relative positioning:
			- To move a mouse cursor on the screen, you can only move it FROM where it already exists.
		- Absolute poistioning: 
			- To make inputs via a touchscreen, there is no existing screen element through which inputs occurs, you can simply tap wherever you want to make inputs at those respective locations.

18) What are the two main types of input devices mentioned in computer graphics systems?
	- Keyboard + mouse?

19) What is the difference between the CPU and GPU in a graphics system?
    - The CPU is an orchestrator in a graphics system, it determines what calculation will be performed by the GPU. The GPU handles the heavy lifting of graphical computation (large quantities of simple computations). The CPU may handle more complex computations.

20) How does anti-aliasing contribute to image quality?
    - Eliminates jagged edges along adjacent pixels / provides smoothing.

21) What is the difference between .gltf and .glb files when dealing with external 3D models?
	- gltf : GL (graphics library) Transmission Format :
		- binary file format that stores info about 3D model's geometries:
		- uncompressed + may contain .bin data file
	- glb : GL (graphics library) Binary
		- contains all data (about 3D model's geometries) in one single file
		- considerably smaller -> faster loading and portability.

22) Explain the difference between additive and subtractive color models.
	- Additive color models represent colors as sums. Color "changes" depending on how much of a color you add (ex: RGB color space (255, 0, 0) is red, (255, 0, 0+255) results in magenta/purple)
	- Subtractive color models represent how substances appear as different colors depending on the light that they absorb. (ex: Paint, the materials that compose paints absorb different frequencies of light, the light not absorbed by the paint is reflected and perceived)

23) What is the color gamut of a device?
	- The range of colors for which a device can accurate represent

24) List and define the five steps of a standard 3D graphics pipeline.
    - Vertex Shader: transforms the vertices from the Mesh data to their respective positions on the scene.
    - Primitive assembly: Draws triangles connecting vertices according to the mesh data
    - Rasterization: Creates the pixels that represent the frames
    - Fragment Shader: Colors in the pixels from rasterization
    - Frame Buffer: Stores the frame before being displayed to the user

25) What are the three necessary components that are needed to display in Three.js? Define them.
    - Scene: the environment where all 3dObjects exist
    - Camera: for viewing the scene
    - Renderer: how to display the scene

26) In the following Phong shading model, identify these seven terms: kd, Id, ks, Is, α, ka, Ia
	- kd -> diffusion reflection coefficient
	- ld -> diffusion light intensity
	- ks -> specular reflection coefficient
	- Is -> specular light intensity
	- $\alpha$ -> shininess coefficient
	- ka -> ambient reflection coefficient
	- Ia -> ambient light intensity

27) What are the components that make up a 3D object in Three.js?
	- Geometry, material, and mesh

28) What are the two types of cameras in Three.js and how do they differ from one another?
    - Perspective camera:
	    - Closely mimics how objects appear in real life, with depth/sense of distance.
	- Orthographic camera:
		- Drops all semblance of distance and depth. Objects appear to the be same size regardless of their distance from the camera.

29) What are the three main components of the Phong shading model, and how do they contribute to the appearance of a surface in 3D graphics?
    - Ambient -> even distribution of light across all surfaces of an object, doesn't provide a sense of depth of the object, doesn't expose light's direction of origin.
    - Specular -> bright spots on an object's surface -> exposes light's direction of origin.
    - Diffuse -> object's depth becomes apparent + exposes light's direction of origin.

30) Create a translation matrix to move a point 3 units along the x-axis and 7 units along the negative y-axis
	![[Pasted image 20260317232716.png]]
	- $\begin{bmatrix} 1 & 0 & 0 & 3 \\ 0 & 1 & 0 & -7 \\ 0 & 0 & 1 & 0 \\ 0 & 0 & 0 & 1\end{bmatrix}$

31) If we want to translate the vector (20,20,20,1) off 10 units in the X direction, what would the resulting matrix look like?
	- $\begin{bmatrix} 30 \\ 20 \\ 20 \\ 1 \end{bmatrix}$

32) Create a 4x4 matrix to scale a point by 3 in the x dimension and 0.2 in the z dimension.
	- $\begin{bmatrix} 3 & 0 & 0 & 0 \\ 0 & 1 & 0 & 0 \\ 0 & 0 & 0.2 & 0 \\ 0 & 0 & 0 & 1 \end{bmatrix}$

33) How does Percentage-Closer Filtering (PCF) help improve shadow quality?
	- Makes the shadows look smoother and softer by taking multiple samples around each pixel and averaging the results. Like anti-aliasing, but for shadows.

34) Explain the role of UV mapping in applying textures to 3D geometries.
    - UV mapping creates a connection between points on the geometry and on the face. Textures can use these points to cleanly wrap around geometries

35) A point P = (1, 2, 3, 1) is scaled by 2 in all directions and then translated by (5, 0, 0).  
	Write the combined transformation matrix and compute the final point
	- combined transformation matrix: $\begin{bmatrix} 2 & 0 & 0 & 5 \\ 0 & 2 & 0 & 0 \\ 0 & 0 & 2 & 0 \\ 0 & 0 & 0 & 1 \end{bmatrix}$
	- $\begin{bmatrix} 1 \\ 2 \\ 3 \\ 1 \end{bmatrix} \cdot \begin{bmatrix} 2 & 0 & 0 & 5 \\ 0 & 2 & 0 & 0 \\ 0 & 0 & 2 & 0 \\ 0 & 0 & 0 & 1 \end{bmatrix} = \begin{bmatrix} 7 \\ 4 \\ 6 \\ 1 \end{bmatrix}$

36) What range do coordinates fall into after transformation into NDC space?
	- Coordinates fall into the range \[-1, 1] on all three axes (X, Y, Z) in NDC (Normalized Device Coordinate) space.

37) Why does the order of matrix multiplication matter in transformations?
	- It matters, because matrix multiplication is not commutative. Additionally, applying the transformations in the wrong order will produce different results.

38) What happens when you apply scaling after translation vs before translation?
	- If we apply scaling after translation, the magnitude of the translation is also scaled. If we apply scaling before translation, the magnitude of the translation is unaffected.

39) What is the identity matrix, and what does it do?
	- Square matrix with 1s on the diagonal and 0s everywhere else. Multiplying this matrix with another will leave it unchanged.

40) How do you compute the inverse of a transformation matrix conceptually?
	- inverse of a translation: translate by (-x, -y, -z)
	- inverse of a scale: scale by (1/x. 1/y, 1/z)
	- inverse of a rotation: rotate by $-\theta$

41) Why are homogeneous coordinates (x, y, z, w) used instead of just (x, y, z)?
	- Allows any 4x4 matrix to be used to transform three dimensional vector including matrices whose bottom row is not (0,0,0,1)

42) What is the purpose of the w component in homogeneous coordinates?
	- ?

43) Why is translation not considered a linear transformation?
	- A linear transformation requires that the origin be preserved in the transformation, but a translation moves the object from the origin.

44) What does the projection matrix do to 3D coordinates?
	- Transforms 3d coordinates into "clip space" -- mapping the 3D scene onto a 2D plane by encoding depth into the W component, after which the perspective divide (X/W, Y/W, Z/W) produces NDC coordinates.

45) Why is clipping performed before rasterization?
	- To save compute--there is no reason to rasterize something that is not intended to be rendered

46) What is a view frustum?
	- It is the shape of the region that can be seen and rendered by a perspective camera

47) Compute the dot product of vectors A = (1, 2, 3) and B = (4, -5, 6).
	- math

48) Given a canvas size of 1000 × 500 and a mouse position at (250, 125), compute the corresponding Normalized Device Coordinates (NDC) values of (x,y)
	![[Pasted image 20260518121704.png]]
49) After converting mouse coordinates to NDC, list the next two steps required to generate a ray in Three.js.
	- Create a ray normal to the mouse's position -> the ray will intersect scene objects that the mouse hovers over.

50) What is a shader in computer graphics?
	- Small programs that run on the GPU and are used to control the rendering process in Three.js. 

51) What is the purpose of ShaderMaterial in Three.js?
	- To use shaders on the material for a geometry; to create a mesh with shader-based visuals.

52) What is the purpose of the gl_Position variable in a vertex shader?
	- Tells the GPU where to place a vertex of a mesh on the screen. Role similar to vertex shader in 3d graphics pipeline. 

53) What is the purpose of the gl_FragColor variable in a fragment shader?
	- Tells the GPU what color each fragment/pixel should be. Role similar to fragment shader in 3d graphics pipeline.

54) What are uniforms in GLSL shaders?
	- Custom made variables accessible to the shaders, they come from external logic.

55) What is the difference between a uniform and a varying?
	- They serve different purposes. Uniforms are variables from logic that are passed to shaders, while varying are variables to transfer data from the vertex shader to the fragment shader.

56) Why are uniforms useful for animation?
	- They allow developers to pass a time variable that can help sequence animations.

57) What is the purpose of the uv coordinate in shaders?
	- Maps surfaces of a mesh to parts of a 2d texture image, telling the shader which pixel of the texture to sample for that fragment.

58) What does the following line do: vUv = uv;?
	- copies the uv coordinates into a varying Uv variable

59) Why is `projectionMatrix * modelViewMatrix` commonly used in vertex shaders?
	- This boilerplate code transforms vertex from local object space to clip space in one operation.

60) What coordinate space is a vertex in after multiplication by the projection matrix?
	- Camera/view space

61) What happens if gl_Position is never assigned in a vertex shader?
	- The geometry will not render or garbage output.

62) Why are fragment shaders executed more frequently than vertex shaders?
	- Fragment shader is executed per pixel, while vertex shader is executed per vertex. There is always more pixels than there are vertices.

63) Explain how a time-based animation can be created using a uniform such as u_time.
	- u_time is updated on the CPU each frame and then passed into the shader. u_time could then be used to drive color position changes.

64) What is the purpose of the vec2, vec3, and vec4 GLSL data types?
	-  They are ways to structure data as groups.
	- Vec2 could be used to organize data as pairs (ex: cartesian coordinates)
	- Vec3, stores data as triples (ex: rgb, position in 3d space (x,y,z))
	- Vec4, stores data in groups of four (ex: homogeneous coordinates (x,y,z,w))

65) What is the purpose of the main() function inside a shader?
	- It's the entry point of the shader, the GPU calls it once per vertex shader.

66) Explain the purpose of normalized UV coordinates.
    - Normalized UV coordinates makes shaders resolution independent.

67) What are the four main parameters used to define a PerspectiveCamera?
	- FOV, aspect ratio, near, far

68) What is the purpose of the field of view (FOV) parameter in a PerspectiveCamera?
	- The angle that determines how wide the camera's visible area is. Similar to peripheral vision.

69) What is the purpose of the near and far clipping planes?
	- To limit rendering objects to within a range between the near and far

70) Why is the aspect ratio important when creating a camera?
	- It is the size of the 'window' used to view a scene.

71) Explain the difference between parallel projection and perspective projection.
	- Parallel projection is not intended to display depth, while perspective projection is intended to display depth.

72) What is the center of projection (CoP)?
	- arbitrary point from where the lines are drawn on each point of an object.

73) Where is the center of projection located in a parallel projection?
	- At infinity

74) Where is the center of projection located in a perspective projection?
	- At a finite distance

75) Why is perspective projection considered more realistic than orthographic projection?
	- Aligns closer with what humans perceive.

76) What is the difference between orthographic and oblique projection?
	- Orthographic: projecting lines are perpendicular to the view plane. No depth distortion, objects appear flat and proportionally accurate.
	- Oblique: Projecting lines hit the view plane at an angle other than $90^o$. This allows one face of an object to be shown frontally while depth is represented at an angle.

77) What is an axonometric projection?
	- An orthographic projection, where projection lines are perpendicular to the plane of projection, and the object rotated around one or more of its axes to sow multiple sides.

<h1>MC</h1>
1) Which rendering technique calculates the color of each pixel individually based on lighting and material properties?
	c) Vector graphics

2) Which type of projection is often used for architectural drawings and design, where lines that are parallel in 3D space remain parallel in the projection?
	c) Orthographic

3) What is the term for the process of converting 3D coordinates to 2D screen coordinates for rendering?
	b) Projection

4) Which term describes the technique of simulating the interaction of light with translucent materials, such as glass or water?
	c) Refraction

5) What is the primary goal of a vertex shader in computer graphics?
    d) To transform 3D vertices into 2D screen coordinates

6) Transparent objects such as glass or water are both refractive and reflective. The ratio of light they reflect to that they transmit depends on the angle of incidence. The amount of transmitted light increases when the angle of incidence:
    b) Decreases (this is the fresnel effect)

7) In a graphical system, an array of pixels in the picture are stored in which of the following locations?
    a) Frame buffer

8) By the principle of the conservation of energy, the amount of reflected light plus the amount of refracted light is _________ the total amount of incident light
	c) Equal to

9) Which term describes the effect of simulating the way light scatters within a material, creating a soft appearance?
	b) Diffusion

10) Which graphics technique is used to create the illusion of three dimensions on a  two-dimensional surface?
	c) Perspective projection 

11) Which term describes the process of simulating the way light scatters or bounces off surfaces?  
	d) Reflection

12) If the coefficient of restitution is equal to 1, then the resulting collision is:
	b) Elastic

13) Which of the following is defined as the number of pixels stored in the frame buffer of a graphics system?
	b) Resolution

14) In 3D graphics, what is ‘ambient lighting’ used to simulate?
    b) Indirect lighting from the environment

15) What is the term for the process of eliminating objects or parts of objects that are outside the view frustum in 3D rendering?
	b) Clipping

16) Which of these techniques is a process where geometry that's not visible from the camera is discarded to save processing time?
    a) Culling

17) Which of the following formats is specifically designed for vector graphics?
    c) SVG

18) What does the dot product of two vectors indicate when it equals zero?
    b) The vectors are orthogonal (perpendicular)

19) FXAA stands for:
    b) Fast Approximate Anti-Aliasing

20) Multi-Sample Anti-Aliasing (MSAA) primarily samples multiple points:
    b) Only at the edges of polygons

21) CSAA improves on MSAA by:
    c) Increasing the number of coverage samples without significantly increasing the number of color/depth samples

22) 