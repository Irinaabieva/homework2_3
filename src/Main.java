public class Main {
    public static void main(String[] args) {
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var totalWeight = firstBoxer + secondBoxer;
        System.out.println("Общий вес бойцов " + totalWeight);
        var differenceWeight = secondBoxer - firstBoxer;
        System.out.println("Разница между весами бойцов " + differenceWeight);
        var overload = totalWeight % firstBoxer;
        System.out.println("Разница между весами бойцов " + overload);
    }
}