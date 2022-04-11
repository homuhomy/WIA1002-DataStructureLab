public class MainTelephone{
    public static void main(String[] args) {
        //Instantiate 5 Telephone objects and store them in an array.
        Telephone[] phoneArray = new Telephone[5];
        int number = 79676300;

        for(int i = 0; i < 5; i++){
            phoneArray[i] = new Telephone("03",number++);
            System.out.println(phoneArray[i].makeFullNumber());
        }
//        for(int = 0; i < Telephone.numberOfTelephoneObject; i++){
//            System.out.println(phoneArray[i].makeFullNumber());
//        }


    }
}