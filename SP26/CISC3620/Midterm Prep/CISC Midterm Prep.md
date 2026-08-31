<h1>Short Response Questions</h1>

1) >[!note]- What is the primary focus of computer graphics?
	>To use computers to display graphics.
 
2) >[!note]- Describe the difference between 2D and 3D graphics.
    > 2D graphics are represented on a flat plane with only x and y coordinates. 3D graphics add a z axis for depth--giving graphic objects volume and other viewing perspectives/angles.

3) >[!note]- Identify the four major areas of computer graphics applications noted in class and provide a brief description and example of each.
    >1) Display of information: Digital representation of information translated to a graphic.  An example would be computer being used to compute and display the line of a graph.
    >2) Design: Structure of how data is presented. Example: structure of a website, how a Nav bar is organized to contain data pertaining to one topic.
	>3) Simulation and Animation: Using computers to generate images and animations for various purposes (entertainment, training, visualization). Example: A video game that teaches people how to build a house.
    >4) User Interfaces: Might be more commonly referred to as "the controls". These are the visual elements that end users can interact with to get responses from an application. Example: Clicking the amazon logo takes you to the amazon homepage.

4) >[!note]- Explain the role of a graphics processing unit (GPU).
	 > Purpose: to handle frequent and rapid arithmetic processes for graphical computation.

5) >[!note]-  What is the purpose of a frame buffer in computer graphics
	 > Stores the color of every pixel of a frame before it is sent to display.

6) >[!note]- What are the two main types of 2D graphics? Define them, explain how they differ, and give an example of each.
	> 1) Vector Graphics: 
		 > Images represented as lists of the geometric shapes that compose them. If the user zooms in on vector graphics, zoomed in portions will scale, retaining its resolution. A PDF file will retain the resolution of text if zoomed in on.
	> 2) Raster Graphics:
		 > images that are made up of a grid of pixels. If the user zooms in on raster graphics, zoomed in portions will not scale, and will appear more pixelated. Example: A jpeg image.

7) >[!note]-  Define raster graphics and provide an example of its use.
	 > Raster graphics are images made of a grid of pixels. Raster graphics are used for jpeg images.

8) >[!note]-  What are vector graphics, and how do they differ from raster graphics?
	 > Vector graphics are images represented as lists of the geometric shapes that compose them.

9) >[!note]-  List six major components of a computer graphics system:
	>1) Graphics Processing Unit
	>2) Input Devices
	>3) Frame Buffer
	>4) Central Processing Unit
	>5) Output Devices
	>6) Memory
	>Remember GIFCOM

10) >[!note]-  What is the difference between absolute and relative positioning in terms of input devices? Give an example of an input device for each.
	 > Absolute positioning input devices are input devices that allow users to make discontinuous inputs. Unlike Relative positioning input devices, which require that you move a controlling element like a cursor to a new desired position, Absolute positioning devices allow users to make "jumps" from one spot to the next by tapping. Example of absolute positioning device: A tablet's touch-screen input. Example of relative positioning input device: A computer mouse.

11) >[!note]- What is the difference between the CPU and GPU in a graphics system?
	 > The central processing unit handles more complex computations. The graphics processing unit handles simpler computations in large quantities. These computations are necessary for graphics to display in a reasonable time.

12) >[!note]- What are the two mains types of input devices mentioned in computer graphics systems?
	 > Computer mouse and keyboard.
	 
13) >[!note]- How does anti-aliasing contribute to image quality?
	 > Anti-aliasing provides a "smoothing" effect to jagged edges in an image. A type of anti-aliasing involves blurring edges within an image to make the transition between colors smoother, thereby making the edge look smoother.

14) >[!note]- Describe the difference between noninterlaced and interlaced display systems in terms of how they refresh pixels on a screen.
	 > Noninterlaced systems: pixels are displayed row by row, or scan line by scan line, at the refresh rate.
	 > Interlaced systems: odd rows and even rows are refreshed alternately.

15) >[!note]- What advantages does a PNG have over a GIF? 
	 > PNGs support a wider range of colors than GIFs. This allows for greater color depth in PNGs, allowing PNGs to more precise in their composition.

16) >[!note]- What is the purpose of a graphics API?
	 > A graphics API is an abstract set of commands to aid developers in communicating with graphics hardware (GPU).

