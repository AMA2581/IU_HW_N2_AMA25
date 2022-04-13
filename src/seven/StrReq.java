package seven;

public class StrReq {
    
    public boolean checkStr(String str1, String str2){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        
        str1 = str1.replaceAll("\\s", "");
        str2 = str2.replaceAll("\\s", "");

        for(int i = 0; i < str1.length(); i++){
            if(str2.indexOf(str1.charAt(i)) == -1)
                return false;
        }
        for(int i = 0; i < str2.length(); i++){
            if(str1.indexOf(str2.charAt(i)) == -1)
                return false;
        }
        return true;
    
    }
}
