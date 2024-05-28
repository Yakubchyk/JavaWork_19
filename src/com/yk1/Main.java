package com.yk1;

public class Main {
    public static void main(String[] args) {
Exemle e = new Exemle(25, "Ivan");

        System.out.println(e);

    }
}

/*
List<String> list = new ArrayList<>();
        list.add("Artem");
        list.add("Dasha");
        list.add("Dima");
        list.add("Andrey");
        list.add("Boris");
        list.add("Nikita");

        AtomicInteger count = new AtomicInteger();
        //String name ="Artem,Dasha,Dima";
        Optional<String> result = list.stream()
                //.filter(number -> number % 2 == 0)  //удаляет данные из поток
                //.skip(1)    //пропускает Т эл-ов
                //.distinct()     //убирает дубликаты
                //.map(String::valueOf)
                //.peek(num -> test.add(num)) //применяет методы
                //.limit(3) //не пропускает больше 3
                //.sorted()   //сортирует
                //.parallel()   в 2 потока
                //.flatMap(line -> Arrays.stream(line.split(",")))    //из 1 элемента сделать несколько

                //Терминальные
                //.collect(Collectors.toList());
                //.count();
                //.anyMatch(name -> name.length()>4);
                //.allMatch(name -> name.length()>4);
                //.noneMatch(name -> name.length()>7);
                //.min(Comparator.comparing(num -> num.length()));    //передаешь компаротор и по нему минимальное
                //.forEach(System.out::println);    //закидывает данные в цикл
                //.reduce((one, two) -> one + two + count.getAndIncrement());
 */
/*
Map<Integer, String> mapFromSet = set.stream()
    .collect(Collectors.toMap(Entry::getKey, Entry::getValue));



Map<K, V> map = new HashMap<>(originalMap.entrySet().stream()
        .collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue)));
 */
