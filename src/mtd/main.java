/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mtd;

/**
 *
 * @author hecto
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        mtd OpMat=new mtd();
        mtd OpMat2=new mtd();
        double [][] A,B,C,D;
        System.out.println("Matriz original.");
        A=OpMat.StringAMatriz("3,-2,5;2,4,-1;-7,-3,-4");
        System.out.println(OpMat.ImprimirMatriz(A));
        System.out.println("Método Gauss.");
        B=OpMat.gauss(A);
        System.out.println(OpMat.ImprimirMatriz(B));
        System.out.println("Matriz original.");
        C=OpMat.StringAMatriz("3,-2,5;2,4,-1;-7,-3,4");
        System.out.println(OpMat2.ImprimirMatriz(C));
        System.out.println("Método Gauss-Jordan.");
        D=OpMat2.gaussJordan(C);
        System.out.println(OpMat2.ImprimirMatriz(D));
    }
    
}
