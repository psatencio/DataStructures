/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arrayexcercise;

/**
 *
 * @author cornelius
 */

public class ArrayExcercise {

    
    public static int[] numbers(){
        int[] A = {1,2,3};
        return A;
    }

    public static String[] deleteElement(String[] A, String elem){
        
        int num_elems = 0;

        for(int i = 0; i < A.length; i++){
            if(A[i] == elem){
                num_elems += 1;
            }
        }

        if(num_elems == 0){
            System.out.println("No se encontro el elemento "+elem);
            return null;
        }else{
            System.out.println("Se eliminaran "+num_elems+" elementos.");
        }

        
        String[] B = new String[A.length - num_elems];

        int j = 0;
        for(int i = 0; i < A.length; i++){
            if(A[i] != elem){
                B[j] = A[i];
                j += 1;
            }
        }
        
        return B;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        String[] A = {"Pedro", "Juan", "Diego", "Juan", "Harold", "Pedro","Mauricio", "Martha", "Sandra"};

        String[] B = deleteElement(A, "Pedro");

        
        for(int i=0; i < B.length; i++){
            System.out.println(B[i]);
        }

        


        
    }

}
