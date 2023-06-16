public class Main {

    public static void main(String[] args) {

        IntInput intInput = new IntInput();

        int first = intInput.enteredValue("first");
        int second = intInput.enteredValue("second");
        int third = intInput.enteredValue("third");
        int fourth = intInput.enteredValue("fourth");

        int firstSum = first + second;
        int secondSum = third + fourth;

        System.out.println(firstSum < secondSum);

        firstSum ++;
        secondSum --;
        secondSum --;

        System.out.println(firstSum > secondSum);

        System.out.println(firstSum % 2 == 0 || secondSum % 2 == 0);
    }
}

