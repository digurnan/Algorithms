import java.util.*;

public class GraphClass {

    static HashMap<Integer,LinkedList<Integer>> hashmap = new HashMap<>();

    public static void addVertex(int v) {
        hashmap.put(v,new LinkedList<>());
    }

    public static void addEdge(int u,int v) {
        if(!hashmap.containsKey(u))
            addVertex(u);
        LinkedList<Integer> listOfVertex = hashmap.get(u);
        listOfVertex.add(v);
        hashmap.put(u, listOfVertex);
    }

   public static Set<Integer> Bfs(int root){
       Set<Integer> visited = new LinkedHashSet<>();
       Queue<Integer> queue = new LinkedList<>();
       queue.add(root);
       visited.add(root);
       while (!queue.isEmpty()) {
           Integer vertex = queue.poll();
           for (Integer v : hashmap.get(vertex)) {
               if (!visited.contains(v)) {
                   visited.add(v);
                   queue.add(v);
               }
           }
       }
       return visited;
   }

    public static void BfsUtil(Integer source) {
        Set<Integer> visited = new LinkedHashSet<Integer>();
        Set<Integer> set = Bfs(source);
        for(Integer vertex: set)
            System.out.print(vertex + " ");
        System.out.println();
    }

    public static void DfsRecursive(int root, Set<Integer> visited){
        visited.add(root);
        System.out.print(root + " ");
            for (int dest : hashmap.get(root)) {
                if (!visited.contains(dest))
                    DfsRecursive(dest, visited);
            }
    }
    public static void DfsUtilRecursive(Integer source) {
        Set<Integer> visited = new LinkedHashSet<>();
        DfsRecursive(source,visited);
    }


    public static void Dfs(int root, Set<Integer> visited){
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Integer vertex = stack.pop();
            visited.add(vertex);
            System.out.print(vertex + " ");
            for (int dest : hashmap.get(vertex)) {
                if (!visited.contains(dest))
                    stack.push(dest);
            }
        }
    }

    public static void DfsUtil(Integer source) {
        Set<Integer> visited = new LinkedHashSet<>();
        Dfs(source,visited);
    }

    public static void PrintConnectedComponents() {
        Set<Integer> visited = new LinkedHashSet<>();
        for (Map.Entry<Integer, LinkedList<Integer>> set : hashmap.entrySet()) {

            if(!visited.contains(set.getKey()))
                Dfs(set.getKey(), visited);
            System.out.println();
        }
    }

    public static void printGraphMap() {
        for (Map.Entry<Integer, LinkedList<Integer>> set : hashmap.entrySet()) {
            System.out.print(set.getKey());
            LinkedList<Integer> list = set.getValue();
            for(Integer i: list) {
                System.out.print(" ->" + i );

            }
            System.out.println();
        }
    }
    public static void main(String args[]) {

        addVertex(0);
        addVertex(1);

        addVertex(2);
        addVertex(3);
        addVertex(4);

        addEdge(0,1);
        addEdge(0,2);
        addEdge(1,3);
//        addEdge(0,1);
//        addEdge(2,0);
//        addEdge(2,3);
////        addEdge(3,2);
//        addEdge(3,4);
//        addEdge(4,3);

        printGraphMap();
        System.out.println("completed Print Map Function");

        DfsUtil(0);
        System.out.println("completed DFS Function");

        DfsUtilRecursive(0);
        System.out.println("completed DFS Recursive Function");

        PrintConnectedComponents();
        System.out.println("completed Connected Components Function");


        BfsUtil(0);
        System.out.println("completed BFS Function");

    }
}