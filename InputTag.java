import java.util.*;
import java.util.regex.*;

public class InputTag {
	
	public static void main(String[] args){
	      
	      Scanner sc = new Scanner(System.in);
	      int testCases = Integer.parseInt(sc.nextLine());
	      while(testCases>0){
	         String line = sc.nextLine();            
	        Pattern p = Pattern.compile("((<([^<>\\/]+)>)+)([^<>\\/]+)((<\\/\\3>)+)");
	        Matcher m = p.matcher(line);
	        boolean flag = false;
	        while(m.find()){
	             System.out.println(m.group(4));
	            flag = true;
	        }
	        if(!flag){
	            System.out.println("None");
	        }
	        testCases--;
	      }
	   }
}