# ![GLOW logo](glow_logo.png) GLOW is a set of GL Object Wrappers

Interacting with a "flat" procedural or static view of lwjgl can be difficult from an
object-oriented environment. Generally in a C/C++ environment, simply #import'ing the GL loader
library places the entire GL namespace in a static context. To do the equivalent in a lwjgl
environment (and to use most intelligently-produced examples found online) you would need to create
an extremely ugly static import block:

```java
	import static org.lwjgl.opengl.GL11.*;
	import static org.lwjgl.opengl.GL12.*;
	import static org.lwjgl.opengl.GL13.*;
	import static org.lwjgl.opengl.GL14.*;
	import static org.lwjgl.opengl.GL15.*;
	import static org.lwjgl.opengl.GL20.*;
	import static org.lwjgl.opengl.GL21.*;
	import static org.lwjgl.opengl.GL30.*;
	import static org.lwjgl.opengl.GL31.*;
	import static org.lwjgl.opengl.GL32.*;
	import static org.lwjgl.opengl.GL33.*;
	import static org.lwjgl.opengl.GL43.*;
```
...plus any EXT or ARB features you planned on using. The other problem that comes up quite quickly
is that all GL constants are exposed as integers, making it unclear which constants are used for
what purposes.


GLOW provides a flat GL- and GLES- compatible view of all GL_* constants on its first abstraction
layer. On top of that is a series of objects intended to group functionality into logical categories
which accurately represent the underlying hardware. These object wrappers can be used either by
themselves as an encapsulation of complexity, or with each other to provide more context and
type-safety.