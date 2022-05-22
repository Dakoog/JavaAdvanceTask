package taskes.task3;

/*     ZADANIE 3.
        Stwórz metodę, która jako parametr przyjmuje mapę, gdzie kluczem jest string, a wartością liczba,
        a następnie wypisuje każdy element mapy do konsoli w formacie: Klucz: "", Wartość: "".
        Na końcu każdego wiersza poza ostatnim, powinien być przecinek, a w ostatnim kropka.
        Przykład:
        Klucz: Java, Wartość: 18,
        Klucz: Python, Wartość: 1,
        …
        Klucz: PHP, Wartość: 0.
         */

import lombok.AllArgsConstructor;

import java.util.Map;
import java.util.stream.Collectors;
@AllArgsConstructor
public class ThirdTask {
    private Map<String,Integer> map;

    public  String printWithStream () {


        return map.entrySet().stream()
                .map(keyValue -> "\n" + keyValue.getKey() + " -> " + keyValue.getValue())

                .collect(Collectors.joining(", ", "\nJęzyki programowania", "."));
    }


}