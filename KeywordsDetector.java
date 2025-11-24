public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        
        for (int i = 0; i < sentences.length; i++){

            for (int j = 0; j < keywords.length; j++)

                if (contains(lowerCase(sentences[i]), lowerCase(keywords[j])))
                    System.out.println(sentences[i]);

        }

    }


    public static boolean contains(String str1, String str2) {
        
    if (str2.length() == 0) return true;
    if (str2.length() > str1.length()) return false;

    int n1 = str1.length();
    int n2 = str2.length();
    
    for (int i = 0; i <= n1 - n2; i++) {
        int j = 0;

        while (j < n2 && str1.charAt(i + j) == str2.charAt(j)) {
            j++;
        }

        if (j == n2) return true;

    }

    return false;
    }


    public static String lowerCase(String str) {
        
        for (int i =  0; i < str.length(); i++){

            if ((0 + str.charAt(i)) > 64 && (0 + str.charAt(i)) < 91)
                
                str = str.replace(str.charAt(i), (char) (str.charAt(i) + 32));                
            
        }

        return str;
    }
}
