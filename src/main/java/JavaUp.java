/**
 * Created by bloom on 2018/4/19.
 */
public class JavaUp {
    public static void main(String Args[]){
        String str = "ffg1759d45";
        str = str.replaceAll("[^0-9]"," ");
        System.out.println("str1:" + str);
        str = str.trim();
        System.out.println("str2:" + str);
        String[] arr = str.split(" ");
        System.out.println("arr:" + arr);
        int length = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].length()<=length)
                continue;
            length = arr[i].length();
        }
        System.out.println(length);
    }
}
