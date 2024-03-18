package MediadorChat;

import java.util.Scanner;
import mediator.ChatMediator;
import mediator.User;
import user.ChatUser;


public class Main {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediator();
        
        User user1 = new ChatUser(mediator, "User 1");
        User user2 = new ChatUser(mediator, "User 2");
        User user3 = new ChatUser(mediator, "User 3");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter message: ");
            String message = scanner.nextLine();
            if (message.equalsIgnoreCase("exit")) {
                System.out.println("Exiting chat...");
                break;
            }
            user1.send(message);
        }
        scanner.close();
    }
}
