public class EjecutarEstudiante {
    public static void main(String[] args) {
       //Creacion de La Clase Estudiante
      Estudiante objE = new Estudiante();

      //Arreglo de Objetos
        Estudiante[] est = new Estudiante[4];
        est [0] = new Estudiante("Juan", 3, "Ingenieria de Sistemas",3.8, 20);
        est [1] = new Estudiante("Miguel", 4, "Ingenieria de Sistemas",3.2, 21);
        est [2] = new Estudiante("Clara", 5, "Ingenieria de Sistemas",4.8, 24);
        est [3] = new Estudiante("Laura", 6, "Ingenieria de Sistemas",3.5, 29);
   
        System.out.println(est[2]);
    
   
       for ( int i = 0; i < est.length; i++){
         System.out.println(est[i].getNombre() + "  --> " + est[i].getPrograma());
       }
        //Promedio General de Las Notas de loS Estudiantes
       double sumaNota = 0.0;
       for ( int i = 0; i < est.length; i++){
           sumaNota += est[i].getNotaPromedio();
       }
       System.out.println(sumaNota / est.length);

       //Almacenr el Arreglo de edades de la edad de lños Estudiantes
       int[] edades = new int[est.length];
       for(int i = 0; i < edades.length; i++){
         edades[i] = est[i].getEdad();
       }
       
       //Uso del metodo CalcularEdadPromedio
       System.out.println(objE.calcularEdadPromedio(edades));

       

    }
}
