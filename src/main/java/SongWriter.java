import java.util.Arrays;

public class SongWriter {
    String[] text;

    public SongWriter(String[] text){this.text=text;};
    public String getSingleLine(int index)throws IllegalArgumentException{
        if(index<1||index>text.length) throw new IllegalArgumentException();
        return text[index-1];}
    public String[] getSomeLines(int indexStart,int indexEnd){

        return Arrays.copyOfRange(text,indexStart-1,indexEnd);}
    public String[] getLines(){return text;}

}
