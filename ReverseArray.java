import java.lang.StringBuffer;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
            for(int i =arr.length-1; i >= 0; i--){
                System.out.print(arr[i]);
            }
            System.out.println();
            String [] names = {"Harry", "Ron", "Hermione"};



               for (int i = names.length-1; i >= 0; i-- ){
                   StringBuffer name =new StringBuffer(names[i]);
                   name.reverse();
                   System.out.printf("%s ", name);
               }




    }

}
