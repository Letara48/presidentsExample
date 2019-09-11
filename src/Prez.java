public class Prez {
    public static void main(String[] args) {
        String [] pArray = {"Kennedy", "Johnson", "Nixon", "Ford", "Carter", "Reagan", "Clinton", "Bush", "Obama"};
        for (int i = 0; i < pArray.length/2; i++){
            String temp = pArray[i];
            pArray[i] = pArray[pArray.length -i -1];
            pArray[pArray.length - i -1] = temp;


        }
        for (int b = 0; b < pArray.length; b++){
            System.out.println(pArray[b]);
        }
        System.out.println("history");
    }
}
