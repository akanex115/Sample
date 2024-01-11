
public class SevenNumber {

    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++) {
            //7で割り切れるとき＋10で割ったら7になる＋10で割ったら余りが7
            if(i % 7 == 0 || i / 10 == 7 || i % 10 == 7 ) {
                System.out.println("clap!");
            }else {
                System.out.println(i);
            }
        }

    }

}
