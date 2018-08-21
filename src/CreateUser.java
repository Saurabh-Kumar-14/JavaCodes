import com.navis.core.User;
import java.util.ArrayList;

public class CreateUser {

    public static void main(String args[]){

        System.out.println("hello");

        User user1 = new User("saurabh","saurabh.xyz"); //1. new crates an instance in memory 2. calling the constructor
                                                                        // 3. returning the reference of the obj of the memory to LHS

        User user2; // this is a reference
        user2 = new User("monica","monika.xyz"); //now its an object

        System.out.println(user1.getUserName());  //instance var are initialized by null value

        int i=0;  //local var must be initialized manually
       // System.out.println(i);

        user1.userName = "saurabh";
        user1.mailId = "saurabh.xyz";

        System.out.println(user2.getUserName());

        user2.setUserName("Monice");

        ArrayList<User> list = new ArrayList<>();   //generics
        list.add(user1);
        list.add(user2);

        System.out.println(list.get(0).getUserName());

    }
}
