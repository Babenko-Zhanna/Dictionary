import java.util.List;

public class Dictionary {
    private List<Word> words;

    public Dictionary(List<Word> words) {
        this.words = words;
    }

    public String translation(String value) {
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).getValue().equalsIgnoreCase(value)) {
                return words.get(i).getTranslation();
            }
        }
        return "";
    }

    public String getWordByTranslation(String translation) {
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).getTranslation().equalsIgnoreCase(translation)) {
                return words.get(i).getValue();
            }
        }
        return "";
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.size(); i++) {
            sb.append(words.get(i)).append(System.lineSeparator());
        }
        return sb.toString();
    }

    public void addWord (Word word) {
        words.add(word);
    }
}
