//import java.util.*;
//
//public class GraphDfs {
//    static Set<Integer> depthFirstTraversal(Integer root) {
//        Set<Integer> visited = new LinkedHashSet<Integer>();
//        Stack<Integer> stack = new Stack<Integer>();
//        stack.push(root);
//        while (!stack.isEmpty()) {
//            Integer vertex = stack.pop();
//            if (!visited.contains(vertex)) {
//                visited.add(vertex);
//                for (Integer v : hashmap.get(vertex)) {
//                    stack.push(v);
//                }
//            }
//        }
//        return visited;
//    }
//
//    private static HashMap<Integer,LinkedList<Integer>> hashmap = new HashMap<>();
//
//
//    public static void addVertex(int v) {
//        hashmap.put(v,new LinkedList<>());
//    }
//    public static void addEdge(int u, int v) {
//        if(!hashmap.containsKey(u))
//            addVertex(u);
//
//            LinkedList<Integer> ll = hashmap.get(u);
//            ll.add(v);
//            hashmap.put(u,ll);
//    }
//
//    public void representation () {
//
//    }
//    public static void main(String args[]) {
//        System.out.println("hello");
//
//        Scanner sc = new Scanner(System.in);
//        int no_edges = sc.nextInt();
//        int i = 0;
//
//        while(i<no_edges) {
//            int u = sc.nextInt();
//            int v = sc.nextInt();
//            addEdge(u,v);
//            i++;
//        }
//
//        ;
//        for(Integer k :depthFirstTraversal(0)){
//            System.out.print(k + "  ");
//        }
//    }
//
//}
