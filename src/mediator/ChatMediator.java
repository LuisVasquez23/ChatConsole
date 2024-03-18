package mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements IChatMediator{
    
    private List<User> users;
    
    public ChatMediator(){
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String mensaje, User user) {
        for (User u : users) {
            if(u != user){
                u.receiveMessage(mensaje);
            }
        }
    }

    @Override
    public void addUser(User user) {
       this.users.add(user);
    }
    
    
}
