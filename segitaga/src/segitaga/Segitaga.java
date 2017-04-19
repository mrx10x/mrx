/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package segitaga;

/**
 *
 * @author MRX
 */
public class Segitaga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//z=baris , x=spasi , y=bintang jml=jumlah
        
    int z, x, y, jml;
    jml = 5;


    for (z=1; z<=jml; z++){
                for (x=jml; x>z; x--){
                    System.out.print(" ");
                }
                for (y=1; y<=z; y++){
                    System.out.print("* s");
                }
        System.out.print("\n");
        }
    }
} 

