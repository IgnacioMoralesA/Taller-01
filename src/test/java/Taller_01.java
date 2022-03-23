public class Taller_01 {
    public static void main(String[] args) {
        menu();
    }
    private static void menu(){
        int i = (int) ((Math.random()*20)+1);
        int[] arreglo = new int[i];
        llenarC(arreglo);// llena el arreglo hasta 15
        mostrararr(arreglo);
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
