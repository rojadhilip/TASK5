package array;

public class hpyramid {
    public static void main(String[] args){
        int rows =4;
        int number=1;
        for (int i=1;i<=rows;i++){
            //print spaces
            for(int j=1;j<=rows-i;j++){
                System.out.print("");
            }
            //print numbers
            for(int k=1; k<=i;k++){
                System.out.print(number+"");
                number++;
            }
            System.out.println();
        }
    }
}       