17) >[!note]- Explain the difference between additive and subtractive color models.
	 > Additive color models deal with colors of the visible light spectrum, like RGB. Subtractive color models deal with how light is absorbed and reflected by substances-- the difference is what is visible, like CYMK. 

18) >[!note]- What is the color gamut of a device?
	 > The range of colors that can be reproduced accurately.

19) >[!note]- Briefly explain the role of the vertex shader in the graphics pipeline.
	> To calculate the positions of the vertices of a 3D graphic, translate those vertices to a space in a scene, relative to the camera's position and orientation, then project these vertices onto a 2D plane using perspective projection.

20) >[!note]- List and define the five steps of a standard 3D graphics pipeline.
    >1) vertex shader: 
	    > Calculates position of vertices of 3D graphic -> translates vertices to a space in a scene relative to the camera's position and orientation -> projects vertices onto 2D plane using perspective projection.
	>2) Primitive assembly:
	    > Vertices are connected through geometric primitives. Popularly, triangles are used.
	>3) Rasterization:
	    > 3D models are converted into pixels or fragments. These pixels represent the final image that will appear on the screen.
	>4) Fragment shader:
		> Each pixel is colored with respect to the material properties of the object.
	>5) Framebuffer:
	    > The graphic object is stored here before being displayed to the screen.

21) >[!note]- What are the three necessary components that are needed to display in Three.js? Define them. 
	 > Scene: This is where all graphics objects end up for display.
	 > Camera: This is how the user views the scene
	 > Renderer: This is how objects are compiled and drawn to the scene.

22) >[!note]- What is a mesh in Three.js?
	 > A mesh represents an "assembled" object. It is the combination of an object's geometry and material.

23) >[!note]- What is the difference between MeshBasicMaterial and MeshStandardMaterial? 
	 > MeshBasicMaterial is not affected by lights, while MeshStandardMaterial is. 

24) >[!note]- What is the difference between MeshLambertMaterial and MeshPhongMaterial?
	 > MeshLambertMaterial is a material for non-shiny surfaces, without specular highlights, MeshPhongMaterial is a material for shiny surfaces, with specular highlights.

25) >[!note]- Why is requestAnimationFrame() used in Three.js animations?
	 > For efficiency--pauses when the user navigates to another browser tab, saving processing power and battery life.

26) >[!note]- In the following Phong shading model, identify these seven terms: 
	$I = k_d \cdot I_d \cdot l \cdot n + k_s \cdot I_s (v \cdot r) \alpha + k_a \cdot I_a$ 
	 > kd : diffuse reflections coefficient
	 > ld : diffuse light intensity
	 > ks : specular reflection coefficient
	 > ls : specular light intensity
	 > $\alpha$ : shininess coefficient
	 > ka : ambient reflection coefficient
	 > la : ambient light intensity
	 
27) >[!note]- What are the components that make up a 3D object in Three.js?
	 > Geometry, Material, Mesh

28) >[!note]- What are the two types of cameras in Three.js, and how do they differ from one another?
	> Orthographic and Perspective. 
	> Orthographic camera uses orthographic projection. Elements viewed with this camera maintain a constant size, regardless of their distance from the camera.
	> Perspective camera uses perspective projection. This camera is designed to mimic the way that human eyes perceive things. Things closer to the camera will appear larger, things farther will appear smaller.

29) >[!note]- List the four attributes of the perspective camera in THREE.js and what they represent.
	 >1) FOV: the "peripheral vision" of the camera, how much one can see through the camera.
	 >2) Aspect ratio: the proportion of the width to the height of the camera.
	 >3) Near: the closest graphics object relative to the camera that can be rendered.
	 >4) Far: The furthest graphics object relative to the camera that can be rendered.

30)  >[!note]- What are the three main components of the Phong shading model, and how do they contribute to the appearance of a surface in 3D graphics?
	 >1) Ambient : The background light for the object
	 >2) Diffuse : Shows the direction of the light and can show depth in an object
	 >3) Specular : For shiny objects, it reflects the bright spot on the surface

31) >[!note]- Create a translation matrix to move a point 3 units along the x-axis and 7 units along the negative y-axis.
	 > ![[Pasted image 20260317232716.png]]$\begin{bmatrix} 1 & 0 & 3 \\ 0 & 1 & -7 \\ 0 & 0 & 1\end{bmatrix} \cdot \begin{bmatrix} x \\ y \\ 1 \end{bmatrix} = \begin{bmatrix} x+3 \\ y-7 \\ 1\end{bmatrix}$ 

