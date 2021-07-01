import java.util.ArrayList;

public class Refrigerator {



    public ArrayList<Beer> beers = new ArrayList<Beer>();

    public void Add(Beer beer){
        if (beers.size()<6){
            beers.add(beer);
        }else {throw new IndexOutOfBoundsException();}



        System.out.println("Beer add");
    }
    public Beer Remove(){
        if (beers.size()>0)
        {
            int index=beers.size() - 1;
            Beer beer= beers.get(index);
            beers.remove(index);
            return beer;
        }else {throw new IndexOutOfBoundsException();}

    }

}
