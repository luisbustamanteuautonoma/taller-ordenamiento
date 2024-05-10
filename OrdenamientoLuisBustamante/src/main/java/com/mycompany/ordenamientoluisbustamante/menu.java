package com.mycompany.ordenamientoluisbustamante;

import java.util.Scanner;

public class menu {

    static Scanner scanner = new Scanner(System.in);

    Metodos m = new Metodos();

    public void menu1() {
        int op = 0;

        do {
            int array[] = {54, 26, 93, 17, 77, 31, 44, 55, 20};
            int[] copiaArray = array.clone();
            System.out.println("Array original:");
            m.mostrarArray(array);
            System.out.println("=====================");
            System.out.println("Item 1");
            System.out.println("=====================");
            System.out.println("1. Burbuja");
            System.out.println("2. Insercion");
            System.out.println("3. Seleccion");
            System.out.println("4. ShellShort");
            System.out.println("5. MargeSort");
            System.out.println("6. QuickSort");
            System.out.println("7. Salir");
            System.out.println("Digite su opcion:");
            op = scanner.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Metodo de Burbuja:");
                    m.ordenamientoBurbuja(copiaArray);
                    break;
                case 2:
                    System.out.println("Metodo de Inserción:");
                    m.ordenamientoInsercion(copiaArray);
                    break;
                case 3:
                    System.out.println("Metodo de Selección:");
                    m.ordenamientoSeleccion(copiaArray);
                    break;
                case 4:
                    System.out.println("Metodo de ShellSort:");
                    m.ordenamientoShellSort(copiaArray);
                    break;
                case 5:
                    System.out.println("Metodo de MergeSort:");
                    m.ordenamientoMergeSort(copiaArray, 0, copiaArray.length - 1);
                    break;
                case 6:
                    System.out.println("\nMetodo de QuickSort:");
                    m.ordenamientoQuickSort(copiaArray, 0, copiaArray.length - 1);
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Opcion invalida. Ingrese nuevamente");
                    break;
            }
        } while (op != 7);
        System.out.println("Hasta prontoo");
    }

    public void menu2() {
        int op = 0;

        do {
            int array[] = {54, 26, 93, 17, 77, 31, 44, 55, 20};
            int[] copiaArray = array.clone();
            System.out.println("=====================");
            System.out.println("Item 2");
            System.out.println("=====================");
            System.out.println("1. Burbuja");
            System.out.println("2. Insercion");
            System.out.println("3. Seleccion");
            System.out.println("4. ShellShort");
            System.out.println("5. MargeSort");
            System.out.println("6. QuickSort");
            System.out.println("7. Salir");
            System.out.println("Digite su opcion:");
            op = scanner.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Metodo de Burbuja:");
                    m.ordenamientoBurbujaPasoAPaso(copiaArray);
                    break;
                case 2:
                    System.out.println("Metodo de Inserción:");
                    m.ordenamientoInsercionPasoAPaso(copiaArray);
                    break;
                case 3:
                    System.out.println("Metodo de Selección:");
                    m.ordenamientoSeleccionPasoAPaso(copiaArray);
                    break;
                case 4:
                    System.out.println("Metodo de ShellSort:");
                    m.ordenamientoShellSortPasoAPaso(copiaArray);
                    break;
                case 5:
                    System.out.println("Metodo de MergeSort:");
                    m.ordenamientoMergeSortPasoAPaso(copiaArray, 0, copiaArray.length - 1);
                    break;
                case 6:
                    System.out.println("Metodo de QuickSort:");
                    m.ordenamientoQuickSortPasoAPaso(copiaArray, 0, copiaArray.length - 1);
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Opcion invalida. Ingrese nuevamente");
                    break;
            }
        } while (op != 7);
        System.out.println("Hasta prontoo");
    }
}
