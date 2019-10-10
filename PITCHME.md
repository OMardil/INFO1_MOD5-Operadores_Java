@snap[north span-100]
### Módulo 5
## Variables, Operadores e Instrucciones Básicas
@snapend

@snap[south-east span-30]
![Java](assets/img/java_background.png)
@snapend

@snap[south-west span-30]
![Java](assets/img/lego_background.png)
@snapend

---
@snap[midpoint span-100 text-08]
# Identificadores
@snapend

+++
## Identificadores
@snap[span-100 text-09]
Un identificador es el nombre que se utiliza para referirnos una variable o método.

Las variables pueden contener:
@snapend

@snap[span-100]
@ul[text-08 text-blue]
* Letras (sin caracteres especiales)
* Números (0123456789)
* Guión bajo (_)
@ulend
@snapend

@snapend
@snap[span-100 fragment text-09]
Sin embargo, no pueden:
@ul[text-09 text-blue]
* El primer caracter ser un número
* Contener puntos (.), asteriscos (*), u otros caracteres especiales (@!ñ%&).
* Ser una palabra clave o palabra reservada. [Ver lista](https://en.wikipedia.org/wiki/List_of_Java_keywords)
@ulend
@snapend

+++?code=assets/src/identifiers.java&lang=java
@[1, zoom-20](@fa[check-square text-green] Válido)
@[2, zoom-20](@fa[check-square text-green] Válido, combinar mayúsculas y minúsculas está permitido.)
@[3, zoom-20](@fa[check-square text-green] Válido, combinar caracteres y números está permitido.)
@[4, zoom-20](@fa[check-square text-green] Válido)
@[5, zoom-20](@fa[check-square text-green] Válido)
@[6, zoom-20](@fa[times-circle text-pink] Inválido! No podemos combinar letras y espacios.)
@[7, zoom-20](@fa[times-circle text-pink] Inválido! Los identificadores no pueden comenzar con un número.)
@[8, zoom-20](@fa[check-square text-green] Válido)
@[9, zoom-20](@fa[times-circle text-pink] Inválido! Los identificadores no pueden comenzar con caracteres especiales.)
@[10, zoom-20](@fa[times-circle text-pink] Inválido! Los identificadores no pueden comenzar con un número.)
@[11, zoom-20](@fa[times-circle text-pink] Inválido! Existen palabras reservadas que NO pueden ser utilizadas como nombres de variables.)
@[12, zoom-11](@fa[check-square text-green] Válido, es posible combinar mayúsculas y minúsculas. Los identificadores pueden ser arbitrareamente largas.)

--- 
@snap[midpoint span-100 text-08]
# Variables
@snapend

+++
## Variables
@snap[span-100]
Una _*variable*_ es la unión de un @css[text-blue](tipo de dato y un identificador) que nos permiten almacenar información. En Java, las variables son una ubicación de @css[text-blue](memoria RAM). 
<br><br>
Cuando la variable almacena cierta información, el dato se codifica en 1's y 0's y se almacena en memoria RAM.
@snapend

+++
![](assets/img/variable_explain.png)

+++
## Variables
@snap[span-100]
Una variable pasa por dos fases:
@snapend

@snap[span-100]
@ol[text-blue]
1. Declaración: @css[text-black](Especificamos un tipo de dato [int, char, String] )
2. Asignación: @css[text-black](Utilizamos el símbolo = para especificar un valor.)
@olend
@snapend
<br>
@snap[span-100 fragment text-center]
Una variable SIEMPRE debe declararse antes de poderse usar. 
@snapend

+++
@snap[text-07 span-100]
## Tipos de datos primitivos
![Variables](assets/img/variable_types.png)
@snapend

+++
## Variables primitivas
@snap[span-100]
Las variables primitivas son los tipos de datos más básicos existentes en Java. Al combinar estos tipos de datos podemos representar cualquier estructura, juego, video, u objeto que nos imaginemos.
@snapend

@snap[span-100 south fragment]
![](assets/img/primary_colors.png)
@snapend


+++?code=assets/src/variables.java&lang=java
@[1-2, zoom-15](Declaración de la variable "money_in_bank" de tipo "double".)
@[3-4, zoom-15](Almacenamos el valor "100.50" en la variable "money_in_bank".)

@[6-7, zoom-15](Declaración de la variable "myName" de tipo "String".)
@[8-9, zoom-15](Guardamos el texto "Arthur" en la variable "myName".)
@[8-11, zoom-15](Reemplazamos el contenido de "myName" con "Arthur Fleck".)

@[13-14, zoom-15](También es posible hacer una declaración y asignación en una misma instrucción.)

---
@snap[midpoint span-100 text-08]
# Operadores
@snapend

+++
## Operadores Lógicos

+++
@snap[text-08]
## Operadores Aritméticos
@snapend
@snap[span-100]
Podemos formar expresiones aritméticas mediante los operadores:
@snapend
@snap[span-100]
@ul[text-blue]
* + @css[text-black](Suma)
* - @css[text-black](Resta)
* * @css[text-black](Multiplicación)
* / @css[text-black](División)
* % @css[text-black](Módulo o residuo)
@ulend
@snapend

+++?code=assets/src/operations.java&lang=java
@[1-4, zoom-20](Declaraciones iniciales)
@[6-8, zoom-20](Multiplicamos "hoursWorked" y "payRate", almacenamos el resultado en "pay".)
@[1-8]()

@snap[south-east span-100 fragment]
## Output!
![](assets/img/output_expression.png)
@snapend

+++
## División
@snap[span-100 text-08]
@css[text-pink](IMPORTANTE!!!)
<br>
Cuando ambos operandos son de tipo `int`, el símbolo (@css[text-blue]( / )) indica una división entera. El resultado se trunca:
<br>
`9 / 2 = 4` 
<br>
`100 / 99 = 0`
<br><br>
@snapend
@snap[span-100 text-08 fragment]
Cuando por lo menos algun operando de la división es de tipo `double` o `float`, se hace división decimal. El resultado contará con una parte decimal:
<br>
`9 / 2.0 = 4.5` 
<br>
`100.0 / 99 = 1.0101010101010102` 
@snapend

+++
## Módulo
@snap[span-100 text-08]
El operador de @css[text-blue](módulo) (@css[text-blue](%)) calcula el residuo después de una división entera.
<br><br>
`9 % 2 = 1`
<br>
`17 % 3 = 2`
<br><br>
Este operador tiene muchos usos, por ejemplo @css[text-blue](verificar si un número es par o impar).
@snapend 

+++ 
@snap[span-100 text-08]
## Operadores Incrementales y Decrementales
Hay instrucciones especiales en Java que nos permiten incrementar el valor de una variable en 1. Estos se identifican mediante @css[text-blue](++) y @css[text-blue](--). Por ejemplo, asumiento que count es una variable numérica: 
@snapend
 
@snap[span-50 text-08 text-center]
<br>
`count++`<br>
`++count`<br>
`count--`<br>
`--count`<br>
@snapend

@snap[span-60 south-east text-center fragment text-07 bg-orange]
@color[white](Cuando el operador está antes de la variable, se actualiza el contenido de la variable antes de evaluar la expresión.<br><br> Cuando el operador está después, se evalúa la expresión y después se actualiza la variable.)
@snapend

+++?code=assets/src/operadores.java&lang=java
@[1]("m" tiene un valor de 4.)
@[1-2](Al evaluar la asignación, primero se actualiza el valor de "m", y después se evalúa la multiplicación. result = 3 x 5)
@[1-6]

@[9](n tiene un valor inicial de 4)
@[9-10]
@[9-13](Al evaluar la asignación, primero se evalúa la multiplicación 3 x 4, y luego se incrementa el valor de "n")

+++?code=assets/src/Operators1.java&lang=java
@[5] (DESPUES: a = 34)
@[6] (DESPUES: b = 21)
@[5] (ANTES: a = 34, b = 22 || c = 34 + 22 || a = 35, b = 22)


---
@snap[midpoint span-100]
## Bloques
@snapend

+++
## Bloques
Un bloque es una sección de código encapsulada por @css[text-blue](llaves) ( @css[text-blue]({ }) ). 

Un bloque no indica alguna instrucción, sino sirve para indicar el inicio o fin de algun grupo de instrucciones.

Cada llave de apertura debe ser posteriormente cerrada por una llave opuesta:

+++?code=assets/src/Test.java
@snap[south span-100 text-center]
Las llaves se pueden acomodar en una misma línea. (Esto es lo más común!)
@snapend
+++
```java
public class Test 
  {
  public static void main(String[] args) 
  {
    System.out.println("Hello, World!");
  }
}
```
@snap[south span-100 text-center]
¡O en líneas distintas!
@snapend
---