package alamsyah.hutama.stream;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreamTest {

    @Test
    public void testCreateEmptyOrSingleStream () {
        Stream <String> emptyStream =Stream.empty();
        emptyStream.forEach(data -> {
            System.out.println(data);
        });

        Stream <String> oneStream =Stream.of("Alam");
        oneStream.forEach(data ->
        {
            System.out.println(data);
        });

        String data = "Hutama";
        Stream <String> emptyOrNotStream =Stream.ofNullable(data);
        emptyOrNotStream.forEach(item -> {
            System.out.println(item);
        });
    }

    @Test
    void testCreateStreamFromArray() {
        Stream<String> arrayStream = Stream.of("Alam", "Syah", "Hutama");
        arrayStream.forEach(name -> {
            System.out.println(name);
        });

        Stream<Integer> integerStream = Stream.of(1,2,3,4,5,6,7,8,9);
        integerStream.forEach(System.out::println);


        String [] array = new String[]{
            "Alamsyah", "Hutama", "Khannedy"
        };

        Stream<String> streamFromArray = Arrays.stream(array);

        streamFromArray.forEach(System.out::println);

    }

    @Test
    void testCreateStreamFromCollection() {
        Collection<String> collection = List.of("Alamsyah", "Hutama", "Khannedy");
        Stream<String> stringStream = collection.stream();
        stringStream.forEach(System.out::println);

        Stream<String> stringStream2 = collection.stream();
        stringStream2.forEach(System.out::println);
    }

    @Test
    void testCreateInfinite() {
        Stream <String> stream = Stream.generate(() -> "Alamsyah Hutama");
       //  stream.forEach(System.out::println);

        Stream<Integer> iterate = Stream.iterate(1, value -> value+1);
       // iterate.forEach(System.out::println);


    }
}
