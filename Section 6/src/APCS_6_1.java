public class APCS_6_1 {
    public static void main(String[] args) {
        Plot[][] plots = {
                {new Plot("corn",20), new Plot("corn",30), new Plot("peas",10)},
                {new Plot("peas",30), new Plot("corn",40), new Plot("corn",62)},
                {new Plot("wheat",10), new Plot("corn",50), new Plot("rice",30)},
                {new Plot("corn",55), new Plot("corn",30), new Plot("peas",30)}
        };
        ExperimentalFarm f = new ExperimentalFarm(plots);

        System.out.println(f.getHighestYield("corn"));
        System.out.println(f.getHighestYield("peas"));
        System.out.println(f.getHighestYield("bananas"));

        if(f.sameCrop(0))
            System.out.println("column 0 has all the same crop");
        else
            System.out.println("column 0 does not have all of the same crop");

        if(f.sameCrop(1))
            System.out.println("column 1 has all the same crop");
        else
            System.out.println("column 1 does not have all of the same crop");
    }
}