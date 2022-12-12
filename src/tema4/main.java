package tema4;

public class main {

    public static void main(String[] args) {
        // if, else if y else
        int numeroIf = 0;

        if (numeroIf<0){
            System.out.println("La variable numeroIf " + numeroIf + "es negativo");
        } else if (numeroIf>0) {
            System.out.println("La variable numeroIf " + numeroIf + "es positivo");
        } else {
            System.out.println("La variable numeroIf es 0");
        }


        //while
        int numeroWhile = 1;

        while (numeroWhile < 3){
            numeroWhile++;
            System.out.println("La variable numeroWhile ahora vale: " + numeroWhile);
        }

        //do while
        int numeroDoWhile = 3;

        do{
            numeroDoWhile++;
            System.out.println("La variable numeroDoWhile ahora vale: " + numeroDoWhile);
        } while(numeroDoWhile < 3);

        //for
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println("La variable numeroFor ahora vale: " + numeroFor);
        }

        //Switch
        String estacion = "otoño";
        switch (estacion) {
            case "primavera":
                System.out.println("Estamos en verano");
                break;
            case ("verano"):
                System.out.println("Estamos en invierno");
                break;
            case ("invierno"):
                System.out.println("Estamos en primavera");
                break;
            case ("otoño"):
                System.out.println("Estamos en otoño");
                break;
            default:
                System.out.println("no es una estación");
        }

    }
}


