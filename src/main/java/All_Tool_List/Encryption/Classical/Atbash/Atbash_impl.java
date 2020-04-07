package All_Tool_List.Encryption.Classical.Atbash;

public class Atbash_impl {
    public String AtbashEnCode(String Source)
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Source.length(); i++) {
            char c = Source.charAt(i);
            if(c>=65&&c<=90)
                c = (char)(90-(c-65));
            if(c>=97&&c<=122)
                c = (char)(122-(c-97));
            sb.append(c);
        }
        return sb.toString();
    }
}
