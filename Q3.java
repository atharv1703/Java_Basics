import java.util.Scanner;

class Q3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int size;

        System.out.println("Enter Size: ");
        size = sc.nextInt();
        
        int arr[] = new int[size];

        for (var i = 0; i < arr.length; i++) {
            
            arr[i] = sc.nextInt();
        }

        System.out.println("Sorted Array:");
        int n = arr.length;  
        int temp = 0;  
        for(int i=0; i < n; i++)
        {  
            for(int j=1; j < (n-i); j++)
            {  
                if(arr[j-1] > arr[j])
                {  
                    temp = arr[j-1];  
                    arr[j-1] = arr[j];  
                    arr[j] = temp;  
                }
            }
        } 

        for (var i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        sc.close();                
        }
    }

