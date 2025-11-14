package curriculum_D;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Daemon extends Character {

    public Daemon(String name, int hp, int at, int sp) {
        super(name, hp, at, sp);
    }

    public static Daemon loadDaemon(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String name = br.readLine();
            int hp = Integer.parseInt(br.readLine());
            int at = Integer.parseInt(br.readLine());
            int sp = Integer.parseInt(br.readLine());
            return new Daemon(name, hp, at, sp);
        } catch (IOException e) {
            System.out.println("デーモンの読み込みに失敗しました。");
            return new Daemon("Unknown", 50, 10, 5);
        }
    }
}
