package sig;

import java.util.List;

public class Node{
    Node north;
    List<Restriction> northR;
    Node east;
    List<Restriction> eastR;
    Node west;
    List<Restriction> westR;
    Node south;
    List<Restriction> southR;
}