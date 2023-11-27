package leetcode;

public class CountAndSayIntVer {
    public String countAndSay(int n) {
        long intResult = 1;
        for (int i = 1; i < n; i++) {
            intResult = test(intResult);
        }
        return "" + intResult;
    }


    public long test(long m) {
        if (m / 10 == 0) {
            return m + 10;
        }

        int count;
        int tmp;
        long result = 0;
        int firstDigit = 0;

        while (m / 10 != 0) {
            count = 0;
            tmp = (int) m % 10;
            while (m % 10 == tmp) {
                count++;
                m /= 10;
                if (m == tmp) {
                    count++;
                    break;
                } else if (m < 10) {
                    firstDigit = (int) m;
                }
            }

//            System.out.println("tmp: " + tmp + " count:" + count);


            int digit = (result == 0) ? 0 : 1;
            long countDigit = result;
            while (countDigit / 10 != 0) {
                digit++;
                countDigit /= 10;
            }

            result = result + (long) Math.pow(10, digit) * (count * 10 + tmp);
//            System.out.println("firstDigit: " + firstDigit);
//            System.out.println("result without firstDigit: " + result);
            if (firstDigit != 0) {
                int countCount = 0;
                while (count / 10 != 0) {
                    countCount++;
                    count /= 10;
                }
//                System.out.println("digit: " + digit);
                result = result + (long) Math.pow(10, digit + 2 + countCount) * (10 + firstDigit);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        CountAndSayIntVer cs = new CountAndSayIntVer();
//        System.out.println(cs.test(123344));
        System.out.println(cs.countAndSay(11));
    }
}
