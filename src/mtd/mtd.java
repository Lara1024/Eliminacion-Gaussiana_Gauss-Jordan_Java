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
public class mtd {
    
    public double [][] gauss(double [][] Matriz){
        double [][]VMatriz=Matriz;
        double VNumero;
        for(int i=0;i<=VMatriz.length-1;i++){
            VNumero=VMatriz[i][i];
            for(int j=0;j<=VMatriz[0].length-1;j++){
                VMatriz[i][j]=VMatriz[i][j]/VNumero;
            }
            if(i<=VMatriz.length-2){
                for(int j=i+1;j<=VMatriz.length-1;j++){
                    VNumero=VMatriz[j][i];
                    for(int k=0;k<=VMatriz[0].length-1;k++){
                        VMatriz[j][k]=(VMatriz[j][k]-(VNumero*VMatriz[i][k]));
                    }
                }
            }
        }
        return VMatriz;
    }
    
    public double [][] gaussJordan(double [][] Matriz){
        double [][]VMatriz=Matriz;
        double VNumero;
        for(int i=0;i<=VMatriz.length-1;i++){
            VNumero=VMatriz[i][i];
            for(int j=0;j<=VMatriz[0].length-1;j++){
                VMatriz[i][j]=VMatriz[i][j]/VNumero;
            }
            if(i<=VMatriz.length-2){
                for(int j=i+1;j<=VMatriz.length-1;j++){
                    VNumero=VMatriz[j][i];
                    for(int k=0;k<=VMatriz[0].length-1;k++){
                        VMatriz[j][k]=(VMatriz[j][k]-(VNumero*VMatriz[i][k]));
                    }
                }
            }
        }
        for (int i = Matriz.length-1; i>=1;i--) {
            for (int j = i-1; j >= 0; j--) {
                VNumero=VMatriz[j][i];
                for (int k = Matriz[0].length-1; k >= 0; k--) {
                    VMatriz[j][k]=(VMatriz[j][k]-(VNumero*VMatriz[i][k]));
                }
            }
        }
        return VMatriz;
    }
    
    
    
    public double [][] StringAMatriz(String StringMatriz){
        int NumeroFila=1, NumeroColumna=2;
        int contadorFila=0,contadorColumna=0;
        double[][]variableMatriz;
        String numeroC="";
        for(int i=0;i<=StringMatriz.length()-1;i++){
            if(NumeroFila==1){
                if(StringMatriz.charAt(i)==','){
                    NumeroColumna++;
                }
            }
            if(StringMatriz.charAt(i)==';'){
                    NumeroFila++;
            }
        }
        variableMatriz=new double[NumeroFila][NumeroColumna];
        for(int i=0;i<=StringMatriz.length()-1;i++){
            if(Character.isDigit(StringMatriz.charAt(i))){
                numeroC=numeroC+StringMatriz.charAt(i);
            }
            if (StringMatriz.charAt(i)=='-') {
                numeroC=numeroC+StringMatriz.charAt(i);
            }
            if (StringMatriz.charAt(i)=='.') {
                numeroC=numeroC+StringMatriz.charAt(i);
            }
            if (StringMatriz.charAt(i)==','||StringMatriz.charAt(i)==';'||i==StringMatriz.length()-1) {
                variableMatriz[contadorFila][contadorColumna]=Double.parseDouble(numeroC);
                if(StringMatriz.charAt(i)==','){
                    contadorColumna++;
                }
                if(StringMatriz.charAt(i)==';'){
                    contadorFila++;
                    contadorColumna=0;
                }
                numeroC="";
            }
        }
        return variableMatriz;
    }
 
    
    public String ImprimirMatriz(double[][] Matriz){
        String Cadena="";
        for (int i = 0; i <=Matriz.length-1; i++) {
            for (int j = 0; j < Matriz[0].length-1; j++) {
                Cadena=Cadena+String.valueOf(Matriz[i][j])+" ";
            }
            Cadena=Cadena+"\n";
        }
        return Cadena;
    }
}
