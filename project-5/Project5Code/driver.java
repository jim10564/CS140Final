
/**
 * Write a description of class driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class driver
{
    public static void main(String[] args){

        int[][] square4x4Magic = {{1,0,0,0},
                {0,1,0,0},
                {0,0,1,0},
                {0,0,0,1}};
        System.out.println();
        //{{0,1,2,3},{0,1,2,3},{0,1,2,3},{0,1,2,3}}
        //System.out.print(MagicSquare.diagonal2Sum(square4x4Magic));

        System.out.print(MagicSquare.diagonal1Sum(square4x4Magic));

    }
    
}
