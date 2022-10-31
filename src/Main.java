public class Main {
    public static void main(String[] args) {
        var totalHour = 640;
        var workHour = 8;
        var workers = totalHour / workHour;
        System.out.println("Всего работников в компании " + workers);
        var workers2 = workers + 94;
        var workHour2 = totalHour / workers2;
        System.out.println("Если в компании работает " + workers2 + " человек, то всего " + workHour2 + " часов работы может быть поделено между сотрудниками");
    }
}