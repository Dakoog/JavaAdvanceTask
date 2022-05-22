package taskes.task3;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of(
                "Java", 18,
                "Python", 1,
                "C# ", 6,
                "Pascal", 1,
                "PHP", 0

        );
        ThirdTask programme = new ThirdTask(map);

        System.out.println(programme.printWithStream());

    }}