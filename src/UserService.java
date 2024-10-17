package p2;


public class UserService {

    String validDomains[] = {"gmail.com","outlook.com","hotmail.com","zoho.com"};


    public boolean doEmailDomainVerification(String email) {
        boolean verified = false;
//        String[] str=email.split("@");
//        String emailDomain=str[1];
        for(String domain:validDomains)
        {
        	if(email.contains(domain))
        		 verified=true;
        }
        

        // write code here , to verify that email domain  belongs to the given valid domains

        return verified;
    }

    public String getUserName(String email) {
    	String[] str=email.split("@");
    	String localPart=str[0];
    	/*String[] userName=localPart.split("\\.");
    	String formattedName="";
    	for(String name:userName)
    	{
    		if(userName.length>0)
    			formattedName+=name.toLowerCase()+" ";
    	}
    	return formattedName;*/
    	return localPart;
        // write code to retrieve username from email and send back
    }

    public boolean isWordContains(String word,String wholeString) {
        // write code which returns true if wholeString contains word
    	if(wholeString.contains(word))
    		return true;
    	else
    		return false;
    	

        
    }


}
