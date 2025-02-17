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
            
            vector_resultante[i] = vector[i] *  escalar;
        }
        return vector_resultante;
    }
    
    public static double[] ProductoCruz (double[] vector1, double[] vector2) {

        double[][] matriz_i = {
            {vector1[1], vector1[2]},
            {vector2[1], vector2[2]},
        };

        double[][] matriz_j = {
            {vector1[0], vector1[2]},
            {vector2[0], vector2[2]},
        }; 

        double[][] matriz_k = {
            {vector1[0], vector1[1]},
            {vector2[0], vector2[1]},
        };
        
        double[] vector_resultante = new double [vector1.length];

        vector_resultante[0] = Determinante2x2(matriz_i);
        vector_resultante[1] = Determinante2x2(matriz_j);
        vector_resultante[2] = Determinante2x2(matriz_k);

        return vector_resultante;
    }
}