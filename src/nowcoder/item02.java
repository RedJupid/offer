package nowcoder;

public class item02 {

    public static String replaceSpace(StringBuffer str) {
        int num =0;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)==' '){
                num++;
            }
        }
        int fi=str.length()-1;
        int se=str.length()+num*2-1;
        str.setLength(se+1);
        for (int i=fi;i>=0;i--){
            if (str.charAt(i)==' '){
                str.setCharAt(se--,'0');
                str.setCharAt(se--,'2');
                str.setCharAt(se--, '%');
            }else{
                str.setCharAt(se--,str.charAt(i));
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("We Are Happy");
        System.out.println(replaceSpace(sb));
    }
}
