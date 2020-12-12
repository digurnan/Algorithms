public class UnionFindWeighted {

    private static int[] id;
    private static int[] sz;
    UnionFindWeighted(int n) {
        id = new int[n];
        sz = new int[n];
        for(int i = 0;i < n;i++)
        {
            id[i] = i;
        }
        for(int i = 0;i < n;i++)
        {
            sz[i] = 1;
        }
    }
    private static int root(int i) {
        while(i!=id[i]){
            id[i] = id[id[i]];
            i = id[i];
        }


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

        if(sz[i] < sz[j]) {
            id[i] = j;
            sz[j] = sz[j] + sz[i];
        }
        else {
            id[j] = i;
            sz[i] = sz[i] + sz[j];


        }
    }

    public static void main(String args[]) {

        UnionFindWeighted uf = new UnionFindWeighted(10);
        uf.union(2,4);
        uf.union(4,9);
        uf.union(5,6);

        System.out.println(uf.isConnected(1,2));
        System.out.println(uf.isConnected(5,6));
        System.out.println(uf.isConnected(4,9));

        UnionFindWeighted quick = new UnionFindWeighted(10);
        quick.union(1,2);
        quick.union(3,4);
        quick.union(4,5);
//        for(int i: id) {
//            System.out.print(i + " ");
//        }
        System.out.println(quick.isConnected(1,3));
        System.out.println(quick.isConnected(1,2));
        System.out.println(quick.isConnected(4,5));


    }
}

