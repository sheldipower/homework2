public class Main {
    public static void main(String[] args) {
        double dog = 10;
        System.out.println(dog);
        dog = dog + 4;
        System.out.println(dog);
        dog = dog - 3.5;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        cat = cat + 4;
        System.out.println(cat);
        cat = cat - 1.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        paper = paper + 4;
        System.out.println(paper);
        paper = paper - 7639;
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend/7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog*10;
        System.out.println(frog);
        frog = frog/3.5;
        System.out.println(frog);
        frog = frog+4;
        System.out.println(frog);
        var firstSportsmenWeight = 78.2;
        var secondSportsmenWeight = 82.7;
        var sportsmensWeight = firstSportsmenWeight + secondSportsmenWeight;
        System.out.println("Общий вес" + sportsmensWeight);
        var differenceSportsmensWeight = secondSportsmenWeight - firstSportsmenWeight;
        System.out.println("Разниц между спортсменами" + differenceSportsmensWeight);
        var differenceWeight = secondSportsmenWeight % firstSportsmenWeight;
        System.out.println("Разниц между спортсменами" + differenceWeight);
        var work = 640;
        var onePeople = 8;
        var peopleWeight = work / onePeople;
        System.out.println("Всего работников в компании —"+ peopleWeight + "человек");
        var newPeople = peopleWeight + 94;
        var manyPeopleHour = newPeople * onePeople;
        System.out.println( "Если в компании работает" + newPeople + "человек, то всего" + manyPeopleHour + "часов работы может быть поделено между сотрудниками");


    }
}