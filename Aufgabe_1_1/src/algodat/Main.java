//return type for findElement in class List?
//Difference between print element and print list
//fix writeListToDisk

package algodat;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException{
	    Data d1 = new Data ("Fritz", "Meier", "01-01-2000", 234);
        Data d2 = new Data ("Max", "Mustermann", "20-04-1980", 123);
        Data d3 = new Data ("Hans", "Schulte", "15-07-2007", 456);
        Data d4 = new Data ("Klaus", "Hauser", "10-06-1987", 789);
        Data d5 = new Data ("Moritz", "Friedrich", "04-11-1988", 198);

        List list = new List();
        list.insertElement(d1);
        list.insertElement(d2);
        list.insertElement(d3);
        list.insertElement(d4);
        list.insertElement(d5);

        //list.printElement();
        //list.printList();
        System.out.println(list.countElements());
        list.writeListToDisk();
    }
}
