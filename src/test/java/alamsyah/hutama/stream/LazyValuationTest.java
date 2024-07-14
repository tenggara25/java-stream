package alamsyah.hutama.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class LazyValuationTest {

    @Test
    void testTerminalOperation() {
        List<String> names = List.of("Alamsyah", "Hutama", "Khannedy");
        names.stream()
        .map(name -> {
            System.out.println("Change " + name + " to UPPERCASE");
            return name.toUpperCase();
        })
        .map(upper -> {
        System.out.println("Change " + upper + " to Mr. ");
        return "Mr. " + upper;
        })
                .forEach(mr -> {
                    System.out.println(mr);
                });
    }

}