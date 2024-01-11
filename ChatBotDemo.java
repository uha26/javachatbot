import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ChatBotDemo {

    private Map<String, String> responses;

    public ChatBotDemo() {
        responses = new HashMap<>();
        initializeResponses();
    }

    private void initializeResponses() {
        responses.put("hello", "Hello! How can I help you?");
        responses.put("how are you", "I'm just a computer program, but thanks for asking!");
        responses.put("bye", "Goodbye! Have a great day.");
    }

    public String getResponse(String userMessage) {
        return responses.getOrDefault(userMessage.toLowerCase(), "I'm sorry, I didn't understand that.");
    }

    public void startChat() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Chatbot: Hello! Type 'bye' to exit.");

        while (true) {
            System.out.print("You: ");
            String userMessage = scanner.nextLine();

            if (userMessage.equalsIgnoreCase("bye")) {
                System.out.println("Chatbot: Goodbye!");
                break;
            }

            String botResponse = getResponse(userMessage);
            System.out.println("Chatbot: " + botResponse);
        }

        scanner.close();
    }

    public static void main(String[] args) {
        ChatBotDemo chatbot = new ChatBotDemo();
        chatbot.startChat();
    }
}
