package sig;

import java.util.HashMap;

public class Node{
    HashMap<Node,Long[]> connections = new HashMap<>();
    public Node() {};
    public void add(Node n,Long...requirements) {
        if (!connections.containsKey(n)) {
            connections.put(n,requirements);
            n.add(this,requirements);
        }
    }
    /**
     * @param n The node to add.
     * @param inrequirements The requirements to get to the node.
     * @param outrequirements The requirements to get from that node back to the current node.
     */
    public void add(Node n,Long[]inrequirements,Long...outrequirements) {
        if (!connections.containsKey(n)) {
            connections.put(n,inrequirements);
            n.add(this,outrequirements);
        }
    }
}