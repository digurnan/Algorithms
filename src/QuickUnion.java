public class QuickUnion {


    private static int[] id;
    QuickUnion(int n) {
        id = new int[n];
        for(int i = 0;i < n;i++)
        {
            id[i] = i;
        }
    }
    private static int root(int i) {
        while(i!=id[i])
            i = id[i];

        return i;

    }

    private static boolean isConnected (int p,int q){
        if(root(p) == root(q))
            return true;
        else
            return false;
    }

    private static void union(int p, int q) {
        int i = root(p);
        int j = root(q);

        id[i] = j;
    }

    public static void main(String args[]) {
        QuickUnion quick = new QuickUnion(10);
        quick.union(1,2);
        quick.union(3,4);
        quick.union(4,5);
        for(int i: id) {
            System.out.print(i + " ");
        }
        System.out.println(quick.isConnected(1,3));

    }
}
