package day7;

import dey6.Pensoner;
import dey6.Person;
import dey6.Student;
import dey6.Worker;

import java.math.BigDecimal;
import java.util.*;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class CollectionsExample {
    public static final Student student1 = new Student("Student3", "Nowak", 3, 5, 43, BigDecimal.ZERO);
    public static final Student student2 = new Student("Student5", "Nowak", 5, 5, 43, BigDecimal.ZERO);
    public static final Worker worker1 = new Worker("Worker6", "Kowalski", 6, 6, BigDecimal.ZERO);
    public static final Pensoner pensoner1 = new Pensoner("Pensioner7", "Psikuta", 7, 5, BigDecimal.ZERO);
    public static final Pensoner pensoner2 = new Pensoner("Pensioner7", "Psikuta", 7, 5, BigDecimal.ZERO);// to jest ta sama osoba ale nowy obiekt czyli technicznie nie jest to to samo

    public static void main(String[] args) {
        treeSetExample();
        listExample();
        hashSetExample();
        hashMapExample();
        //contains, comparable pojęcia doczytać

        List<Person> personList = populatePeopleList();
        Map<String, Long> resultMap = personList.stream()
                .filter(e -> e.getLastName() != null)
                .map(e -> e.getLastName().trim())
                .collect(groupingBy(e -> e, counting()));
        System.out.println(resultMap);
    }

    private static void namesStaticsMap() {
        List<Person> personList = populatePeopleList();
        Map<String, Integer> resultMap = new HashMap<>();
        for (Person x : personList) {
            String ourKey;
            if (x.getLastName() == null) {
                ourKey = null;
            } else ourKey = x.getLastName().trim();
            if (resultMap.containsKey(ourKey)) {
                int counter = resultMap.get(ourKey);
            } else {
                resultMap.put(ourKey, 1);
            }
        }
        System.out.println(resultMap);
    }

    private static void hashMapExample() {
        Map<Integer, Person> personMap = new HashMap<>();
        personMap.put(student1.getIdentity(), student1);
        personMap.put(student2.getIdentity(), student2);
        personMap.put(worker1.getIdentity(), worker1);
        personMap.put(pensoner2.getIdentity(), pensoner2);
        personMap.put(pensoner1.getIdentity(), pensoner2);
        System.out.println("Wyswietl Mape");
        System.out.println(personMap);
    }

    private static void hashSetExample() {
        //Set<Person> ofPersonSet = new LinkedHashSet<>(); tu zostanie achowana kolejnosc dodawania
        Set<Person> ofPersonSet = new HashSet<>();
        System.out.println("hashSetMap");
        System.out.println(ofPersonSet.add(student1));
        System.out.println(ofPersonSet.add(pensoner1));
        System.out.println(ofPersonSet.add(worker1));
        System.out.println(ofPersonSet.add(pensoner2));
        System.out.println(ofPersonSet.size());
        System.out.println(ofPersonSet);
    }

    private static void listExample() {
        List<Person> personList = populatePeopleList();

        System.out.println("listExample");
        System.out.println(personList.contains(pensoner1));
        personList.remove(pensoner1);
        System.out.println(personList.contains(pensoner1));
        System.out.println(personList);
    }

    private static List<Person> populatePeopleList() {
        List<Person> personList = new ArrayList<>();
        personList.add(student1);
        personList.add(student2);
        personList.add(worker1);
        personList.add(pensoner2);
        personList.add(pensoner1);
        return personList;
    }

    private static void treeSetExample() {
        TreeSet<Person> tSet = new TreeSet<>();
        tSet.add(student1);
        tSet.add(student2);
        System.out.println("treeSetExample");
        System.out.println(tSet);

        for (Person x : tSet) {
            System.out.println(x.getFirstName());
        }
        tSet.stream()
                .map(e -> e.getFirstName())
                .forEach(e -> System.out.println(e));
    }
}
