He considerado en esta práctica que:
===

-Un `Torneo` está formado por un `ArrayList` de `jornadas`.  
-Una `Jornada` está formada por un `ArrayList` de `partidos`.  
-Un partido siempre va a tener asociado un equipo `local`, otro `visitante`, un `estadio` y un `arbitro`; así que
estos parámetros los he incluido en el constructor de la clase `Partido`.  
-Un estadio siempre va a estar asociado a un equipo en este programa y viceversa por lo que en el constructor
de la clase `Estadio` incluyo el parámetro `equipo` y en el constructor de la clase `Equipo` incluyo el parámetro `estadio`.  
-Un `Equipo` siempre va a estar asociado a un entrenador por lo que he incluido en el constructor de la clase `Equipo` el parámetro `entrenador` y en el constructor de la clase `Entrenador` incluyo el parámetro `equipo`.  
-Las enumeraciones están dentro solo de las clases en las que se van a usar.  
-Si es un jugador es capitan o no lo he tomado como una variable booleana dentro de la clase `Jugador`, en las que si es `true` el jugador será el capitan del equipo y si es `false` el jugador no será capitan del equipo.  
-Los jugadores de un equipo son un `ArrayList` dentro de la clase `Equipo`.