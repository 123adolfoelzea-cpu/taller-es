package semana2;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        //Forma1 -> Definiendo dierctamente Los valores del arreglo
        int[] a ={4, 8, 9, 6, 1, 2, 10};
        //iterar los elementos del arreglo
        for(int i=0; i< a.length; i++){
            System.out.println("a["+ i +"]="+ a[i]);
        }
        // Sumar los numeros pares e impares del arreglo y mostrar el resultado
        int sumaPares = 0, sumaImpares = 0;
        for(int i=0; i< a.length; i++){
            if (a[i]%2 == 0){
                sumaPares += a[i];
            }else{
                sumaImpares += a[i];
            }
        }

        System.out.println(" Suma Pares = " + sumaPares + " Suma Impares = " + sumaImpares);

        //Forma 2 -> Declarando el arreglo y definiendo el tamaño
        int[] b = new int[10];

        
    }
}
