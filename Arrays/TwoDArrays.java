package Arrays;
import java.util.*;

//2=D arrays are the matrix.It has rows and columns(row,column)
// type[][] arrayname=new type[row][column]

public class TwoDArrays {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int [][] numbers=new int[rows][cols];
        //input
        for(int i=0;i<rows;i++){//rows
            for(int j=0;j<cols;j++){//cols
                numbers[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++){//rows
            for(int j=0;j<cols;j++){//cols
                System.out.print(numbers[i][j]+" ");;
            }
            System.out.println();
        }

    }
    
}
