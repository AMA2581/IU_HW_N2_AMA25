package one;

public class EmailCheck {

    /* it only supports yahoo and gmail and outlook
       services */
    private static final String yahoo = "yahoo.com";
    private static final String gmail = "gmail.com";
    private static final String outlook = "outlook.com";

    private boolean capCheck(String str) {
        char ch;
        boolean capFlag = false;

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (Character.isUpperCase(ch)){
                capFlag = true;
            }
            if (capFlag){
                return true;
            }
        }
        return false;
    }

    public boolean emailCheck(String email) {
        
        // checking minimum requierments for a valid email
        if (email.contains("@")) {
            if (email.contains(yahoo) || email.contains(gmail) || email.contains(outlook)) {
                
                //if the input has space, returns false
                if (!email.contains(" ")){
                    
                    if(!capCheck(email)){
                        return true;
                    }

                    else{
                        return false;
                    }
                } 
                
                else {
                    return false;
                }
            }

            else{
                System.out.println("Email address not supported yet");
                return false;
            }
        }

        else{
            return false;
        }

    }
    
}
