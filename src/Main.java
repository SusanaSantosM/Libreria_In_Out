import com.Susana.libreria.Entrada;
import com.Susana.libreria.Salida;

public class Main {
    public static void main(String[] args) {
        //com.Susana.libreria.Entrada.CONSOLA("Hola,escribe un numero float");
        Salida.CONSOLA(Entrada.CONSOLA("Ingresa un float"));

       // com.Susana.libreria.Entrada.VENTANA("Ingresa un numero float");
        Salida.VENTANA(Entrada.VENTANA("Ingrese un numero float"));

    }
}