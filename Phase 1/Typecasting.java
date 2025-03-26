import java.sql.SQLOutput;

public class Typecasting {
    public static void main(String[] args) {
        //int num= 43.434  YEH ERROR DEGA
        int num =(int)(13.23); // YEH ISME SE SIRF INTEGER VALUE EXTRACCT KRKE PRINT KAR DEGA
        System.out.println(num);

        // AUTOMATIC TYPE PROMOTION
        int a =257;
        byte b= (byte)(a);
        //BYTE MAXIMUM 256 STORE KR SAKTA HAI PR HUMNE USSE JADA DE DIA TO YE (257%256 =1) KRKE USKE REMAINDER KO PRINT KREGA
        System.out.println(b);
    }
}
