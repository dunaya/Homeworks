import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;
    public class CaesarCodec implements Coder {
        HashMap<Integer, Integer> mapEncode;
        HashMap<Integer,Integer> mapDecode;
        public CaesarCodec(int codeKey){
            this.mapEncode = new HashMap<>();
            this.mapDecode = new HashMap<>();
            for(int i = 0; i < 26; i++){
                this.mapEncode.put(i, (i + codeKey) % 26);
                this.mapDecode.put((i + codeKey) % 26, i);
            }
        }
        @Override
        public String encode(String input) {
            String result = "";
            for(int i = 0; i < input.length(); i++) {
                if(this.mapEncode.containsKey(input.charAt(i) - 'a')) {
                    result += (char) ('a' + this.mapEncode.get(input.charAt(i) - 'a'));
                }
                else{
                    result += input.charAt(i);
                }
            }
            return result;
        }
        @Override
        public String decode(String input) {
            String result = "";
            for(int i = 0; i < input.length(); i++){
                if(this.mapDecode.containsKey(input.charAt(i) - 'a')) {
                    result += (char) ('a' + this.mapDecode.get(input.charAt(i) - 'a'));
                }
                else{
                    result += input.charAt(i);
                }
            }

            return result;
        }
        
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int codeKey = Integer.parseInt(in.nextLine());
            CaesarCodec caesarCodec = new CaesarCodec(codeKey);
            String input = in.nextLine();
            input = input.toLowerCase(Locale.ROOT);
            System.out.println(caesarCodec.encode(input));
            System.out.println(caesarCodec.decode(caesarCodec.encode(input)));
        }

    }
