class MaxNumber {
    public static void findnumber (int number, int sum) {
        int [] result = new int [number];
        if (sum == 0) {
            if (number ==1 ) {
                System.out.println(0);
            } else {
                System.out.println("Can't find it.");
            }
            return;
        }
        if (sum > 9 * number) {
            System.out.println("Can't find it.");
            return;
        }
        for (int i = 0; i < number; i++) {
            if (sum >= 9) {
                result[i] = 9;
                sum -= 9;
            } else {
                result[i] = sum;
                sum = 0;
            }
        }
        for (int i =0; i <number; i++) {
            System.out.print(result[i]);
        }
    }
}
class Main {
    public static void main (String args[]) {
        int number = 4;
        int sum = 30;
        System.out.println("If the number of digits is " + number + " and the sum of the digits is " + sum + " then, the locker number is: ");
        MaxNumber.findnumber(number, sum);
    }
}