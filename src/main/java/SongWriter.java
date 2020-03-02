public class SongWriter {
    String[] text;

    public SongWriter(String[] text){this.text=text;};
    public String getSingleLine(int index){return text[index-1];}
    public String[] getSomeLines(int indexStart,int indexEnd){return null;}
    public String[] getLines(){return null;}

}
