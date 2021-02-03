import java.util.Scanner;

class Q6 {
    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        int array[][] = new int[3][3];

        for (var i = 0; i < 3; i++) {
            for (var j = 0; j < 3; j++) {
                array[i][j]=sc.nextInt();
            }
            
        }

        int sum1=0;
        int sum2=0;

        for (var i = 0; i < 3; i++) {
            for (var j = 0; j < 3; j++) {
                
                if (i==j) {
                    sum1 = sum1 + array[i][j];
                }
            }
            
        }
        
        for (var i = 0; i < 3; i++) {
            for (var j = 0; j < 3; j++) {
                
                if (i==(2-j)) {
                    sum2 = sum2 + array[i][j];
                }
            }
            
        }

        System.out.println("Left Diagonal Sum: "+ sum1);
        System.out.println("Right Diagonal Sum: "+ sum2);

        sc.close();
    }
}
