public class LongestCommonPrefix {
    public static void main(String[] args) {
        String names[] = {"flower","flow","flight"};
        System.out.println(idx(names));
    }
    public static String idx(String names[]){
        String prefix = names[0];
        for(int i=1; i<names.length; i++){
            while(names[i].indexOf(prefix) != 0){
               prefix = prefix.substring(0,prefix.length()-1); 
            }
        }
        return prefix;
    }
}