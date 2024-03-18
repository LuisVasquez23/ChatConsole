package mediator;

public interface IChatMediator {
    void sendMessage(String mensaje , User user);
    void addUser(User user);
}
