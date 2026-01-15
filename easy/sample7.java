class Solution {
    public static boolean isSwapBigger(int n) {
        // 数値から文字列
        String original = String.valueOf(n);
        // 2文字入れ替え
        String swapped = "" + original.charAt(1) + original.charAt(0);

        // 文字列として比較(辞書順)
        return original.compareTo(swapped) <= 0;
    }
}