
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author engin
 */
public class example3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("n sayısını giriniz");
       int n = input.nextInt();
       int[][] a=new int[n][n];
       System.out.println("A matrisi: ");
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n; j++) {
               System.out.print(i+1 +" inci satır ve "+(j+1)+" inci sutun: ");
               a[i][j]=input.nextInt();
            }
        }
        int sum=0;
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n; j++) {
               if(j>i)
               {
                 sum+=a[i][j];
               }
            }
        }
        System.out.println(sum);
    }
    
}
