package All_Tool_List.Tool.TextModify.Text_segmentation;

public class Text_segmentation_impl {
    public String Text_segmentation(String sourcestr,String segmchar,int segmnumber){

        StringBuilder sb = new StringBuilder(sourcestr);
        int i = sourcestr.length() / segmnumber;
        int j = sourcestr.length() % segmnumber;

        if (segmchar.length()<=0)
        {
            segmchar = " ";
        }

        for (int x = (j == 0 ? i - 1 : i); x > 0; x--) {
            sb = sb.insert(x * segmnumber,segmchar);
        }

        return sb.toString();
    }
}
