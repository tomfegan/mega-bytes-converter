public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if(kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megaByteConversion = kiloBytes / 1024;
            int remainingKiloBytes = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaByteConversion +
                    " MB and " + remainingKiloBytes + " KB");
        }
    }
}
