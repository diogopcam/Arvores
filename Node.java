import java.util.HashMap;
import java.util.Map;
public class Node {
    final char letra;
    // Node left;
    // Node right;
    final Map<Character, Node> filhos;
    
    public Node(char letra){
        this.letra = letra;
        filhos = new HashMap<>();
    }
}
