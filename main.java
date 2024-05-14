import java.util.Arrays;
import java.util.ArrayList;

class Solution{
    public static String[] validEmailList(String[] emailList){
        // 関数を完成させてください

        ArrayList<String> resultList = new ArrayList<String>(); 

        for(int i = 0; i < emailList.length; i++){

            if(isEmailValid(emailList[i])) resultList.add(emailList[i]);

            System.out.println("i:"+ isEmailValid(emailList[i]));
        }

        //結果を固定長配列に格納
        String[] result = new String[resultList.size()];

        for(int i = 0; i < result.length; i++){
            result[i] = resultList.get(i);
        }

        return result;
    }

    public static boolean isEmailValid(String email){

        int count = 0;

        // '.' の位置
        int dt = -1;

        // '@' の位置
        int at = -1;

        //@が先頭の時はfale
        if(email.charAt(0) == '@') return false;

        for(int i = 0; i < email.length(); i++){

            if(email.charAt(i) == '@') {
                at = i;
                count += 1;
            }else if(email.charAt(i) == '.'){
                dt = i;
            }

            //@が2つ以上はfalse
            
        }    

        // '@' が1つでない場合は false
        if(count != 1) return false;


        // '.' が '@' より後ろにある場合は false
        if(dt > at){
            return false;
        }

        // '@' が先頭にある場合は false
        if(at == 0){
            return false;
        }    

        return true;

        //@が何個あるのか

        //@と.のインデックスの位置で判定

        //@がインデックス0でないこと

    }
}

