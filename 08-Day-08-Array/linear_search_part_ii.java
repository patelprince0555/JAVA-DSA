
public class linear_search_part_ii {

    public static int linearsearch(String fruits[],String key){
        for(int i =0; i<fruits.length;i++){
            if(fruits[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String fruits[]={"apple","mango","banana","pineapple","orange"};
        String key="orange";
        System.out.println(linearsearch(fruits, key));
        
    }
}
