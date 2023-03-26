import java.util.*;
class Collections2
{
    public static void main(String args[]){
        ArrayList<String> alist=new ArrayList<String>();
        alist.add("Steve");
        alist.add("Vinay");
        alist.add("Jyothi");
        alist.add("Ranjitha");
        alist.add("Ravi");
        alist.add(3,"Pavan");
        System.out.println(alist);
    
        Collections.sort(alist);
        alist.set(0, "Pavankalyan");
        System.out.println("Using For Each:");
        for(String str:alist)
        System.out.println(str);
        System.out.println("After Getting Elements:");
        System.out.println(alist.get(2));
        System.out.println("After Remove Elements:");
        alist.remove("Ravi");
        alist.remove(4);
        System.out.println("Using Iterator Class:");
        Iterator itr=alist.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
            }
            System.out.println("The Elements in an Array is:");
            for(int i=0;i<alist.size();i++)
            {
                System.out.println(alist.get(i));
                }
                }
}