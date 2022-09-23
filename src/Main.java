public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int everyYear=79;
        int beforeYear=1822;
        int afterYear=2122;
        for (int i = beforeYear;i<=afterYear;i++){
            if (i%everyYear==0){
                System.out.println(i);
            }
        }

        System.out.println("Задание 2");
        int num = 2;
        for (int i = 1; i<=10;i++){
            System.out.println(num + "*" + i + " = " + num*i);
        }
    }
}