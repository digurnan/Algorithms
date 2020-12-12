public class QuickFind {

    private static int[] id;
    QuickFind(int n) {
        id = new int[n];
        for(int i = 0;i < n;i++)
        {
            id[i] = i;
        }
    }

    private boolean isConnected (int p,int q) {
        return (id[p] == id[q]);

    }
    private static void union(int p,int q) {
        int pId = id[p];
        int qId = id[q];

        for(int i = 0;i<id.length;i++) {
            if(id[i] == pId)
                id[i] = qId;
        }

    }

    private static void find() {

    }
}
