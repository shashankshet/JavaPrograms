import java.util.Scanner;
class DuplicateChar
{
	// public static void main(String[] args) {
	// 	Scanner s = new Scanner(System.in);
	// 	String str;
	// 	System.out.println("Enter the string: ");
	// 	str = s.nextLine();
	// 	System.out.println("The entered string is: "+str);
	// 	char []carray = str.toCharArray();
	// 	System.out.println("Duplicate Characters is the above string are: ");
	// 	for(int i=0;i<str.length();i++)
	// 	{
	// 		for(int j=i+1;i<str.length();j++)
	// 		{
	// 			if(carray[i]==carray[j])
	// 			{
	// 				System.out.print(carray[j] + "");
	// 				break;
	// 			}
	// 		}
	// 	}
	// }
	     public static void main(String[] args) {  
        String string1 = "Great responsibility";  
        int count;  
          
        //Converts given string into character array  
        char string[] = string1.toCharArray();  
          
        System.out.println("Duplicate characters in a given string: ");  
        //Counts each character present in the string  
        for(int i = 0; i <string.length; i++) {  
            count = 1;  
            for(int j = i+1; j <string.length; j++) {  
                if(string[i] == string[j] && string[i] != ' ') {  
                    count++;  
                    //Set string[j] to 0 to avoid printing visited character  
                    string[j] = '0';  
                }  
            }  
            //A character is considered as duplicate if count is greater than 1  
            if(count > 1 && string[i] != '0')  
                System.out.println(string[i]);  
        }  
    }  
}
