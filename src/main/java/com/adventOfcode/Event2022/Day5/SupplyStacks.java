package com.adventOfcode.Event2022.Day5;

import java.util.*;

public class SupplyStacks {
    public static void main(String[] args) {

        List<String> instructions = Arrays.asList("move 1 from 7 to 4", "move 3 from 4 to 7", "move 4 from 3 to 4", "move 5 from 6 to 9", "move 1 from 8 to 1", "move 2 from 3 to 2", "move 3 from 4 to 6", "move 1 from 3 to 6", "move 9 from 7 to 1", "move 1 from 2 to 4", "move 3 from 4 to 9", "move 4 from 9 to 8", "move 6 from 8 to 2", "move 1 from 8 to 6", "move 1 from 4 to 1", "move 11 from 1 to 7", "move 1 from 4 to 7", "move 7 from 2 to 5", "move 5 from 6 to 3", "move 2 from 4 to 3", "move 2 from 5 to 9", "move 1 from 8 to 6", "move 3 from 1 to 5", "move 2 from 6 to 9", "move 1 from 4 to 8", "move 2 from 2 to 1", "move 7 from 5 to 9", "move 6 from 3 to 6", "move 1 from 2 to 5", "move 1 from 3 to 8", "move 12 from 7 to 3", "move 1 from 1 to 8", "move 2 from 1 to 9", "move 20 from 9 to 5", "move 1 from 1 to 7", "move 5 from 5 to 3", "move 1 from 8 to 7", "move 2 from 8 to 3", "move 2 from 6 to 5", "move 1 from 6 to 4", "move 18 from 3 to 2", "move 1 from 4 to 2", "move 1 from 7 to 9", "move 1 from 1 to 9", "move 1 from 6 to 1", "move 8 from 5 to 2", "move 1 from 1 to 6", "move 19 from 5 to 2", "move 5 from 2 to 6", "move 2 from 9 to 7", "move 20 from 2 to 1", "move 1 from 9 to 4", "move 8 from 6 to 2", "move 5 from 1 to 3", "move 27 from 2 to 1", "move 34 from 1 to 7", "move 1 from 2 to 6", "move 2 from 3 to 1", "move 1 from 4 to 9", "move 1 from 2 to 6", "move 2 from 1 to 7", "move 1 from 6 to 7", "move 1 from 9 to 3", "move 2 from 6 to 3", "move 1 from 6 to 4", "move 5 from 3 to 4", "move 5 from 4 to 2", "move 4 from 1 to 4", "move 4 from 1 to 4", "move 2 from 3 to 6", "move 1 from 6 to 9", "move 25 from 7 to 5", "move 1 from 6 to 4", "move 17 from 5 to 2", "move 14 from 7 to 6", "move 1 from 7 to 3", "move 1 from 9 to 3", "move 10 from 2 to 3", "move 2 from 2 to 9", "move 12 from 3 to 5", "move 18 from 5 to 8", "move 1 from 4 to 2", "move 5 from 2 to 1", "move 1 from 5 to 3", "move 3 from 2 to 1", "move 1 from 2 to 7", "move 2 from 2 to 6", "move 9 from 6 to 7", "move 16 from 8 to 2", "move 6 from 7 to 3", "move 2 from 8 to 9", "move 1 from 1 to 8", "move 16 from 2 to 6", "move 1 from 8 to 3", "move 2 from 1 to 2", "move 1 from 9 to 3", "move 7 from 4 to 1", "move 7 from 3 to 7", "move 9 from 7 to 8", "move 1 from 5 to 6", "move 2 from 9 to 7", "move 1 from 9 to 5", "move 11 from 6 to 8", "move 1 from 3 to 1", "move 1 from 4 to 2", "move 2 from 8 to 5", "move 3 from 5 to 8", "move 2 from 1 to 9", "move 5 from 1 to 4", "move 3 from 4 to 1", "move 1 from 3 to 2", "move 3 from 2 to 1", "move 1 from 9 to 1", "move 1 from 2 to 5", "move 2 from 4 to 7", "move 20 from 8 to 5", "move 1 from 9 to 7", "move 11 from 6 to 1", "move 17 from 1 to 5", "move 1 from 8 to 2", "move 7 from 5 to 8", "move 1 from 4 to 5", "move 2 from 1 to 2", "move 2 from 8 to 4", "move 4 from 7 to 6", "move 2 from 6 to 8", "move 2 from 1 to 2", "move 1 from 1 to 4", "move 4 from 8 to 9", "move 2 from 1 to 9", "move 3 from 8 to 1", "move 25 from 5 to 2", "move 23 from 2 to 1", "move 1 from 7 to 1", "move 6 from 9 to 8", "move 6 from 8 to 3", "move 3 from 6 to 2", "move 10 from 1 to 2", "move 1 from 6 to 3", "move 2 from 3 to 6", "move 2 from 3 to 2", "move 2 from 6 to 8", "move 1 from 4 to 6", "move 14 from 1 to 9", "move 2 from 3 to 4", "move 14 from 2 to 4", "move 1 from 6 to 9", "move 17 from 4 to 3", "move 1 from 8 to 6", "move 2 from 7 to 2", "move 1 from 4 to 2", "move 1 from 5 to 9", "move 9 from 2 to 4", "move 17 from 3 to 7", "move 3 from 4 to 2", "move 1 from 8 to 3", "move 4 from 5 to 7", "move 1 from 3 to 6", "move 1 from 4 to 5", "move 14 from 7 to 9", "move 2 from 1 to 9", "move 3 from 2 to 1", "move 1 from 2 to 5", "move 1 from 3 to 7", "move 4 from 1 to 2", "move 2 from 6 to 7", "move 3 from 9 to 8", "move 4 from 2 to 4", "move 17 from 9 to 7", "move 1 from 2 to 8", "move 8 from 9 to 6", "move 1 from 8 to 2", "move 19 from 7 to 9", "move 9 from 4 to 2", "move 5 from 7 to 3", "move 3 from 5 to 9", "move 6 from 2 to 5", "move 1 from 9 to 4", "move 3 from 2 to 9", "move 25 from 9 to 5", "move 1 from 3 to 6", "move 2 from 5 to 8", "move 6 from 6 to 7", "move 1 from 3 to 4", "move 2 from 3 to 4", "move 1 from 8 to 2", "move 2 from 2 to 9", "move 2 from 8 to 3", "move 5 from 7 to 6", "move 3 from 7 to 9", "move 7 from 5 to 8", "move 2 from 3 to 5", "move 1 from 3 to 5", "move 1 from 6 to 2", "move 6 from 9 to 5", "move 1 from 9 to 2", "move 1 from 6 to 9", "move 2 from 5 to 6", "move 2 from 9 to 8", "move 11 from 8 to 1", "move 2 from 5 to 9", "move 3 from 6 to 5", "move 1 from 4 to 7", "move 5 from 5 to 7", "move 1 from 4 to 8", "move 7 from 7 to 2", "move 12 from 5 to 2", "move 10 from 1 to 8", "move 1 from 9 to 6", "move 3 from 8 to 1", "move 1 from 1 to 6", "move 10 from 2 to 3", "move 8 from 8 to 7", "move 1 from 9 to 8", "move 2 from 3 to 5", "move 14 from 5 to 8", "move 1 from 3 to 2", "move 3 from 8 to 1", "move 3 from 8 to 4", "move 3 from 2 to 4", "move 5 from 6 to 4", "move 8 from 7 to 9", "move 6 from 8 to 7", "move 1 from 5 to 7", "move 6 from 2 to 9", "move 4 from 4 to 6", "move 4 from 4 to 9", "move 3 from 9 to 3", "move 1 from 8 to 6", "move 1 from 5 to 6", "move 2 from 7 to 2", "move 1 from 3 to 4", "move 3 from 4 to 1", "move 3 from 4 to 3", "move 5 from 6 to 4", "move 4 from 3 to 8", "move 1 from 6 to 4", "move 8 from 3 to 2", "move 2 from 8 to 5", "move 11 from 9 to 7", "move 9 from 1 to 9", "move 2 from 7 to 3", "move 1 from 6 to 8", "move 1 from 6 to 5", "move 5 from 9 to 8", "move 3 from 9 to 7", "move 2 from 9 to 1", "move 2 from 3 to 7", "move 12 from 7 to 1", "move 2 from 8 to 9", "move 5 from 4 to 5", "move 4 from 9 to 4", "move 1 from 1 to 3", "move 7 from 1 to 3", "move 7 from 5 to 6", "move 1 from 9 to 1", "move 1 from 5 to 1", "move 5 from 7 to 8", "move 4 from 6 to 7", "move 5 from 1 to 8", "move 1 from 4 to 3", "move 12 from 8 to 7", "move 2 from 2 to 4", "move 2 from 8 to 9", "move 3 from 8 to 2", "move 2 from 6 to 7", "move 4 from 7 to 8", "move 1 from 6 to 8", "move 4 from 3 to 2", "move 15 from 7 to 8", "move 1 from 7 to 6", "move 3 from 3 to 5", "move 2 from 3 to 4", "move 5 from 2 to 5", "move 3 from 1 to 5", "move 4 from 5 to 6", "move 4 from 5 to 9", "move 1 from 5 to 7", "move 4 from 9 to 4", "move 2 from 2 to 9", "move 2 from 5 to 2", "move 2 from 2 to 1", "move 3 from 4 to 9", "move 2 from 9 to 4", "move 2 from 8 to 5", "move 2 from 5 to 2", "move 8 from 2 to 4", "move 2 from 1 to 3", "move 2 from 3 to 5", "move 3 from 6 to 9", "move 2 from 6 to 1", "move 2 from 1 to 4", "move 1 from 2 to 4", "move 1 from 5 to 7", "move 2 from 2 to 7", "move 18 from 4 to 2", "move 1 from 5 to 9", "move 2 from 7 to 9", "move 18 from 8 to 4", "move 1 from 7 to 8", "move 22 from 4 to 8", "move 6 from 2 to 6", "move 3 from 6 to 8", "move 3 from 6 to 4", "move 3 from 4 to 7", "move 3 from 7 to 1", "move 14 from 2 to 3", "move 10 from 3 to 2", "move 27 from 8 to 1", "move 1 from 7 to 6", "move 1 from 3 to 7", "move 2 from 2 to 8", "move 2 from 9 to 8", "move 18 from 1 to 4", "move 6 from 1 to 5", "move 10 from 4 to 7", "move 1 from 3 to 7", "move 4 from 7 to 2", "move 3 from 9 to 7", "move 1 from 6 to 5", "move 1 from 2 to 7", "move 2 from 5 to 6", "move 2 from 6 to 5", "move 3 from 5 to 1", "move 6 from 1 to 3", "move 4 from 5 to 9", "move 11 from 2 to 9", "move 2 from 1 to 6", "move 3 from 4 to 6", "move 5 from 7 to 3", "move 2 from 6 to 1", "move 2 from 1 to 5", "move 1 from 8 to 2", "move 1 from 1 to 8", "move 1 from 6 to 4", "move 2 from 4 to 5", "move 4 from 5 to 9", "move 11 from 3 to 6", "move 1 from 3 to 6", "move 8 from 6 to 5", "move 1 from 3 to 5", "move 4 from 4 to 8", "move 21 from 9 to 6", "move 2 from 9 to 5", "move 1 from 9 to 3", "move 1 from 2 to 6", "move 7 from 8 to 6", "move 12 from 6 to 5", "move 1 from 8 to 2", "move 10 from 6 to 7", "move 15 from 7 to 2", "move 2 from 7 to 3", "move 13 from 6 to 8", "move 9 from 5 to 1", "move 12 from 5 to 3", "move 1 from 2 to 3", "move 1 from 9 to 7", "move 9 from 3 to 4", "move 3 from 4 to 6", "move 1 from 7 to 6", "move 6 from 4 to 1", "move 2 from 5 to 2", "move 6 from 1 to 8", "move 9 from 8 to 6", "move 7 from 3 to 2", "move 1 from 2 to 9", "move 9 from 6 to 1", "move 13 from 1 to 7", "move 4 from 8 to 5", "move 2 from 7 to 1", "move 3 from 6 to 4", "move 3 from 5 to 8", "move 3 from 2 to 6", "move 1 from 5 to 3", "move 1 from 3 to 4", "move 1 from 9 to 8", "move 3 from 8 to 7", "move 12 from 2 to 9", "move 10 from 7 to 4", "move 5 from 8 to 4", "move 1 from 8 to 5", "move 11 from 4 to 7", "move 8 from 9 to 7", "move 1 from 6 to 2", "move 8 from 2 to 6", "move 1 from 5 to 8", "move 4 from 1 to 5", "move 4 from 9 to 6", "move 3 from 1 to 3", "move 2 from 8 to 4", "move 1 from 7 to 6", "move 1 from 2 to 7", "move 2 from 3 to 7", "move 4 from 4 to 9", "move 11 from 6 to 9", "move 10 from 7 to 8", "move 1 from 3 to 4", "move 1 from 6 to 4", "move 4 from 5 to 7", "move 6 from 7 to 4", "move 1 from 8 to 7", "move 4 from 6 to 7", "move 12 from 4 to 8", "move 12 from 8 to 1", "move 1 from 8 to 2", "move 10 from 1 to 7", "move 2 from 4 to 1", "move 8 from 8 to 3", "move 4 from 1 to 6", "move 8 from 7 to 6", "move 2 from 6 to 5", "move 2 from 5 to 2", "move 13 from 9 to 3", "move 3 from 2 to 5", "move 8 from 3 to 4", "move 7 from 6 to 7", "move 1 from 9 to 2", "move 1 from 9 to 1", "move 2 from 6 to 4", "move 3 from 4 to 8", "move 1 from 1 to 7", "move 4 from 4 to 6", "move 3 from 8 to 7", "move 1 from 2 to 9", "move 1 from 5 to 2", "move 1 from 2 to 5", "move 2 from 4 to 5", "move 1 from 7 to 2", "move 13 from 3 to 4", "move 7 from 4 to 3", "move 4 from 5 to 9", "move 1 from 4 to 7", "move 5 from 6 to 3", "move 3 from 9 to 7", "move 10 from 7 to 8", "move 3 from 4 to 8", "move 1 from 5 to 4", "move 2 from 3 to 1", "move 3 from 7 to 4", "move 4 from 8 to 6", "move 2 from 9 to 3", "move 2 from 4 to 5", "move 4 from 4 to 3", "move 8 from 8 to 3", "move 3 from 6 to 8", "move 1 from 2 to 6", "move 5 from 7 to 9", "move 1 from 4 to 3", "move 3 from 7 to 5", "move 3 from 8 to 4", "move 7 from 7 to 5", "move 3 from 7 to 8", "move 1 from 9 to 8", "move 3 from 4 to 1", "move 1 from 5 to 8", "move 3 from 7 to 1", "move 6 from 8 to 3", "move 3 from 9 to 5", "move 2 from 6 to 5", "move 2 from 1 to 6", "move 16 from 3 to 8", "move 4 from 5 to 8", "move 4 from 3 to 8", "move 1 from 9 to 5", "move 1 from 6 to 5", "move 3 from 3 to 7", "move 6 from 1 to 6", "move 1 from 5 to 4", "move 3 from 5 to 2", "move 2 from 7 to 4", "move 1 from 2 to 8", "move 6 from 8 to 1", "move 2 from 4 to 5", "move 2 from 2 to 3", "move 7 from 8 to 7", "move 1 from 4 to 6", "move 3 from 6 to 4", "move 3 from 4 to 9", "move 3 from 6 to 3", "move 11 from 8 to 6", "move 12 from 5 to 4", "move 5 from 6 to 1", "move 9 from 3 to 2", "move 7 from 6 to 1", "move 7 from 7 to 8", "move 5 from 8 to 3", "move 2 from 3 to 6", "move 2 from 8 to 1", "move 1 from 7 to 2", "move 7 from 3 to 8", "move 1 from 9 to 1", "move 14 from 1 to 3", "move 9 from 2 to 8", "move 11 from 3 to 4", "move 22 from 4 to 1", "move 2 from 3 to 1", "move 16 from 8 to 4", "move 1 from 9 to 2", "move 3 from 6 to 9", "move 3 from 9 to 5", "move 1 from 2 to 6", "move 1 from 5 to 7");
        //Arrays.asList("move 1 from 2 to 1", "move 3 from 1 to 3", "move 2 from 2 to 1", "move 1 from 1 to 2");

        Map<Integer, Deque<String>> stacks = new HashMap<>();
        /*Deque<String> stack1 = new ArrayDeque<>();
        stack1.push("N");
        stack1.push("Z");
        stacks.put(1, stack1);
        Deque<String> stack2 = new ArrayDeque<>();
        stack2.push("D");
        stack2.push("C");
        stack2.push("M");
        stacks.put(2, stack2);
        Deque<String> stack3 = new ArrayDeque<>();
        stack3.push("P");
        stacks.put(3, stack3);
*/
        //            [M] [S] [S]
        //        [M] [N] [L] [T] [Q]
        //[G]     [P] [C] [F] [G] [T]
        //[B]     [J] [D] [P] [V] [F] [F]
        //[D]     [D] [G] [C] [Z] [H] [B] [G]
        //[C] [G] [Q] [L] [N] [D] [M] [D] [Q]
        //[P] [V] [S] [S] [B] [B] [Z] [M] [C]
        //[R] [H] [N] [P] [J] [Q] [B] [C] [F]
        // 1   2   3   4   5   6   7   8   9
        Deque<String> stack1 = new ArrayDeque<>();
        stack1.push("G");
        stack1.push("B");
        stack1.push("D");
        stack1.push("C");
        stack1.push("P");
        stack1.push("R");
        stacks.put(1, stack1);
        Deque<String> stack2 = new ArrayDeque<>();
        stack2.push("G");
        stack2.push("V");
        stack2.push("H");
        stacks.put(2, stack2);
        Deque<String> stack3 = new ArrayDeque<>();
        stack3.push("M");
        stack3.push("P");
        stack3.push("J");
        stack3.push("D");
        stack3.push("Q");
        stack3.push("S");
        stack3.push("N");
        stacks.put(3, stack3);
        Deque<String> stack4 = new ArrayDeque<>();
        stack4.push("M");
        stack4.push("N");
        stack4.push("C");
        stack4.push("D");
        stack4.push("G");
        stack4.push("L");
        stack4.push("S");
        stack4.push("P");
        stacks.put(4, stack4);
        Deque<String> stack5 = new ArrayDeque<>();
        stack5.push("S");
        stack5.push("L");
        stack5.push("F");
        stack5.push("P");
        stack5.push("C");
        stack5.push("N");
        stack5.push("B");
        stack5.push("J");
        stacks.put(5, stack5);
        Deque<String> stack6 = new ArrayDeque<>();
        stack6.push("S");
        stack6.push("T");
        stack6.push("G");
        stack6.push("V");
        stack6.push("Z");
        stack6.push("D");
        stack6.push("B");
        stack6.push("Q");
        stacks.put(6, stack6);
        Deque<String> stack7 = new ArrayDeque<>();
        stack7.push("Q");
        stack7.push("T");
        stack7.push("F");
        stack7.push("H");
        stack7.push("M");
        stack7.push("Z");
        stack7.push("B");
        stacks.put(7, stack7);
        Deque<String> stack8 = new ArrayDeque<>();
        stack8.push("F");
        stack8.push("B");
        stack8.push("D");
        stack8.push("M");
        stack8.push("C");
        stacks.put(8, stack8);
        Deque<String> stack9 = new ArrayDeque<>();
        stack9.push("G");
        stack9.push("Q");
        stack9.push("C");
        stack9.push("F");
        stacks.put(9, stack9);


        System.out.println(getTopStack(instructions, stacks));
    }

    static String getTopStack(List<String> instructions, Map<Integer, Deque<String>> stacks) {

        String result = "";
        for (String instruction : instructions) {
            int quantity = Integer.parseInt(instruction.split(" ")[1]);
            int fromStack = Integer.parseInt(instruction.split(" ")[3]);
            int toStack = Integer.parseInt(instruction.split(" ")[5]);
            Deque<String> currentStack = stacks.get(fromStack);
            Deque<String> targetStack = stacks.get(toStack);
            List<String> elementsToBeAdded = new ArrayList<>();
            while (quantity > 0) {
                String topElement = currentStack.removeLast();
                elementsToBeAdded.add(topElement);
                quantity--;
            }
            Collections.reverse(elementsToBeAdded);
            for (String element : elementsToBeAdded) {
                targetStack.addLast(element);
            }
            stacks.put(fromStack, currentStack);
            stacks.put(toStack, targetStack);
        }
        for (int i = 1; i <= stacks.size(); i++) {
            Deque<String> stack = stacks.get(i);
            result = result + stack.peekLast();
        }
        return result;
    }
}
