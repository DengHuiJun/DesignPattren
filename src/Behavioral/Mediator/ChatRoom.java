package Behavioral.Mediator;

import java.util.Date;

/**
 * Created by zero on 15-9-10.
 */
public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString()
                + " [" + user.getName() +"] : " + message);
    }
}
