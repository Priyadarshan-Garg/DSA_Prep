public class Performance {
    public static void main(String[] args) {
        String Series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+i);
           // System.out.println(ch);
            Series+=ch;
        }
        System.out.println(Series);
        // yha actually 26 new objects create hone pehla a,ab,abc,abcd ...... abcd...xyz wastage of space
        // uski overcome kanre ke liye string builder banaya hai
    }
}
