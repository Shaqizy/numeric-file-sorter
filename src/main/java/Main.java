import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        FileUtil fileUtil = new FileUtil();
        List<Integer> list = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(
                new FileReader(fileUtil.getFile("numbersInteger.txt"))))
        {
            String line;
            while((line = br.readLine()) != null){
                list.addAll(Arrays.stream(line.split(", "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList()));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("Reading from file...");
        list.sort(Comparator.naturalOrder());
        System.out.println("Numbers in natural order :");
        list.forEach(s -> System.out.print(s + " "));
        System.out.println();
        list.sort(Comparator.reverseOrder());
        System.out.println("Numbers in reverse order :");
        list.forEach(s -> System.out.print(s + " "));
    }
}
