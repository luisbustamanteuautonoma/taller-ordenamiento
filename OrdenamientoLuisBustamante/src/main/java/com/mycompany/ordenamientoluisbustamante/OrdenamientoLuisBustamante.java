package com.mycompany.ordenamientoluisbustamante;

import java.util.Scanner;

public class OrdenamientoLuisBustamante {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        menu menu = new menu();
        int op = 0;
        do {
            System.out.println("Elija una opcion:");
            System.out.println("1. Acceder al menu 1");
            System.out.println("2. Acceder al menu 2");
            System.out.println("3. Salir");
            System.out.print("Digite su opcion: ");
            op = scanner.nextInt();
            switch (op) {
                case 1:
                    menu.menu1();
                    break;
                case 2:
                    menu.menu2();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opcion invalida. Ingrese nuevamente");
            }
        } while (op != 3);
        System.out.println("Hasta prontoo");
    }
}
