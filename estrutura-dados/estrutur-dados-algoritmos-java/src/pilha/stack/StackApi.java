package pilha.stack;

import java.util.Stack;

public class StackApi {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        System.out.println(stack.isEmpty());

        stack.push(1); // Empilha
        stack.push(2);
        stack.push(3);

        System.out.println(stack.isEmpty()); // Retorna true caso vazio
        System.out.println(stack.size()); // Verifica tamanho
        System.out.println(stack);

        System.out.println(stack.peek()); // Mostra elemento do topo da pilha

        System.out.println(stack.pop()); // Remove elemento do topo da pilha

        System.out.println(stack);
    }
}
