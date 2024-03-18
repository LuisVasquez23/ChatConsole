package user;

import mediator.ChatMediator;
import mediator.User;


public class ChatUser extends User {
    
    public ChatUser(ChatMediator mediator, String name){
        super(mediator, name);
    }

    @Override
    public void send(String mensaje) {
        System.out.println(this.name + " enviando mensaje: " + mensaje);
        mediator.sendMessage(mensaje, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(this.name + " recibiendo mensaje: " + message);
    }
    
    
    
    
}
