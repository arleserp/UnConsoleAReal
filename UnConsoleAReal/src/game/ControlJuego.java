/**
 * Esta clase es la que deben modificar para controlar la lógica del juego
 */
package game;

public class ControlJuego {

    public static int posJugF = 5; //posicion inicial del jugador en filas
    public static int posJugC = 0; // posición inicial del jugador en columnas
    public static int nFilas = 11; //numero de filas
    public static int nCols = 32; // numero de columnas 
    public static int puntaje = 0; // variable que controla el puntaje
    static char[][] tablero = new char[nFilas][nCols]; //tablero del juego
    public static boolean gameOver = false; //variable que controla el fin del juego
    public static String nombreJuego = "nombre del juego :v"; //variable que define el nombre del juego

    public static int numeroEnemigos=5; //variable que guarda cuantos enemigos hay
    public static int[] posEneF = new int[numeroEnemigos]; //arreglo de posiciones de los enemigos en Filas
    public static int[] posEneC = new int[numeroEnemigos]; //arreglo de posiciones de los enemigos en Columnas

    /**
     * Esta función inicializa las posiciones de los enemigos en filas,
     * en el arreglo posEneF y las posiciones de los enemigos en columnas 
     * posEneC y los ubica en el tablero con la letra N
     */    
    public static void iniciarEnemigos(){
        for (int i = 0; i < numeroEnemigos; i++) {
            int posEF = (int)(Math.random()*nFilas); //escoge una posición al azar de 0 a nFilas-1
            int posEC = (int)(Math.random()*nCols);  //escoge una posición al azar de 0 a nCols-1
            posEneF[i] = posEF; //guarda la posición en filas del enemigo i
            posEneC[i] = posEC; //guarda la posición en columnas del enemigo i
            tablero[posEF][posEC] = 'N';   //los enemigos se inicializan con N          
        }
    }
    
    /**
     * Esta función inicializa el tablero com una matriz de nFilas X nCols
     * la posición del jugador es la 'O' y los espacios por ahora libres son 'X'
     */
    public static void initTablero() {
        for (int f = 0; f < nFilas; f++) {
            for (int c = 0; c < nCols; c++) {
                tablero[f][c] = 'X';
            }
        }
        tablero[posJugF][posJugC] = 'O'; //pone al jugador
        iniciarEnemigos(); //llama una función que inicia los enemigos
    }

    
    /**
     * Esta función toma el estado del tablero creado como una matriz de 
     * caracteres y retorna la representación de dicho tablero en forma de 
     * String
     * @return una cadena que corresponde al estado del tablero
     */
    public static String mostrarPantalla() {
          
        String t = "";
        for (int f = 0; f < nFilas; f++) {
            for (int c = 0; c < nCols; c++) {
                t += (tablero[f][c]);
                //System.out.print(tablero[f][c]);
            }
            //System.out.println("\n");
            t += "\n";
        }
        return t;
    }

    /**
     * Dada una tecla que el usuario digita, esta función limpia la posición
     * anterior del jugador y actualiza la posición actual de dicho jugador.
     * @param tecla 
     */
    static void mover(char tecla) {
        tablero[posJugF][posJugC] = 'X';
        //System.out.println("tecla" + tecla);
        switch (tecla) {
            case 'A':
            case 'a':
                posJugC--;
                break;
            case 'S':
            case 's':
                posJugF++;
                break;
            case 'D':
            case 'd':
                posJugC++;
                break;
            case 'W':
            case 'w':
                posJugF--;
                break;
        }
        tablero[posJugF][posJugC] = 'O'; 
        puntaje++;
        validarGameOver(); //Si se encuentra una N cambia el estado a GameOver
    }

    /**
     * @return la variable puntaje
     */
    public static int getPuntaje() {
        return puntaje;
    }

    /**
     * 
     * @return la variable booleana que controla que el juego terminó
     */
    public static boolean getGameOver() {
        return gameOver;
    }

    /**
     * Esta función valida que la posición del jugador no sea igual a la de 
     * algún enemigo o pone la variable gameOver en true.
     */
    private static void validarGameOver() {        
        for (int i = 0; i < numeroEnemigos; i++) {
            if(posJugC == posEneC[i] && posJugF == posEneF[i]){
                gameOver = true;
            }
        }        
    }

    /**
     * 
     * @return el nombre del juego para mostrarlo en la interfaz
     */
    public static String getNombreJuego() {
        return nombreJuego;
    }

}
