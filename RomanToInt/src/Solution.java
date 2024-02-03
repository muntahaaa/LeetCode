import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        char[] num = s.toCharArray();
        int sum = 0;

        for (int i = 0; i < num.length - 1; i++) {
            char keyToFind1 = num[i];
            char keyToFind2 = num[i + 1];

            if (romanMap.containsKey(keyToFind1) && romanMap.containsKey(keyToFind2)) {
                int value1 = romanMap.get(keyToFind1);
                int value2 = romanMap.get(keyToFind2);

                if (value1 >= value2) {
                    sum += value1;
                } else {
                    sum -= value1;
                }
            }
        }

        // Add the value of the last numeral
        sum += romanMap.get(num[num.length - 1]);

        return sum;
    }


    public static void main(String[] args) throws Exception {
       
    Solution solution = new Solution();

    // Test cases
    String romanNumeral1 = "III";
    System.out.println(romanNumeral1 + " -> " + solution.romanToInt(romanNumeral1));

    String romanNumeral2 = "IV";
    System.out.println(romanNumeral2 + " -> " + solution.romanToInt(romanNumeral2));

    String romanNumeral3 = "IX";
    System.out.println(romanNumeral3 + " -> " + solution.romanToInt(romanNumeral3));

    String romanNumeral4 = "LVIII";
    System.out.println(romanNumeral4 + " -> " + solution.romanToInt(romanNumeral4));
    }
}
