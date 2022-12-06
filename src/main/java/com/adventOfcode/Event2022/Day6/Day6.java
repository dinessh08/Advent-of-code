package com.adventOfcode.Event2022.Day6;

public class Day6 {
    public static void main(String[] args) {

        String input = "dvgdvvbpbtbhbdhbhmmmcctmcmccggtrgghnhmnnqffpcprrqssnhsnhnshhsrsqqhchcdcfcqqcncrrzpppmzpzzhjzzzvrvnnpbpzzswzwswnngjgjgcjcfcllhffjbfjfhhppvnppfmfcmmcnnmnfnzfnzffphpnnnsvswvvnwnfntftjftfvvztzqzhzddttjpjbpphhlnnwgnwggdmmczclczzqddlcdldrlrccfflwwgqwwrjwrwzrrsdrrfssddcmmvrvlvhvfhfzhzbhbzzdmdvvsppwswmwdwjjzmzhhvghgthghvvtcthcttgsttpqpbbhthppzznntpnttshtshthhwrrgbbjzbjblblzbllcblcblbvvqfqqnjqqhfhftftwfftvvmddgzzmdzmdmtttttqmqmnqmqpmqpqqjlldpllfvlffjdfjjvlvjjjjbsjbjnnhmnhnrrwtrrfvvtppwmmpnnjbnjjcncjcttrcrjjlqjljccpzccvqvzzscctgccsmmnznhzhnnjggmjgmgjgtgtlgglhhrlhhrvhvrvtvvlvvwmmrjjzqqbzqqtgtzgttmgggwpgwgbwggwwprwwvswszznczncnccjnccjdjdjssqmmgcmcjmmhwhswhwdwrddtccmzmjmsmrmrddhrhhqbbspbsppqvqmvqmmclcddzjzvvslsffdhhqgqrqjrqjqjrrmpmrppcjpjffwhfwwppqvvzjzqqtftgfghgpglgnglldlvvwzwmmfzzhzmzhhswhhnvhvphpmphphrrwwfccmgmqgmmzgmgngznnzbzttjwttgngzzdndffwhfwhhlmllwqlwwgfgfpfnnldnldndbdcdddmbdmbbdpbpwbpptrrpggtrtrnttsmmcrmmlhltlgttblttbhttjzzvnnsbsqbqwbbtwtmtbbcjcljjslscswwglgqlgqgmmcpctcrttprpjjfvjfjqqljlvjljnnfhhfzhzmhmghhjnhjjbppmqqwlwswwgbbzszspzsppcscvvnhndhdwdmdrdssqrqdqsddnbnpplqppjbjdbdqdcccffsnntzntnmnlnbbrzzzvgvvqttbbzpbzpzdpdvppjmjpjbbdrbbgwgffzpzzjddmldlwwjdwwscwcfccnznmmfttvvmpmvpmvmcvmmjmwjwbbwqwjjzqjzjbbjqbjqqqthhsssmrsshvvprvvwccjlcctwwmgwgpwgpgcpptrppjppltlhthctttfptppwgpwprpbbqzbzznssfcsffbnnndffqmmqwmmpvvpvdppjqqttfpttjccbnbddvtdvddlsstjtccphchsswbbrqqgtqgqpqjqnjjvccwscwssjwjttqvtvmtmjjghghccpnpsplslmmfjfjtffgtgrtrftfhttpsttzzmhmllwqwhhnffdpffwbwnnbrrfbrrnjrjlljqqnjqnqqwlqqbbbtvvwgvgbgddpwdwvdwvdvvwzvwwtzwttppnttqccjtjrttqbbprpsrpssfjsffmdfmfbmbggjhggcjgcgvvjqqbhbllhrlhlclzzplpqqdtddrhhfssdvsvrrscsjjnwjjfpjfffcbfcfmmlpmphhhlpltptcpttppfssppgwppjgjnnblbhbtbrbgbpplnlvlsvlvwvwpptmtsswzswsnscsfcsfsfggzhghvvgbbfddgbbrmrtrqtthvhzhzthtbtjjcljjlcllzglzzdszdzjzjfzzzblbslbljjdnndvvnwnqnwqqscscmczcwwvrrlclttbtdtvddbrddvllnppvpmvmbbvfvttfcttggwgffrfwwwpwcpchppcrrgprgprgrjgjdgdgvddzndzdbzzswsvvtgtccrrnggbwggpjpnnsjjwfjjqfqvffrrhdrrsfrfjjfzfdzzqfqwbztszjqtttfdqvzmznzjlsjnwdthtwdtfslgdmgfpwsqcsqdhnsnsmghttfvlzqgspzdtlstdmthzftwmnqrznldpmwqbtthggjwcgjjmbpqgrnwspggjvrlcmtvpchmqhlwwtswqgpdjpbznqnssqhdjzgbjnfmgssrvnmmcvvhgmcvqbfdhgrhnqqzdmttmdzwgtprzqhplwnhhmlrvcbwpllqprtltdvqrwhvwzvlqsvfqsfjwmrnzlqpdgfpmtfdczqdnfjjbjmrdnffcmtwlzcmvnwmlpmqhvggdhptnzlvzwzwjbcszsnzgpwncfgvzfgbzwclvrbmllzpltzwjrftmppsfwhvvvhvqjtstnnczgtdbmpjjsscbdwplftgcgmtrnrnzplzhghrqgdtjwntwfstjwqjjrlhtwhnfqwfqgsjptjfpsrbnvvlgsltnvtfvscttwvrfzblzmfmnfrlrnzrrzhclggtntpjbbcphdvrfhnrtzvdmwbwgbftgzwlcqztghdhdmzwlmjbgptfnnzbmwsnzlzcpprqzmbbdsplmhpgmzthqcsfjcnfbfvsdsqzfvfcnpgqsvpgwsdbgjmsglrwmfjfpddczwvgdppfmrtszbtfdwbmlmzhqvvwmvlzvjfpffjnhwwhssfjnbzlqwqvjbjbhfntmhgswntdpbzlwwfbdbhrfhzfjsjbtlrqhlnrpfbwtpmrfvbhlmmsgtvcmrqmdpwvhqfqpgmfgnfrbvprhprtnpzjcnltndfsvjgndwblhwphtpsmnczgbtpwdvjsrctjbvbfslvslzlwbtstqvgcrqmfphwztpjqdmvcjpjqmjbdndfpzwsfwplchsmqwwbggptjdtztszmpfwgfwnqpdwfcpgrrhmfglsctjllflfltbcfvcpfcnqbwrvzmcmjpwptgsrlbrdchngwsdstfmcbrqvdsvvbnppdmnfwcgvpjjzqwcpvqfncvqlsfnjzprvhpgqscshqwsttdrsmqjfwlhcwlvnzvgvclqfjdgctvsrbwzflcldmrwlfhbgdtstqsqlblndnpgqlfbjzslcpcwvdwdffshhrzvhqwdsdmwtmtvcnrhmstvrnscppmbpmjbfjhljmsjnbjlhjhmnmcvvfgbdrblwbzrcctrjwjjwjtgnfjhhqbsmdjvdrdjtjbscfrsljnvqjlgjwqrvfmdttsvqjwdbswdtcfqsrpbvzrbsdqlqfjlrgcwzbqtqrpsrfcmbzcvjngcsmvqlbnghllcqcztbtvdrfcmpgfdprghsmbjvzbdnrdqnjdzslclgdsqglvpvcjpzqfwztlssljtmcdfcqdnqzwcttvpqfdpvzlhjfvvsgphgqrmzppvnjznqmdzfnfztjppstjfwddftcpcjnssznqbrvlvrzfhbvsjrwghttwlwfrptsvsrwfnvjtthwrppbngbgqvbsdgcrjcwjjljcwptrvgmbjpjtdbmhmzcfhzbsbrmzhdsrjbbmnwbsntpffdrrlgcrcgbcfwvlpmrzvsmvpjthtdjdvcspdsdvshlrwzcqnjmcnrgzbqzhfzbmtrvzzmjwbnjggtrtgcsnrmzbtjzgdmffdntspdhgnvgrmpbtnsspcqhsrvppjbrmdbggjbftnnbrgdsmdscqthdzflldfnplqccthpwccsfsnstttwztqnmnfshntqngmcndbsbftmgnhhwjvhchdfqzzgpdnfgvnjzjzfdzvsvtdqqcftrvmdcszcwpfrbcsmlqqfprrjgncwcvcngmrnwntcvzzlnwrhrznnldslhqdscbgsrqnvnmdtqvlttwqljmvbpbfldtbgzhvwzghnhwrwdqphhhgjpnmtlcmvfbdffnsvcswtmffzsrvczbntfpdsmwbqphvvcflpwgsrmjhrljlvzdgrcwpfphmvtwqwhjmrvmjzjlzlbflhzrdrzcdwhblpqwjljbvprddtvnccmchgctncwbpnmlqppfmhwchvjvpmblqhccfhlprdrczdfhmnsqhddbqlppgsnvhhfrwhqhfdpvsfcvzbqhgswtmnpmzrwsvnmztnqwdrhllssmgtzbztsprpsj";
        //"zcfzfwzzqfrljwzlrfnpqdbhtmscgvjw";
        //"nznrnfrfntjfmvfwmzdfjlvtqnbhcprsg";
        //"nppdvjthqldpwncqszvftbrmjlhg";
        //"bvwbjplbgvbhsrlpgdmjqwftvncz";
        //"mjqjpqmgbljsphdztnvjfqwrcgsmlb";
        System.out.println(calculate(input));
    }

    static int calculate(String input) {

        int result = 0;
        int beginIndex = 0;
        int endIndex = 14;
        while (endIndex < input.length()) {
            String slidingWindow = input.substring(beginIndex, endIndex);
            boolean isRepeated = false;
            outerloop:
            for (int i = 0; i < slidingWindow.length(); i++) {
                for (int j = i + 1; j < slidingWindow.length(); j++) {
                    if (slidingWindow.charAt(i) == slidingWindow.charAt(j)) {
                        isRepeated = true;
                        break outerloop;
                    }
                }
            }
            if (!isRepeated) {
                System.out.println("EndIndex:" + endIndex);
                return endIndex;
            }
            endIndex++;
            beginIndex++;
        }
        return result;
    }
}
