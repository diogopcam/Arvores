public class PrefixTree {
    private final Node raiz;
    private int size;

    PrefixTree(){
        raiz = new Node('s');
    }

    public boolean isEmpty(){
        return  raiz.filhos == null;
    }

    public void add(String s){
        char c = s.charAt(0);
        Node n = raiz;
        Node filho = n.filhos.get(c);
        if(filho == null){
            // se n tem filho igual
            filho = new Node(c);
            size++;
            //cadastra um novo nodo com esse novo character
            filho.filhos.put(c, filho);
        }
    }

    public void addUmaLetra(char letra){


    }

    public int size(){
        return size;
    }
}
