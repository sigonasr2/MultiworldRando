package sig;

import java.util.Arrays;
import java.util.HashMap;
import java.lang.StringBuilder;

public class Node{
    HashMap<Node,Long[]> connections = new HashMap<>();
    int id;
    public Node(int id) {this.id=id;};
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
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("\nNode");
        sb.append("(");
        boolean first=true;
        for (Node n : connections.keySet()) {
            if (!first) {
                sb.append(";");
            } else {
                first=false;
            }
            sb.append(" ").append(id);
            sb.append("->");
            sb.append(n.id);
            sb.append(":(");
            for (int i=0;i<connections.get(n).length;i++) {
                if (i!=0) {
                    sb.append(")|(");
                }
                boolean f=true;
                for (int j=0;j<Restrictions.values().length;j++) {
                    if ((connections.get(n)[i]&(((long)1)<<(Restrictions.values()[j].ordinal()-1)))>0) {
                        if (!f) {
                            sb.append("&");
                        } else {
                            f=false;
                        }
                        sb.append(Restrictions.values()[j]);
                    }
                }
            }
            sb.append(")");
        }
        sb.append(")");
        return sb.toString();
    }
    
}