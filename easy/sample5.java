class Solution{
    public static String nameInitials(String firstName, String lastName){
        String period = ".";
        return firstName.charAt(0) + period + lastName.charAt(0);
    }
}