32) >[!note]- Create a 4x4 matrix to scale a point by 3 in the x dimension and 0.2 in the z dimension
	 >![[Pasted image 20260317232716.png]] $\begin{bmatrix} 3 & 0 & 0 & 0\\ 0 & 1 & 0 & 0\\ 0 & 0 & 0.2 & 0 \\ 0 & 0 & 0 & 1 \end{bmatrix} \cdot \begin{bmatrix} x \\ y \\ z \\ 1 \end{bmatrix} = \begin{bmatrix} x \cdot 3 \\ y \cdot 1 \\ z \cdot 0.2 \\ 1\end{bmatrix}$ 

33) >[!note]- Create a 4x4 transformation matrix that first translates a point by (4,-2,5) and then scales it by 2 in all directions
	 > ![[Pasted image 20260317232716.png]]$\begin{bmatrix} 1 & 0 & 0 & 4 \\ 0 & 1 & 0 & -2 \\ 0 & 0 & 1 & 5 \\ 0 & 0 & 0 & 1 \end{bmatrix} \cdot \begin{bmatrix} x \\ y \\ z \\ 1 \end{bmatrix} = \begin{bmatrix} x+4 \\ y-2 \\ z+5 \\ 1\end{bmatrix} \Rightarrow \begin{bmatrix} 2 & 0 & 0 & 0 \\ 0 & 2 & 0 & 0 \\ 0 & 0 & 2 & 0 \\ 0 & 0 & 0 & 1 \end{bmatrix} \cdot \begin{bmatrix} x+4 \\ y-2 \\ z+5 \\ 1\end{bmatrix} = \begin{bmatrix} 2x+8 \\ 2y-4 \\ 2z+10 \\ 1\end{bmatrix}$

34) >[!note]- A point $P = (1,3,-2,1)$ is scaled by $3$ in the x-direction and $0.5$ in the y-direction, then translated by $(2,-4,1)$. Write the combined transformation matrix and compute the final coordinates of the point.
	 > ![[Pasted image 20260317232716.png]]$\begin{bmatrix} 3 & 0 & 0 & 0 \\ 0 & 0.5 & 0 & 0 \\ 0 & 0 & 1 & 0 \\ 0 & 0 & 0 & 1\end{bmatrix} \cdot \begin{bmatrix} 1 & 0 & 0 & 2 \\ 0 & 1 & 0 & -4 \\ 0 & 0 & 1 & 1 \\ 0 & 0 & 0 & 1 \end{bmatrix} = \begin{bmatrix} 3 & 0 & 0 & 6 \\ 0 & 0.5 & 0 & -2 \\ 0 & 0 & 1 & 1\\ 0 & 0 & 0 & 1\end{bmatrix} \Rightarrow$
	 > 
	 > $\begin{bmatrix} 3 & 0 & 0 & 6 \\ 0 & 0.5 & 0 & -2 \\ 0 & 0 & 1 & 1\\ 0 & 0 & 0 & 1\end{bmatrix} \cdot \begin{bmatrix} x \\ y \\ z \\ 1 \end{bmatrix} = \begin{bmatrix} 3x+6 \\ 0.5y-2 \\ z + 1 \\ 1 \end{bmatrix}$

