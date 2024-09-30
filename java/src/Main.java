import java.util.Scanner;


 class Weapon {
    public void Shoot () {
        System.out.println("piw-paf");
    }
    public void Reload() {
        System.out.println("Reloading...");
    }

    public static void main(String[] args) {
        Weapon pistol = new Weapon();
        pistol.Shoot();
        Scanner in = new Scanner(System.in);
        System.out.print("Press any key to continue");
        String num = in.next();
        pistol.Reload();
    }
}
/*Суть инкапсуляции заключается в сокрытии кода от данных, которыми он манипулирует.
Пользователю предоставлен функционал. Если ему нужно, чтобы пистолет выстрелил - он нажимает на курок,
а что конкретно происходит внутри пистолета после нажатия является лишней информацией.
 */