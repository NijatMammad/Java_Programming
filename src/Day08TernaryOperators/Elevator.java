package Day08TernaryOperators;

public class Elevator {
    public static void main(String[] args) {


    /*    if (floorNum >=1&& floorNum<=3){
            if(floorNum==1) {
                System.out.println(" Floor 1 selected. Companies: Lobby, Verizon, Starbacks");

            }else if (floorNum==2){
                System.out.println ("Floor 2 selected. Companies: Cydeo, NASA, Intel") ;
            }else{
                System.out.println("Floor 3 selected. Companies: LYFT, BoFA, Stakehouse");
            }


        }else{
            System.out.println("Invalid Number");

            System.out.println("_____________________________________________________________________________");

            */

        int floorNum=1;
        String result="Invalid floor";
        if (floorNum >=1&& floorNum<=3){
            result="Floor "+ floorNum+ " is selected. Companies: ";
            if(floorNum==1) {
                result+="Lobby, Verizon, Starbacks";
            }else if (floorNum==2) {
                result += "Cydeo, NASA, Intel ";
            }else {
                result+="LYFT, BoFA, Stakehouse";

            }
            System.out.println(result);




        }

    }
}
