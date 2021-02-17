package ArrayListDemo;

import java.util.*;

public class ArrayListDemo {

    public static void main(String[] args) {
        // createArrayListThenAddElement();
        // createArrayListFromOtherArrayList();
//        arrayListRemoveDemo();
//        iteratingListRemoveDemo();

//        sortArrayListDemo();
//        usingArrayListSortMethod();
        usingComparableInterface();
    }

    public static void createArrayListThenAddElement() {
        ArrayList<String> carArrayList = new ArrayList();
        carArrayList.add("BMW");
        carArrayList.add("Benz");
        carArrayList.add("VV");

        System.out.println(carArrayList);


        System.out.println(carArrayList.size());
        System.out.println(carArrayList.isEmpty());
        System.out.println(carArrayList.get(0));


    }


    public static void createArrayListFromOtherArrayList() {
        ArrayList<String> benzCarArrayList = new ArrayList();
        benzCarArrayList.add("GLE");
        benzCarArrayList.add("smart");
        benzCarArrayList.add("GLC");

        ArrayList<ArrayList<String>> carArrayList = new ArrayList();
        carArrayList.add(benzCarArrayList);

        System.out.println(carArrayList);

    }

    public static void arrayListRemoveDemo() {
        ArrayList<String> carArrayList = new ArrayList();
        carArrayList.add("BMW");
        carArrayList.add("Benz");
        carArrayList.add("VV");


        carArrayList.remove(0);
        carArrayList.remove("Benz");
        carArrayList.removeAll(carArrayList);

        System.out.println(carArrayList);
    }

    public static void iteratingListRemoveDemo() {
        ArrayList<String> carArrayList = new ArrayList();
        carArrayList.add("BMW");
        carArrayList.add("Benz");
        carArrayList.add("VV");

        System.out.println("---------foreach-------------");

        for (String item : carArrayList) {
            System.out.println(item);
        }

        System.out.println("---------iterator-------------");

        Iterator<String> itr = carArrayList.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("----------simple for------------");


        for (int i = 0; i < carArrayList.size(); i++) {
            System.out.println(carArrayList.get(i));
        }
    }

    public static void sortArrayListDemo() {
        ArrayList<Integer> carArrayList = new ArrayList();
        carArrayList.add(43);
        carArrayList.add(-1);
        carArrayList.add(33);
        carArrayList.add(1);

        System.out.println(carArrayList);
        System.out.println("After sorted");
        Collections.sort(carArrayList);
        System.out.println(carArrayList);

    }

    public static void usingArrayListSortMethod() {
        List<String> names = new ArrayList<>();
        names.add("Lisa");
        names.add("Jennifer");
        names.add("Mark");
        names.add("David");

        System.out.println("Names : " + names);

        // Sort an ArrayList using its sort() method. You must pass a Comparator to the ArrayList.sort() method.
        names.sort(new Comparator<String>() {
            @Override
            public int compare(String name1, String name2) {
                return name1.compareTo(name2);
            }
        });

        // The above `sort()` method call can also be written simply using lambda expression
        names.sort((name1, name2) -> name1.compareTo(name2));

        // Following is an even more concise solution
        names.sort(Comparator.naturalOrder());

        System.out.println("Sorted Names : " + names);
    }


    public static void usingComparableInterface() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Sachin", 47));
        people.add(new Person("Chris", 34));
        people.add(new Person("Rajeev", 25));
        people.add(new Person("David", 31));

        System.out.println("Person List : " + people);

        // Sort People by their Age
        people.sort((person1, person2) -> {
            return person1.getAge() - person2.getAge();
        });

        // A more concise way of writing the above sorting function
        people.sort(Comparator.comparingInt(Person::getAge));

        System.out.println("Sorted Person List by Age : " + people);

        // You can also sort using Collections.sort() method by passing the custom Comparator
        Collections.sort(people, Comparator.comparing(Person::getName));
        System.out.println("Sorted Person List by Name : " + people);
    }
}


class Person {
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

