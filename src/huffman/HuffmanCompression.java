import java.util.*;

// Definition einer HuffmanNode-Klasse für den Huffman-Baum
class HuffmanNode implements Comparable<HuffmanNode> {
    char data; // Das Zeichen
    int frequency; // Häufigkeit des Zeichens
    HuffmanNode left, right; // Linkes und rechtes Kind

    public HuffmanNode(char data, int frequency) {
        this.data = data;
        this.frequency = frequency;
        left = right = null;
    }

    public int compareTo(HuffmanNode node) {
        return this.frequency - node.frequency;
    }
}

public class HuffmanCompression {
    // Funktion zum Komprimieren des Textes
    public static String compress(String text) {
        // Schritt 1: Berechne die Häufigkeit jedes Zeichens im Text
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : text.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Schritt 2: Erstelle eine PriorityQueue von HuffmanNodes
        PriorityQueue<HuffmanNode> pq = new PriorityQueue<>();
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            pq.offer(new HuffmanNode(entry.getKey(), entry.getValue()));
        }

        // Schritt 3: Baue den Huffman-Baum
        while (pq.size() > 1) {
            HuffmanNode left = pq.poll();
            HuffmanNode right = pq.poll();
            HuffmanNode parent = new HuffmanNode('\0', left.frequency + right.frequency);
            parent.left = left;
            parent.right = right;
            pq.offer(parent);
        }

        // Schritt 4: Erstelle das Huffman-Codierungsmapping
        Map<Character, String> huffmanCodes = new HashMap<>();
        generateCodes(pq.peek(), "", huffmanCodes);

        // Schritt 5: Kodiere den Text
        StringBuilder encodedText = new StringBuilder();
        for (char c : text.toCharArray()) {
            encodedText.append(huffmanCodes.get(c));
        }

        return encodedText.toString();
    }

    // Hilfsfunktion zum Generieren der Huffman-Codes
    private static void generateCodes(HuffmanNode root, String code, Map<Character, String> huffmanCodes) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            huffmanCodes.put(root.data, code);
        }
        generateCodes(root.left, code + "0", huffmanCodes);
        generateCodes(root.right, code + "1", huffmanCodes);
    }

    // Funktion zum Dekomprimieren des Textes
    public static String decompress(String encodedText, Map<Character, String> huffmanCodes) {
        StringBuilder decodedText = new StringBuilder();
        StringBuilder codeBuilder = new StringBuilder();

        for (char bit : encodedText.toCharArray()) {
            codeBuilder.append(bit);
            for (Map.Entry<Character, String> entry : huffmanCodes.entrySet()) {
                if (entry.getValue().equals(codeBuilder.toString())) {
                    decodedText.append(entry.getKey());
                    codeBuilder = new StringBuilder();
                    break;
                }
            }
        }

        return decodedText.toString();
    }

    public static void main(String[] args) {
        String text = "Dies ist ein Testtext für die Huffman-Kompression.";
        System.out.println("Originaltext: " + text);

        // Komprimiere den Text
        String compressedText = compress(text);
        System.out.println("Komprimierter Text: " + compressedText);

        // Dekomprimiere den Text
        String decompressedText = decompress(compressedText, generateHuffmanCodes(text));
        System.out.println("Dekomprimierter Text: " + decompressedText);
    }

    // Hilfsfunktion zum Generieren der Huffman-Codierung basierend auf dem Originaltext
    private static Map<Character, String> generateHuffmanCodes(String text) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : text.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<HuffmanNode> pq = new PriorityQueue<>();
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            pq.offer(new HuffmanNode(entry.getKey(), entry.getValue()));
        }

        while (pq.size() > 1) {
            HuffmanNode left = pq.poll();
            HuffmanNode right = pq.poll();
            HuffmanNode parent = new HuffmanNode('\0', left.frequency + right.frequency);
            parent.left = left;
            parent.right = right;
            pq.offer(parent);
        }

        Map<Character, String> huffmanCodes = new HashMap<>();
        generateCodes(pq.peek(), "", huffmanCodes);

        return huffmanCodes;
    }
}
