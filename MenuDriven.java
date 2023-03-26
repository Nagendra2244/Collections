import java.io.*;
import java.util.*;
public class MenuDriven
{
 public static void main(String args[])
 {
 BufferedReader br;
 String str;
 char ch;
 LinkedList list=new LinkedList();
 while(true)
 {
 System.out.println("1.Add Item");
 System.out.println("2.Remove Item");
 System.out.println("3.Display Item");
 System.out.println("4.Exit");
 try {
 br=new BufferedReader(new InputStreamReader(System.in));
 System.out.print("Choose Your Choice:");
 str=br.readLine();
 ch=str.charAt(0);
 switch(ch)
 {
case '1':
 System.out.print("Enter Element..>");
 str=br.readLine();
 list.add(str);
 System.out.println("Item ..>"+str+"...is added");
break;
 case '2':
 System.out.print("Enter Element..>");
 str=br.readLine();
 if(list.remove(str))
System.out.println("Item is Removed..");
else
System.out.println("Item not found..>");
break;
case '3':
for(int i=0;i<list.size();i++)
System.out.println(list.get(i));
break;
 case '4':
System.exit(0);
 default:
 System.out.println("Wrong Choice..>");
 break;
 }
 }catch(Exception e)
 {
System.out.println("IOException....."+e.getMessage());
 }
 }
}
}

