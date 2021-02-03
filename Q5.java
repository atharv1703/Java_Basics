import java.util.*;

class Q5 {
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int size;

    System.out.println("Enter Size: ");
    size = sc.nextInt();

    int arr[] = new int[size];

    for (int i = 0; i < size; i++) {
        arr[i]=sc.nextInt();
    }
    
    System.out.println("Number : Occurance");
    for (int i = 0; i < size; i++) {
        int count = 1;

        if (arr[i]!=-1) {
            
            for (int j = i+1; j < size; j++) {

                if(arr[i]==arr[j])
                    {
                        count++;
                        arr[j]=-1;
                    }
            } 
        System.out.println(arr[i] + " : " + count);
        }
    }
    sc.close();
}

}
