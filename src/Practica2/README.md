Práctica 2 Sustitutiva de Clase Presencial
===
-He creado getters y setters de todo los atributos que son privados.  
-La enumeración `Genero` esta dentro de la clase `Pelicula` porque solo se utiliza en está.  
-La `Collection` `trailer` se crea dentro del constructor de la clase `Pelicula` porque es una relación de composición.     
-Sin embargo, el resto de colecciones las creo fuera del constructor porque son relaciones de asociación.  
-He importado los módulos que he creído más adecuados para cumplir con el diagrama UML propuesto.
-En esta solución las clases `Actor`, `Director`, `Editor`, `Guionista` y `Productor` heredan de  la clase `Persona`.
-He considerado que los actores, directores, editores, guionistas, y productores son diferentes `ArrayList` de tipo `Persona` dentro de la clase `Pelicula` debido a que no necesitamos guardar el orden natural de estos dentro de una pélicula.
-He considerado que las `peliculas` en las que ha participado cada `Actor`, `Director`, `Editor`, `Guionista` o `Productor` serán un `Collection` `TreeSet` debido a que puede ser interesante guardar el orden natural de las péliculas en las que ha participado cada persona.

