package sig;

public class Node{
    Node north;
    long northR;
    Node east;
    long eastR;
    Node west;
    long westR;
    Node south;
    long southR;
    public Node(Node n,long nr,Node e,long er,Node s,long sr,Node w,long wr) {
        north=n;northR=nr;east=e;eastR=er;south=s;southR=sr;west=w;westR=wr;
    };
}