package mediator_pattern_example;

public class Main {
    public static void main(String[] args) {
        TextChat chat = new TextChat();

        User admin = new Admin(chat);
        User simpleUser = new SimpleUser(chat);
        User simpleUser2 = new SimpleUser(chat);

        chat.setAdmin(admin);
        chat.addUser(simpleUser);
        chat.addUser(simpleUser2);

        simpleUser.sendMessage("hi i am user1");
        admin.sendMessage("admin enter chat!");
    }
}
