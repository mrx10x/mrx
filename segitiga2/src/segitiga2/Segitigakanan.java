/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package segitiga2;

/**
 *
 * @author MRX
 */
public class Segitigakanan {

    public static void main(String[] args) {

//z=baris , x=spasi , y=bintang jml=jumlah
        
    int z, x, y, jml;
    jml = 5;


    for (z=1; z<=jml; z++){
                for (x=jml; x>=z; x--){
                    System.out.print(" ");
                }
                for (y=1; y<=z; y++){
                    System.out.print("*");
                }
        System.out.print("\n");
        }
    }
} 