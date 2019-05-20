package nowcoder;

public class item01 {

    public static boolean find(int target, int [][] array) {
        int c=0, r=array.length-1;
        while(r>=0 && c<array[0].length){
            if (array[r][c] == target){
                return true;
            }else if (array[r][c]>target){
                r--;
            }else{
                c++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int a[][] = {
                {1,5,8,15},
                {2,7,9,20},
                {3,10,12,33}
        };
        System.out.println(find(9,a));
    }
}
