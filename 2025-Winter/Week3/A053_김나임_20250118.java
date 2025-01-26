import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int numOfCommands = s.nextInt();
            s.nextLine();

            Stack<Integer> stack = new Stack<>();
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < numOfCommands; i++) {
                String command = s.nextLine();
                
                switch (command.split(" ")[0]) {
                    case "push":
                        int value = Integer.parseInt(command.split(" ")[1]);
                        stack.push(value);
                        break;
                    case "pop":
                        result.append(stack.isEmpty() ? -1 : stack.pop()).append("\n");
                        break;
                    case "size":
                        result.append(stack.size()).append("\n");
                        break;
                    case "empty":
                        result.append(stack.isEmpty() ? 1 : 0).append("\n");
                        break;
                    case "top":
                        result.append(stack.isEmpty() ? -1 : stack.peek()).append("\n");
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown command: " + command);
                }
            }

            System.out.print(result);
        }
    }
}