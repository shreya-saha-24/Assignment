package p2;

public class UserDataApp {

    User allUsers[] = new User[5];
    int indexCount = 0;
   UserService userService = new UserService();

   public boolean addUser(int userId,String firstname, String lastname, String email) {

       boolean insertStatus = false;
       boolean isValid = userService.doEmailDomainVerification(email);
       if(isValid) {
           // create user Object through constructor , pass all three arguments
    	   User newuser=new User(userId,firstname,lastname,email);
    	   allUsers[indexCount]=newuser;
    	   indexCount++;
    	   insertStatus=true;

           // insert user object in allUsers[]

           // change insert status to true
       }
       return insertStatus;

   }

   public User getUserBasedOnId(int userId){
       //Write code to search user from allUsers based on given UserId
	   for(User user:allUsers)
	   {
		   if(user!=null && user.getUserId()==userId)
		   {
			   return user;
		   }
	   }
       return null;
   }
   public boolean verifyEmailAndUserDetails(int userId)
   {
//	   boolean isOk=false;
       User user = getUserBasedOnId(userId);
       if(user!=null)
       {
           // write code to verify that user email contains their firstName & lastName , through using
           // UserService isWordContains() method
           /* Sample output
           * for example
           * User Name is : Rahul Kumar
           * Email : rahul@gmail.com : it should return false
            *Email : rKumar@gmail.com : it should return false
            * Email : abc@gmail.com : it should return false
            *
            *Email : rahul.kumar@gmail.com : it should return true
            *Email : rahul.kumar.1@gmail.com : it should return true
            * Email : abc.rahul.kumar@gmail.com : it should return true
            *
           * */
    	   String email = user.getEmail();
//    	   String firstname=user.getFirstName();
//    	   String lastname=user.getLastName();
    	   String userName=userService.getUserName(email);
    	   boolean isContain=userService.isWordContains(user.getFirstName(), userName);
    	   boolean isContain2=userService.isWordContains(user.getLastName(), userName);
    	   if(isContain && isContain2)
    		   return true;
    	   
       }
       return false;
    
       
   }

   public int countEmailsBasedOnDomain(String domainName)
   {
	  int count = 0;
	  for(User user:allUsers)
		  if(user!=null)
			  if(user.getEmail().contains(domainName))
				  count++;

		  
       // count the number of emails related to that domainName , write code inside emialService

       // send back the count number
       return count;
   }

    public static void main(String[] args) {

       UserDataApp app = new UserDataApp();

       boolean isInserted = app.addUser(101,"rahul","kumar","rahul@gmail.com");
       System.out.println(isInserted);// should print false;

        // also write case to print true;

        //---------------------------------------------------

        int count = app.countEmailsBasedOnDomain("gmail.com");
        System.out.println("Domain Name : Gmail.com \t Available emails : "+count);

        //---------------------------------------

        boolean isConsist = app.verifyEmailAndUserDetails(101);
        System.out.println("Is Consist "+isConsist);
   }

}
