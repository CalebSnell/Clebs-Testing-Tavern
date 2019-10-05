public class detector {
    public static void main(String[] args) {
        String plantStatus;
        String leaves = "idk";

        if(leaves.getColor().equals("GREEN")) {
            plantStatus = "healthy";
            System.out.println(plantStatus);
        }
        else if(leaves.getPattern().equals("SPLOTCHY")) {
            plantStatus = "ded as fuck yo";
            System.out.println(plantStatus);
        }
        else {
            System.out.println("idfk lmao");
        }

    }
}
