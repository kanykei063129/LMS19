import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Planeta[] planetas = Planeta.values();

        Scanner scanner = new Scanner(System.in);
        String world = scanner.nextLine().toUpperCase();
        switch (world){
            case "МЕРКУРИЙ":
                System.out.println(Planeta.МЕРКУРИЙ + " Жердин үчтөн бирине араң жетет жана Күнгө жакын планета");
                break;
            case "ВЕНЕРА":
                System.out.println(Planeta.ВЕНЕРА + " айлануусу өтө жай жана Венера убактысы жердин убактысына салыштырсак 243 кунго созулат");
                break;
            case "ЗЕМЛЯ":
                System.out.println(Planeta.ЗЕМЛЯ + " жашоо көбөйүшү үчүн идеалдуу аралыкта, ошондой эле коргоочу озон катмары, суюк суусу мол");
                break;
            case "МАРС":
                System.out.println(Planeta.МАРС + " жер планетасына окшош");
                break;
            case "ЮПИТЕР":
                System.out.println(Planeta.ЮПИТЕР + " күн системасындагы эң чоң планета");
                break;
            case "САТУРН":
                System.out.println(Planeta.САТУРН + " ушунчалык жеңил, ал гипотетикалык океанда сүзүп, аны камтый алат.");
                break;
            case "УРАН":
                System.out.println(Planeta.УРАН + "дын Сатурндагыдай кереметтүү болбосо дагы,өзүнүн шакекчеси бар. Алар абдан начар, ошондуктан Жерден оңой менен көрүнбөйт ");
              break;
            case "НЕПТУН":
                System.out.println(Planeta.НЕПТУН + " метанга бай атмосфера, ошондой эле Урандыкына окшогон алсыз шакек системасы бар.");
                break;
            default:
                System.out.println("MЫНДАЙ ПЛАНЕТА ЖОК!!!");
        }
    }
}