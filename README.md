# UnConsoleAReal

•	El motor de videojuegos consta de dos clases en Java. Una llamada Vista que se encarga de controlar la parte gráfica del juego y que se recomienda no modificar o modificar muy mínimamente, y otra clase llamada ControlJuego que es donde los amantes del desarrollo de aplicaciones de consola en Java pueden programar la lógica de sus propios videojuegos.
•	El motor es un proyecto de netbeans que al ejecutarse despliega una ventana que se ve así:
 
Una vez un jugador presiona una tecla observa algo como lo siguiente:

![Inicio](https://raw.githubusercontent.com/arleserp/UnConsoleAReal/main/UnConsoleAReal/img/Inicial.png)
![Pantalla inicial 2](https://raw.githubusercontent.com/arleserp/UnConsoleAReal/main/UnConsoleAReal/img/Picture2.png)
 
•	Como todo motor de videojuegos se cuenta con un demo básico. El jugador se identifica con la letra O, las X son posiciones donde se puede mover. Las letras N corresponden a enemigos ubicados de forma aleatoria en la pantalla del juego:

![Descripción del demo](https://raw.githubusercontent.com/arleserp/UnConsoleAReal/main/UnConsoleAReal/img/Picture3.png)
 
•	El jugador se mueve con las teclas ASDW y se puede modificar el juego para recibir más acciones:
 
![Movimientos Iniciales Definidos](https://raw.githubusercontent.com/arleserp/UnConsoleAReal/main/UnConsoleAReal/img/Picture4.png)
 

•	Cada vez que el jugador realiza un movimiento, se suma uno al puntaje:

![Imagen Puntaje](https://raw.githubusercontent.com/arleserp/UnConsoleAReal/main/UnConsoleAReal/img/Picture5.png)

•	Al tratar de salir del tablero el juego se traba porque se espera que los desarrolladores controlen los límites del tablero o si quieren lo hagan funcionar como un tablero toroidal donde se puede salir por un lado del tablero y aparecer por otro lado (¡esto se puede hacer con el operador módulo!)