35) >[!note]- A point $P=(2,1,0,1)$ is transformed in two different ways.
	>1) Case A: Scale by 2 in all directions, then translate by 3 on the x-axis:
		 > $\begin{bmatrix} 1 & 0 & 0 & 3 \\ 0 & 1 & 0 & 0 \\ 0 & 0 & 1 & 0 \\ 0 & 0 & 0 & 1\end{bmatrix} \cdot \begin{bmatrix} 2 & 0 & 0 & 0 \\ 0 & 2 & 0 & 0 \\ 0 & 0 & 2 & 0 \\ 0 & 0 & 0 & 1 \end{bmatrix} = \begin{bmatrix} 2 & 0 & 0 & 3 \\ 0 & 2 & 0 & 0 \\ 0 & 0 & 2 & 0 \\ 0 & 0 & 0 & 1 \end{bmatrix} \Rightarrow$
		 > $\begin{bmatrix} 2 & 0 & 0 & 3 \\ 0 & 2 & 0 & 0 \\ 0 & 0 & 2 & 0 \\ 0 & 0 & 0 & 1 \end{bmatrix} \cdot \begin{bmatrix} 2 \\ 1 \\ 0 \\ 1 \end{bmatrix} = \begin{bmatrix} 7 \\ 2 \\ 0 \\ 1 \end{bmatrix}$
	>1) Case B: Translate by 3 on the x-axis, then scale by 2 in all directions:
		 > $\begin{bmatrix} 2 & 0 & 0 & 0 \\ 0 & 2 & 0 & 0 \\ 0 & 0 & 2 & 0 \\ 0 & 0 & 0 & 1 \end{bmatrix} \cdot \begin{bmatrix} 1 & 0 & 0 & 3 \\ 0 & 1 & 0 & 0 \\ 0 & 0 & 1 & 0 \\ 0 & 0 & 0 & 1\end{bmatrix} = \begin{bmatrix} 2 & 0 & 0 & 6\\ 0 & 2 & 0 & 0 \\ 0 & 0 & 2 & 0 \\ 0 & 0 & 0 & 1 \end{bmatrix} \Rightarrow$
		 > $\begin{bmatrix} 2 & 0 & 0 & 6\\ 0 & 2 & 0 & 0 \\ 0 & 0 & 2 & 0 \\ 0 & 0 & 0 & 1 \end{bmatrix} \cdot \begin{bmatrix} 2 \\ 1 \\ 0 \\ 1 \end{bmatrix} = \begin{bmatrix} 10 \\ 2 \\ 0 \\ 1 \end{bmatrix}$

36) >[!note]- Construct a 4x4 matrix that scales a point by $(2,3,1)$ and then translates it by $(5,0,2)$.
    > $\begin{bmatrix} 1 & 0 & 0 & 5 \\ 0 & 1 & 0 & 0 \\ 0 & 0 & 1 & 2 \\ 0 & 0 & 0 & 1 \end{bmatrix} \cdot \begin{bmatrix} 2 & 0 & 0 & 0 \\ 0 & 3 & 0 & 0 \\ 0 & 0 & 1 & 0 \\ 0 & 0 & 0 & 1 \end{bmatrix}  = \begin{bmatrix} 2 & 0 & 0 & 5 \\ 0 & 3 & 0 & 0 \\ 0 & 0 & 1 & 2 \\ 0 & 0 & 0 & 1 \end{bmatrix}$

37) >[!note]- A point is translated by $(-6,4,2)$$ and then scaled by $0.5$ in all directions. Write two matrices. Multiply them to form the combined transformation matrix.
    > $\begin{bmatrix} 0.5 & 0 & 0 & 0 \\ 0 & 0.5 & 0 & 0 \\ 0 & 0 & 0.5 & 0 \\ 0 & 0 & 0 & 1 \end{bmatrix} \cdot \begin{bmatrix} 1 & 0 & 0 & -6 \\ 0 & 1 & 0 & 4 \\ 0 & 0 & 1 & 2 \\ 0 & 0 & 0 & 1 \end{bmatrix} = \begin{bmatrix} 0.5 & 0 & 0 & -3 \\ 0 & 0.5 & 0 & 2 \\ 0 & 0 & 0.5 & 1 \\ 0 & 0 & 0 & 1\end{bmatrix}$

38) >[!note]- What are the given types of lights in Three.js discussed in class? Briefly describe each.
    > 1) Ambient light : Provides even lighting with no direction. This light cannot cast shadows.
    > 2) Point light: A light that has position and emits light from its position. This light can cast shadows.
    > 3) Directional Light : A light that doesn't necessarily have a fixed position (not to be confused with the position property used for shadow calculations), the light comes from a direction. This light can cast shadows.
    > 4) Spotlight :  Emits a cone of light in a direction and do not illuminate objects in the opposite direction of its target.
    > 5) Hemisphere Light : Used to simulate the light coming from the sky. 

39) >[!note]- How do we apply a texture to a material in Three.js?
    > The sequence of lines:
    > 	```
    > 	 const texture = new THREE.TextureLoader().load(texture_URL_or_DIR);
    > 	 const material = new THREE.MeshStandardMaterial({map: texture});
    > 	```

40) >[!note]- What is texture tiling, and how can it improve the appearance of textures in a 3D scene?
    > Texture tiling is the repetition of a given texture resource (maybe a PNG image file) along a surface. It can improve the appearance by preventing the stretch of a single texture tile over a large surface, which would in turn make the texture appear blurry.

