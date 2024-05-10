package com.mycompany.ordenamientoluisbustamante;

public class Metodos {

    public static void ordenamientoBurbuja(int array[]) {
        int n = array.length;
        int comparaciones = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                comparaciones++;
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    mostrarArray(array);
                }
            }
        }
        System.out.println("Array ordenado:");
        mostrarArray(array);
        System.out.println("Cantidad de comparaciones: " + comparaciones);
    }

    public static void ordenamientoInsercion(int array[]) {
        int n = array.length;
        int comparaciones = 0;
        for (int i = 1; i < n; i++) {
            int clave = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > clave) {
                comparaciones++;
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = clave;
            mostrarArray(array);
        }
        System.out.println("Array ordenado:");
        mostrarArray(array);
        System.out.println("Cantidad de comparaciones: " + comparaciones);
        System.out.println("Complejidad: O(n^2)");
    }

    public static void ordenamientoSeleccion(int array[]) {
        int n = array.length;
        int comparaciones = 0;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                comparaciones++;
                if (array[j] < array[min_idx]) {
                    min_idx = j;
                }
            }
            int temp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = temp;
            mostrarArray(array);
        }
        System.out.println("Array ordenado:");
        mostrarArray(array);
        System.out.println("Cantidad de comparaciones: " + comparaciones);
        System.out.println("Complejidad: O(n^2)");
    }

    public static void ordenamientoShellSort(int array[]) {
        int n = array.length;
        int comparaciones = 0;
        for (int brecha = n / 2; brecha > 0; brecha /= 2) {
            for (int i = brecha; i < n; i++) {
                int temp = array[i];
                int j = i;
                while (j >= brecha && array[j - brecha] > temp) {
                    comparaciones++;
                    array[j] = array[j - brecha];
                    j -= brecha;
                }
                array[j] = temp;
            }
            mostrarArray(array);
        }
        System.out.println("Array ordenado:");
        mostrarArray(array);
        System.out.println("Cantidad de comparaciones: " + comparaciones);
        System.out.println("Complejidad: O(n log n)");
    }

    public static void ordenamientoMergeSort(int array[], int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            ordenamientoMergeSort(array, l, m);
            ordenamientoMergeSort(array, m + 1, r);
            merge(array, l, m, r);
            mostrarArray(array);
        }
    }

    public static void merge(int array[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int izquierda[] = new int[n1];
        int derecha[] = new int[n2];
        for (int i = 0; i < n1; ++i) {
            izquierda[i] = array[l + i];
        }
        for (int j = 0; j < n2; ++j) {
            derecha[j] = array[m + 1 + j];
        }
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (izquierda[i] <= derecha[j]) {
                array[k] = izquierda[i];
                i++;
            } else {
                array[k] = derecha[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            array[k] = izquierda[i];
            i++;
            k++;
        }
        while (j < n2) {
            array[k] = derecha[j];
            j++;
            k++;
        }
    }

    public static void ordenamientoQuickSort(int array[], int bajo, int alto) {
        if (bajo < alto) {
            int pi = particion(array, bajo, alto);
            ordenamientoQuickSort(array, bajo, pi - 1);
            ordenamientoQuickSort(array, pi + 1, alto);
            mostrarArray(array);
        }
    }

    public static int particion(int array[], int bajo, int alto) {
        int pivote = array[alto];
        int i = (bajo - 1);
        for (int j = bajo; j < alto; j++) {
            if (array[j] < pivote) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[alto];
        array[alto] = temp;
        return i + 1;
    }

    public static void mostrarArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void ordenamientoBurbujaPasoAPaso(int array[]) {
        int n = array.length;
        int comparaciones = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                comparaciones++;
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    System.out.println("Paso " + (i * (n - 1) + j + 1) + ":");
                    mostrarArray(array);
                }
            }
        }
        System.out.println("Array ordenado:");
        mostrarArray(array);
        System.out.println("Cantidad de comparaciones: " + comparaciones);
    }

    public static void ordenamientoInsercionPasoAPaso(int array[]) {
        int n = array.length;
        int comparaciones = 0;
        for (int i = 1; i < n; i++) {
            int clave = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > clave) {
                comparaciones++;
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = clave;
            System.out.println("Paso " + i + ":");
            mostrarArray(array);
        }
        System.out.println("Array ordenado:");
        mostrarArray(array);
        System.out.println("Cantidad de comparaciones: " + comparaciones);
        System.out.println("Complejidad: O(n^2)");
    }

    public static void ordenamientoSeleccionPasoAPaso(int array[]) {
        int n = array.length;
        int comparaciones = 0;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                comparaciones++;
                if (array[j] < array[min_idx]) {
                    min_idx = j;
                }
            }
            int temp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = temp;
            System.out.println("Paso " + (i + 1) + ":");
            mostrarArray(array);
        }
        System.out.println("Array ordenado:");
        mostrarArray(array);
        System.out.println("Cantidad de comparaciones: " + comparaciones);
        System.out.println("Complejidad: O(n^2)");
    }

    public static void ordenamientoShellSortPasoAPaso(int array[]) {
        int n = array.length;
        int comparaciones = 0;
        for (int brecha = n / 2; brecha > 0; brecha /= 2) {
            for (int i = brecha; i < n; i++) {
                int temp = array[i];
                int j = i;
                while (j >= brecha && array[j - brecha] > temp) {
                    comparaciones++;
                    array[j] = array[j - brecha];
                    j -= brecha;
                }
                array[j] = temp;
            }
            System.out.println("Array en el paso con brecha " + brecha + ":");
            mostrarArray(array);
        }
        System.out.println("Array ordenado:");
        mostrarArray(array);
        System.out.println("Cantidad de comparaciones: " + comparaciones);
        System.out.println("Complejidad: O(n log n)");
    }

    public static void ordenamientoMergeSortPasoAPaso(int array[], int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            ordenamientoMergeSortPasoAPaso(array, l, m);
            ordenamientoMergeSortPasoAPaso(array, m + 1, r);
            merge(array, l, m, r);
            System.out.println("Array fusionado en el paso:");
            mostrarArray(array);
        }
    }

    public static void ordenamientoQuickSortPasoAPaso(int array[], int bajo, int alto) {
        if (bajo < alto) {
            int pi = particion(array, bajo, alto);
            ordenamientoQuickSortPasoAPaso(array, bajo, pi - 1);
            ordenamientoQuickSortPasoAPaso(array, pi + 1, alto);
            System.out.println("Array en el paso de partición:");
            mostrarArray(array);
        }
    }
}
