import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int res=0;
        while (true) {
            System.out.println("Укажите путь:");
            String path=new Scanner(System.in).nextLine();
            File file = new File(path);
            boolean fileExists = file.exists();
            boolean isDirectory = file.isDirectory();
            {if (isDirectory == true) System.out.println("Указан путь к папке");
                if (isDirectory == true) continue;
            }
            {if (fileExists == true) System.out.println("Указан верный путь к файлу");
            else System.out.println("Файл не сущесвует или указан некорректный путь");
                if (isDirectory == false && fileExists== false) continue;
            }
            res++;
            System.out.println("Количество верно указанных путей: " + res);
        }
    }
}