41) >[!note]- What is shadow mapping, and how does it work?
    > A technique to create shadows in 3D graphics. It renders scenes from the perspectives of light sources, storing the depth values of the scene in a shadow map data structure. Depth values of the scene are then compared to the depth values in the shadow map, where pixels are decided to be shadows.

42) >[!note]- How does percentage-closer filtering (PCF) help improve shadow quality?
    > It smooths the edges of shadows. Like antialiasing, but for shadows.

43) >[!note]- Explain the difference between castShadow and receiveShadow properties in Three.js.
    > castShadow allows an object to cast a shadow.
    > receiveShadow allows an object to display shadows cast onto it

44) >[!note]- Explain the role of UV mapping in applying textures to 3D geometries.
    > Enables textures to be wrapped around a 3D object.

45) >[!note]- What is hierarchical modeling in computer graphics?
    > When multiple graphical objects are grouped together to become one complex object. Changes to the complex object have influence over the underlying objects that compose it.

46) >[!note]- Why is hierarchical modeling useful when creating complex objects?
	> It streamlines the process of applying transformations across the underlying objects that compose complex objects.

47) >[!note]- What happens if the scene is rendered only once and not inside an animation loop?
	> The scene would be static. Interaction that's expected to make graphical changes would appear to do nothing.
	
48) >[!note]- What is a scene graph, and how does it relate to hierarchical modeling?
    > It is a data structure that represents the relationship between the underlying objects that compose a hierarchical model. Usually appears in the form of a tree.

<h1>Multiple Choice Questions</h1>

 >[!note]- Which of the following best describes raster graphics?
 >B) Graphics represented by pixels.
 
 >[!note]- What is the primary advantage of using vector graphics?
 >B) They are resolution-independent
 
 >[!note]- The conversion of geometric entities to pixel colors and locations in the frame buffer is known as: 
 >C) Rasterization
 
 >[!note]- Which of the following is not a common input device? 
 >D) Joystick
 
 >[!note]- The color model that involves the mixing of light is called:
 >B) Additive
 
 >[!note]- How many colors can be displayed using an 8-bit RGB color model? 
 >A) 256
 
 >[!note]- A digital image displayed with a grid of pixels is known as: 
 >B) Raster image

>[!note]- To define color in a raster image, which color model is typically used?
>C) RGB

>[!note]- What RGB value represents the color black? 
>B) (0, 0, 0)

>[!note]- How can the color white be described in terms of RGB values?
>C) (255, 255, 255)

>[!note]- Which of the following RGB values represents a shade of gray?
>C) (128, 128, 128)

>[!note]- Which of these techniques is a process where geometry that's not visible from the camera is discarded to save processing time?
>A) Culling

>[!note]- Which of the following transformations is NOT a linear transformation? 
>C) Translation

>[!note]- Which of the following formats is specifically designed for vector graphics? 
>C) SVG

>[!note]- What does the term 'anti-aliasing' refer to?
>B) Reducing jagged edges in graphics

>[!note]- Which component determines the color of pixels on a computer screen?
> B) Graphics Processisng Unit (GPU)

>[!note]- Which material in Three.js would you use for a surface that should reflect light and appear shiny?
>C) MeshPhongMaterial

>[!note]- What does the dot product of two vectors indicate when it equals zero?
>B) The vectors are orthogonal (perpendicular)

>[!note]- In a graphics pipeline, rasterization is the process of
>C) Breaking down 3D objects to pixels.

>[!note]- In Three.js, how do you set the background color of a scene? 
>B) scene.background = new THREE.Color("blue");

>[!note]- How does ambient light affect a scene?
>B) It adds light without direction or intensity

>[!note]- Which of the following describes a characteristic of raster graphics?
>B) They are resolution-independent

>[!note]- What is the primary disadvantage of using Supersampling Anti-Aliasing (SSAA)?
>B) It is computationally intensive and can heavily load the GPU

>[!note]- FXAA stands for
>B) Fast Approximate Anti-Aliasing

>[!note]- Multi-Sample Anti-Aliasing (MSAA) primarily samples multiple points
>B) Only at the edges of polygons

>[!note]- CSAA improves on MSAA by
>C) Increasing the number of coverage samples without significantly increasing the number of color/depth samples.

