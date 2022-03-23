/*
crear arreglo
cantidad de celdas en el carrito(random*20) y cantidad de productos(random*15)
precio de productos en el carrito(500+i*150)
sumar los precios de los productos
mostrar cada celda con el total de precios y el precio total
 */
public class Taller_01 {
    public static void main(String[] args) {
        menu();
    }


    private static void menu() {
        int i = (int) ((Math.random()*20)+1);
        int[] arreglo = new int[i];
        llenarC(arreglo);
        mostrararr(arreglo);
        precioP(arreglo);
        mostrararr(arreglo);
        sumaT(arreglo);
    }

    private static void sumaT(int[] array) {
        int Total = 0;
        for (int i=0;i<array.length;i++){
            Total+=array[i];
        }
        mostrarT(Total);
    }

    private static void mostrarT(int total) {
        System.out.println(total);
    }

    private static void precioP(int[] array) {
        for(int i=0;i<array.length;i++){
            array[i]=((500+(i*150))*array[i]);
        }
    }

    private static void llenarC(int[] array) {
        int productos;
        for (int i=0;i<array.length;i++){
           productos = (int) (Math.random()*16);
            array[i]=productos;
       }
    }

    private static void mostrararr(int[] array) {
        for(int i=0;i< array.length;i++){
            System.out.print("["+array[i]+"]");
        }
    }
}
