public class AddArray {
    public static void main(String[] args) {
        //动态的添加数据
        int[] arr ={1,2,3};
        int[] arr2 = new int[arr.length+1];
        for (int i = 0;i < arr.length;i++){
            arr2[i] = arr[i];
        }
        arr2[arr2.length-1] = 4;
        arr =arr2;
        for (int i = 0;i < arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}
