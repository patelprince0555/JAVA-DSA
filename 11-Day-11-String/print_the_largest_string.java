public class print_the_largest_string {
public static void main(String[] args) {
    String fruits[]={"mango","apple","banana","orange"};
    String largest=fruits[0];
    for(int i=0;i<fruits.length;i++){
        if(largest.compareToIgnoreCase(fruits[i])<0){
            largest=fruits[i];
        }
    }
    System.out.println(largest);
}
}
