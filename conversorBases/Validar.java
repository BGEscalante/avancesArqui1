
package Conversor;

/**
 *
 * @author bg3
 */
public class Validar {
    // Validadores
public static boolean validarDecimal(int decimal) {
    // Decimal pasa la validación con el hecho de que sea entero
    return true;
}

public static boolean validarBinario(int binario) {
    // Comprobar si solo se compone de unos y ceros
    String binarioComoCadena = String.valueOf(binario);
    for (int i = 0; i < binarioComoCadena.length(); i++) {
        char caracter = binarioComoCadena.charAt(i);
        if (caracter != '0' && caracter != '1') {
            return false;
        }
    }
    return true;
}

public static boolean validarOctal(int octal) {
    // comprobar si solo tiene números del 0 al 7
    String octalComoCadena = String.valueOf(octal);
    String caracteresOctales = "01234567";
    for (int i = 0; i < octalComoCadena.length(); i++) {
        char caracter = octalComoCadena.charAt(i);
     
        if (caracteresOctales.indexOf(caracter) == -1) {
            return false;
        }
    }
    return true;
}

public static boolean validarHexadecimal(String hexadecimal) {
    // Comprobar números del 0 al 9 y letras de la A a la F
    String caracteresHexadecimales = "0123456789ABCDEF";
    for (int i = 0; i < hexadecimal.length(); i++) {
        char caracter = hexadecimal.charAt(i);
  
        if (caracteresHexadecimales.indexOf(caracter) == -1) {
            return false;
        }
    }
    return true;
}
}
