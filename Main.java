/*Negro hp
 * Altanero 
 * Yubii
 * Indio carechimba
 * Bobo hp
 */
public class Main{
    public static void main(String[] args) {
        System.out.println("Primer merge Alan");
        System.out.println("Primer comentario rama de Lauraa");
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
    
}