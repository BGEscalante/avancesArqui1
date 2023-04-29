
package Conversor;

import java.util.Scanner;

/**
 *
 * @author bg3
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Conversiones Conversor = new Conversiones();
Validar Validar = new Validar();  
Scanner scanner = new Scanner(System.in);

        System.out.println("1. Binario a octal\n" +
        "2. Binario a decimal\n" +
        "3. Binario a hexadecimal\n" +
        "4. Octal a binario\n" +
        "5. Octal a decimal\n" +
        "6. Octal a hexadecimal\n" +
        "7. Decimal a binario\n" +
        "8. Decimal a octal\n" +
        "9. Decimal a hexadecimal\n" +
        "10. Hexadecimal a binario\n" +
        "11. Hexadecimal a octal\n" +
        "12. Hexadecimal a decimal\n" +
        "Seleccione: ");

int eleccion = sc.nextInt();
if (eleccion < 1 || eleccion > 12) {
    System.out.println("Elección no válida");
    return;
}

switch (eleccion) {
    case 1:
        System.out.println("Ingrese número binario:");
        int binario = scanner.nextInt();
        if (!Validar.validarBinario(binario)) {
            System.out.println("Número no válido");
            return;
        }
        int decimal = Conversor.binarioADecimal(binario);
        String octalResultante = Conversor.decimalAOctal(decimal);
        System.out.println("El octal es " + octalResultante);
        break;
    case 2:
        System.out.println("Ingrese número binario:");
        binario = scanner.nextInt();
        if (!Validar.validarBinario(binario)) {
            System.out.println("Número no válido");
            return;
        }
        decimal = Conversor.binarioADecimal(binario);
        System.out.println("El decimal es " + decimal);
        break;

    case 3:
        System.out.println("Ingrese número binario:");
        binario = scanner.nextInt();
        if (!Validar.validarBinario(binario)) {
            System.out.println("Número no válido");
            return;
        }
        decimal = Conversor.binarioADecimal(binario);
        String hexadecimal = Conversor.decimalAHexadecimal(decimal);
        System.out.println("El hexadecimal es " + hexadecimal);
        break;
    case 4:
        System.out.println("Ingrese número octal:");
        int octal = scanner.nextInt();
        if (!Validar.validarOctal(octal)) {
            System.out.println("Número no válido");
            return;
        }
        decimal = Conversor.octalADecimal(octal);
        String binarioResultante = Conversor.decimalABinario(decimal);
        System.out.println("El binario es " + binarioResultante);
        break;
    case 5:
        System.out.println("Ingrese número octal:");
        octal = scanner.nextInt();
        if (!Validar.validarOctal(octal)) {
            System.out.println("Número no válido");
            return;
        }
        decimal = Conversor.octalADecimal(octal);
        System.out.println("El decimal es " + decimal);
        break;
    case 6:
        System.out.println("Ingrese número octal:");
        octal = scanner.nextInt();
        if (!Validar.validarOctal(octal)) {
            System.out.println("Número no válido");
            return;
        }
        decimal = Conversor.octalADecimal(octal);
        String hexadecimalResultante = Conversor.decimalAHexadecimal(decimal);
        System.out.println("El hexadecimal es " + hexadecimalResultante);
        break;
    case 7:
        System.out.println("Ingrese número decimal:");
        decimal = scanner.nextInt();
        if (!Validar.validarDecimal(decimal)) {
            System.out.println("Número no válido");
            return;
        }
        binarioResultante = Conversor.decimalABinario(decimal);
        System.out.println("El binario es " + binarioResultante);
        break;
    case 8:
        System.out.println("Ingrese número decimal:");
        decimal = scanner.nextInt();
        if (!Validar.validarDecimal(decimal)) {
            System.out.println("Número no válido");
            return;
        }
        octalResultante = Conversor.decimalAOctal(decimal);
        System.out.println("El octal es " + octalResultante);
        break;
    case 9:
        System.out.println("Ingrese número decimal:");
        decimal = scanner.nextInt();
        if (!Validar.validarDecimal(decimal)) {
            System.out.println("Número no válido");
            return;
        }
        hexadecimalResultante = Conversor.decimalAHexadecimal(decimal);
        System.out.println("El hexadecimal es " + hexadecimalResultante);
        break;
    case 10:
        System.out.println("Ingrese número hexadecimal:");
        hexadecimal = scanner.nextLine().toUpperCase();
        if (!Validar.validarHexadecimal(hexadecimal)) {
            System.out.println("Número no válido");
            return;
        }
        decimal = Conversor.hexadecimalADecimal(hexadecimal);
        binarioResultante = Conversor.decimalABinario(decimal);
        System.out.println("El binario es " + binarioResultante);
        break;
    case 11:
        System.out.println("Ingrese número hexadecimal:");
        hexadecimal = scanner.nextLine().toUpperCase();
        if (!Validar.validarHexadecimal(hexadecimal)) {
            System.out.println("Número no válido");
            return;
        }
        decimal = Conversor.hexadecimalADecimal(hexadecimal);
        octalResultante = Conversor.decimalAOctal(decimal);
        System.out.println("El octal es " + octalResultante);
        break;
    case 12:
        System.out.println("Ingrese número hexadecimal:");
        hexadecimal = scanner.nextLine().toUpperCase();
        if (!Validar.validarHexadecimal(hexadecimal)) {
            System.out.println("Número no válido");
            return;
        }
        decimal = Conversor.hexadecimalADecimal(hexadecimal);
        System.out.println("El decimal es " + decimal);
        break;
}
    }
    
}
