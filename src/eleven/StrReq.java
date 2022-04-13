package eleven;

public class StrReq {
    
    public boolean reverse(String str){
        StringBuilder uStr = new StringBuilder(str);
        StringBuilder rev = uStr.reverse();

        if (uStr.equals(rev)){
            return true;
        }

        else {
            return false;
        }
    }
}
