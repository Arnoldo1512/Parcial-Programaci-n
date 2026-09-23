Integrantes:

Daniel Ricardo Toro Ibarguen
Arnold Cabrera Gutierres



Diagrama UML

+-----------------------------------+
                  |               Libro               |
                  +-----------------------------------+
                  | - titulo: String                  |
                  | - autor: String                   |
                  | - numeroEjemplares: int           |
                  | - ejemplaresPrestados: int        |
                  +-----------------------------------+
                  | + Libro()                         |
                  | + Libro(titulo, autor, num, pres) |
                  | + prestamo(): boolean             |
                  | + devolucion(): boolean           |
                  | + getDisponibles(): int           |
                  | + getters / setters               |
                  +-----------------------------------+
                                    ^
                                    |
            +-----------------------+-----------------------+
            |                                               |
+-----------------------+                       +-------------------+
|      LibroTexto       |                       |      Novela       |
+-----------------------+                       +-------------------+
| - curso: String       |                       | - tipo: String    |
+-----------------------+                       +-------------------+
| + LibroTexto(...)     |                       | + Novela(...)     |
| + toString()          |                       | + toString()      |
+-----------------------+                       +-------------------+
            ^
            |
+-----------------------+
|    LibroTextoUNIAC    |
+-----------------------+
| - facultad: String    |
+-----------------------+
| + LibroTextoUNIAC(...) |
| + toString()          |
+-----------------------+   

---

Atributos Nuevos y Método Adicional

Atributos Nuevos (en las clases hijas):
  1. `curso`: Para saber a qué materia pertenece el libro escolar.
  2. `facultad`: Para saber la facultad que usa el libro.

Método Adicional:
 `getDisponibles()`: Un método sencillo que resta `numeroEjemplares - ejemplaresPrestados` para saber cuántos libros quedan libres para prestar.

---

Situaciones donde puede fallar la Herencia

1. Heradar una clase que no tiene relación ("No es un..."):
   Si creamos una clase como `Estudiante` y la hacemos heredar de `Libro` solo para aprovechar variables como el nombre o el código, estaría mal planteado. Un estudiante no es un libro, por lo que terminaría heredando métodos que no le corresponden como `prestamo()` o `devolucion()`.

2. Modificar la clase padre y romper las clases hijas:
   Si cambiamos o borramos los constructores o atributos en la clase principal (`Libro`), las clases hijas (`Novela` y `LibroTextoUNIAC`) van a sacar error de compilación al usar la instrucción `super()`, obligándonos a cambiar todo el código de las clases hijas.
