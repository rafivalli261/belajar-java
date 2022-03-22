package dalampantauan;

// @author Rafi
public class CheckRotation {

    public static boolean isRotated(String str1, String str2) {
        if (str2.length() != str1.length()) {
            return false;
        }

        int n = str1.length();
        boolean flag1 = true, flag2 = true;

        for (int i = 0; i < n; i++) {
            if (str1.charAt(i) != str2.charAt((i + 2) % n)) {
                flag1 = false;
            }
            
            if (str1.charAt(i) != str2.charAt((n - 2 + i) % n)) {
                flag2 = false;
            }
            
        }
        return flag1 || flag2;
    }

    public static void main(String[] args) {
        
        String a = "amazon";
        String b = "azonam";
        
        System.out.println(isRotated(a, b));
    }
    
}
