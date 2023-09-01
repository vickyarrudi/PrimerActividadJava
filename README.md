# PrimerActividadJava
Comenzamos a trabajar con Java y GitHub

## Preparar el entorno

1- Instalar el Coding Pack for Java 

Incluye VS Code, el Java Development Kit (JDK) y extensiones de Java.

https://code.visualstudio.com/docs/java/java-tutorial

2 - Descargar la extensión de Git en VS Code

Observación, en “Choosing the default editor used by Git” seleccionar “Use Visual Studio Code as Git’s default editor”

## Comenzando con GitHub y Java
### Fork

3 - Realizar un fork de este repositorio **PrimerActividadJava**

4 - Realizar la siguiente actividad

Implemente la clase Lamparita, que sirva para representar el estado de encendido de una lamparita (encendido o apagado). Defina, asimismo, dos métodos que permitan encender y apagar la luz de la lamparita y otro que indique en qué estado se encuentra. La lamparita inicialmente está apagada.

Recordar una vez realizado el ejercicio commitear y pushear los cambios.

### Commit 

$git stage --all

$git commit -am "mensaje_del_commit"

### Push

$git push

### Branch

5 - Agregar una nueva función a la lamparita.

Para esto crear una nueva rama y realizar sobre esta los nuevos cambios.

$git checkout -b nueva_rama      (creo y me cambio a la nueva_rama)

$git push -u origin nueva_rama   (subo nueva_rama al repositorio remoto)

6 - Cuando la nueva función este completada unir la rama feature al main

### Merge

a. Verificar con
**$git status**
que no haya nada para commitear

b. Cambiar a la rama main

**$git checkout main**

c. Realizar el marge

**$git marge nombre_rama**
