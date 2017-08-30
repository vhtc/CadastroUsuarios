import java.math.BigInteger;
import java.security.MessageDigest;

public class MD5 
{
    public static String md5Hash (String palavra)
    {
        try {
            MessageDigest m = MessageDigest.getInstance("MD5"); // SHA-256 
            m.update (palavra.getBytes(), 0, palavra.length());
            return new BigInteger (1, m.digest()).toString(16);
        }catch (Exception e)
        {
            System.out.println("Erro no MD5: "+ e);
        }
         return null;
    }
}
    

