package MezclasEnGit;
public class Main{
    public static void main(String[] args) {

        System.out.println("Primer comentario de Laura");
        System.out.println("Mejor mi Primer comentario Alan");  
        System.out.println("Único y segundo comentario de XLAURAX, mejor de ALAN");
    }

    public static double[] SumaRestaVectores (int opcion, double[] vector1, double[] vector2) {

        double[] vector_resultante = new double[vector1.length];

        for (int i = 0; i < vector_resultante.length; i++) {

            if (opcion == 1) {
                vector_resultante[i] = vector1[i] + vector2[i];
        
            }else{
                vector_resultante[i] = vector1[i] - vector2[i];

            }
        }
        return vector_resultante;
    }

    public static double[] VectorPorEscalar (double escalar, double[] vector) {

        double[] vector_resultante = new double [vector.length];

        for (int i = 0; i < vector.length; i++) {
            
            vector_resultante[i] = vector[i] * escalar;
        }
        return vector_resultante;
    }
    
}