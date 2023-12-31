import java.util.Random;

public class RandomPassword {
    
    public static void main(String[] args) {

        int length = 8; // default password length
        
        // User-defined criteria
        int complexity = 2; // 1 for simple, 2 for medium, 3 for complex
        
        // Set password length based on complexity
        switch (complexity) {
            case 1:
                length = 6;
                break;
            case 3:
                length = 10;
                break;
            default:
                length = 8;
                break;
        }
        
        String password = generatePassword(length);
        System.out.println("Generated Password: " + password);
    }
    
    // Function to generate a random password
    public static String generatePassword(int length) {
        
        // Define allowed characters based on complexity        
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";
        String specialChars = "!@#$%^&*()_-+=<>?/{}~|";
        
        // Create a combined string of allowed characters based on complexity
        String allowedChars = lowerCase + upperCase + numbers + specialChars;
        
        Random random = new Random();
        StringBuilder password = new StringBuilder(length);
        
        // Generate random characters and append to the password string
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(allowedChars.length());
            password.append(allowedChars.charAt(randomIndex));
        }
        
        return password.toString();
    }
}
