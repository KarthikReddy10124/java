// public class Program1 {
//     public static void main(String[] args) {
//         int [][] arr = new int[3][5];

//     }
// }


public class Program1 {
    public static void main(String[] args) {
        int [][] arr = {{1},{4,5,6},{7,8}};
        for(int i = 0;i<arr.length;i++){//rows
            for(int j = 0;j<arr[i].length;j++){//columns
                System.out.print(arr[i][j]+" ");//accessing each column
            }
            System.out.println();
        }
        
    }
}
