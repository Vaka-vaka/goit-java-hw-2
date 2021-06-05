public class NameEncoderDecoder {
    public String encode(String name) {
        String a = name
                .replace( "a",  "5")
                .replace("o", "4")
                .replace("i", "3")
                .replace("u", "2")
                .replace("e", "1");
        String b = "NOTFORYOU" + a.strip() + "YESNOTFORYOU";
        return b;
    }

    public String decode(String name){
        String a = name
                .replace("5", "a")
                .replace("4", "o")
                .replace("3", "i")
                .replace("2", "u")
                .replace("1", "e");
      // String b = a.substring(9,18);

        String b = a.replaceAll("NOTFORYOU", "")
//                .replace("NOTFOR", "")
//                .replace("YOU", "")
////                .replace("O", "")
////                .replace("T", "")
////                .replace("F", "")
////                .replace("O", "")
////                .replace("R", "")
////                .replace("Y", "")
////                .replace("O", "")
////                .replace("U", "")
                .replace("Y", "")
                .replace("E", "")
                .replace("S", "");
             return b;
    }

    public static void main(String[] args) {
        NameEncoderDecoder names = new NameEncoderDecoder();

        String fullName = names.encode("NOTFORYOU");
        System.out.println("names.encode(\"Crab\") = " + fullName);

        String fullName1 = names.decode("NOTFORYOUNOTFORYOUYESNOTFORYOU");
        System.out.println("names.encode(\"Crab\") = " + fullName1);
    }
}
