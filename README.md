# Tarea-3-ArbolB
# Implementación de un Árbol B en Java

## Introducción

En este trabajo se hizo un programa en Java donde se usa un árbol B para manejar números.
La idea principal fue entender cómo funciona esta estructura y cómo los datos se pueden ordenar solos sin tener que hacerlo manualmente.

El árbol B es útil porque mantiene todo en orden automáticamente y permite trabajar más rápido con los datos, sobre todo cuando hay muchos valores guardados.

---

## Objetivos

### Objetivo general
Realizar un programa en Java que utilice un árbol B para manejar datos de forma ordenada y poder aplicar operaciones como insertar, buscar y eliminar valores.

### Objetivos específicos
- Permitir que el usuario pueda ingresar números al árbol
- Comprobar si un valor existe dentro de la estructura
- Eliminar datos cuando sea necesario
- Visualizar cómo se organiza el árbol por niveles

---

## ⚙️ Descripción del programa

El programa funciona por medio de un menú en consola donde el usuario puede elegir diferentes opciones.

Primero se solicita el grado del árbol:
Grado del árbol: 3

Luego se muestran las opciones:
1. Insertar
2. Buscar
3. Eliminar
4. Mostrar
5. Salir


El usuario selecciona una opción y luego ingresa los valores que desea trabajar.

---

## ¿Qué es un árbol B?

Un árbol B es una forma de guardar datos de manera ordenada.
A diferencia de otros árboles, este puede tener varios hijos en cada nodo, y eso lo hace más práctico y rápido.

Algunas cosas importantes:

- Mantiene los datos ordenados
- Se organiza solo (no se desbalancea)
- Permite buscar rápido
- Se usa mucho en bases de datos

---

## Inserción de datos

Cuando se agrega un número:
1. Se busca dónde debe ir
2. Se coloca en el nodo correcto
3. Si el nodo ya está lleno, se divide

Cuando se divide un nodo:
- El valor del centro sube al nodo de arriba
- Los otros valores se separan en dos nodos

Esto ayuda a que el árbol siga ordenado y no crezca mal.

---

## Búsqueda

Para buscar un número, se empieza desde la raíz del árbol.

- Si el número está muestra "Sí existe"
- Si no está muestra "No existe"

Así no es necesario revisar todo, se encuentra más rápido.

---

## Eliminación

El programa también permite eliminar valores del árbol.

En este caso, se eliminan más que todo en los nodos hoja, para evitar errores y mantener el árbol funcionando bien.

---

## Ejemplo de funcionamiento

Datos ingresados:
8, 3, 1, 6, 4, 7, 10


Resultado al mostrar el árbol:

<img width="214" height="236" alt="image" src="https://github.com/user-attachments/assets/500ef521-676b-4ede-b03d-58c966c33c17" />

En este ejemplo se observa cómo el árbol se organiza automáticamente.

---

## Fragmento de código

Ejemplo de insertar en Java:

<img width="177" height="772" alt="image" src="https://github.com/user-attachments/assets/6f2343bd-884d-4219-be79-fc937fbcc5d2" />
<img width="149" height="776" alt="image" src="https://github.com/user-attachments/assets/2c5a73ee-13db-460b-b986-5adb72a52eaa" />
<img width="180" height="240" alt="image" src="https://github.com/user-attachments/assets/ccf0a5ae-4c3e-4f60-b93d-d7337ae709dd" />

Ejemplo de búsqueda:

<img width="157" height="280" alt="image" src="https://github.com/user-attachments/assets/bff7ad0b-b1d8-41bf-84cb-2965b0a698ea" />

Ejemplo de eliminación:

<img width="215" height="270" alt="image" src="https://github.com/user-attachments/assets/766ad13f-2d2b-41f0-bd99-17fe293b8344" />

---

## Análisis personal

Al hacer este ejercicio me di cuenta de que el árbol B no solo sirve para guardar datos, sino que también los ordena automáticamente.

Al principio se ve un poco complicado, pero ya cuando entiendes cómo funciona eso de dividir los nodos, todo empieza a tener sentido.

También me di cuenta de que esta estructura es muy útil cuando se trabaja con muchos datos, porque hace todo más rápido y ordenado.

---

## Conclusiones


El árbol B permite manejar los datos de forma ordenada y facilita mucho la búsqueda de información, ya que no es necesario recorrer todos los datos para encontrar uno en específico. Además, se mantiene organizado por sí solo, lo que evita tener que estar acomodando los datos manualmente cada vez que se agrega o elimina algo.

También es una estructura muy útil cuando se trabaja con sistemas grandes, como las bases de datos, donde se manejan muchos registros y se necesita rapidez. Gracias a este proyecto pude comprender mejor cómo funcionan estas estructuras y la importancia que tienen en la programación para hacer los sistemas más eficientes.
