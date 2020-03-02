import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SongWriterTest {
    static String[] text={"On the first day of Christmas my true love gave to me: a Partridge in a Pear Tree.",
            "On the second day of Christmas my true love gave to me: two Turtle Doves, and a Partridge in a Pear Tree.",
            "On the third day of Christmas my true love gave to me: three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.",
            "On the fourth day of Christmas my true love gave to me: four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.",
            "On the fifth day of Christmas my true love gave to me: five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.",
            "On the sixth day of Christmas my true love gave to me: six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.",
            "On the seventh day of Christmas my true love gave to me: seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.",
            "On the eighth day of Christmas my true love gave to me: eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.",
            "On the ninth day of Christmas my true love gave to me: nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.",
            "On the tenth day of Christmas my true love gave to me: ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.",
            "On the eleventh day of Christmas my true love gave to me: eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.",
            "On the twelfth day of Christmas my true love gave to me: twelve Drummers Drumming, eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree."
    };
    String[] fragment2to7 ={"On the second day of Christmas my true love gave to me: two Turtle Doves, and a Partridge in a Pear Tree.",
            "On the third day of Christmas my true love gave to me: three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.",
            "On the fourth day of Christmas my true love gave to me: four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.",
            "On the fifth day of Christmas my true love gave to me: five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.",
            "On the sixth day of Christmas my true love gave to me: six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.",
            "On the seventh day of Christmas my true love gave to me: seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree."
    };
    String[] fifthLine ={"On the fifth day of Christmas my true love gave to me: five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree."
    };
    SongWriter songWriter;

    @Before
    public void setUp(){
        songWriter = new SongWriter(text);
    }

    @Test
    public void test_first_line(){
        assertEquals(text[0],songWriter.getSingleLine(1));
    }
    @Test
    public void test_fifth_line(){
        assertEquals(text[4],songWriter.getSingleLine(5));
    }
    @Test
    public void test_last_line(){
        assertEquals(text[11],songWriter.getSingleLine(12));
    }
    @Test
    public void test_some_lines(){
        assertEquals(fragment2to7,songWriter.getSomeLines(2,7));
    }
    @Test
    public void test_some_lines_one(){
        assertEquals(fifthLine,songWriter.getSomeLines(5,5));
    }
    @Test
    public void test_all_lines(){
        assertEquals(text,songWriter.getLines());
    }
    @Test(expected = IllegalArgumentException.class)
    public void test_single_line_below_one(){
        assertEquals(null,songWriter.getSingleLine(0));
    }
    @Test(expected = IllegalArgumentException.class)
    public void test_single_line_above_max(){
        assertEquals(null,songWriter.getSingleLine(100));
    }
    @Test(expected = IllegalArgumentException.class)
    public void test_some_lines_bad_partition(){
        assertEquals(null,songWriter.getSomeLines(5,3));
    }
    @Test(expected = IllegalArgumentException.class)
    public void test_some_lines_out_of_range(){
        assertEquals(null,songWriter.getSomeLines(5,100));
    }
}
