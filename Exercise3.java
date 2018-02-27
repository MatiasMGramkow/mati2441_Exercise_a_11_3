import java.util.LinkedList;

public class Exercise3
{
    public static void main(String[] args)
    {
        LinkedList liste = new LinkedList();
        liste.add(1);
        liste.add(1);
        liste.add(2);
        liste.add(0);
        liste.add(4);
        liste.add(5);
        liste.add(6);
        liste.add(8);
        liste.add(8);
        liste.add(3);
        liste.add(11);
        liste.add(9);
        liste.add(12);
        liste.add(0);
        liste.add(14);
        liste.add(0);
        liste.add(16);

        System.out.println("Listen inden jeg kalder på metoden: \n" + liste);

        removeEvenInRange(liste,5,13);

        System.out.println("Listen efter jeg kalder på metoden: \n" + liste);

    }

    public static void removeEvenInRange(LinkedList liste, int startIndex, int slutIndex)
    {
        if(startIndex < 0 || startIndex >= liste.size()
                || slutIndex < 0 || slutIndex >= liste.size())
        {
            System.out.println("\nDet er uden for rækkevidde!!!! FOR FANDEN!\n");
        }else
        {
            int tæller = startIndex;
            while (startIndex < slutIndex)
            {
                //System.out.println(startIndex);
                if((Integer)liste.get(startIndex) % 2 == 0)
                {
                    // System.out.println(liste.get(startIndex));
                    liste.remove(startIndex);
                    slutIndex--;
                    startIndex--;
                    //System.out.println("Size: " + liste.size());
                }
                    startIndex++;
            }
        }
    }
}
