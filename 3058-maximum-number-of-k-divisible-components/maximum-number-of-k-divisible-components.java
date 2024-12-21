class Solution {
    public int maxKDivisibleComponents(int n, int[][] edges, int[] values, int k) {
        List<Integer>[] adj = new ArrayList[n];
        for(int i=0 ; i<n; i++)
        {
            adj[i]= new ArrayList<>();
        }
        for(int []e: edges)
        {
            int a=e[0];
            int b=e[1];
            adj[a].add(b);
            adj[b].add(a);
        }
        int cc[]=new int[1];
        dfs( 0, -1, adj, values, k, cc );
        return cc[0];
    }
    long dfs(int curr , int par, List<Integer>[]adj, int[] node, int k, int[] cc)
    {
        long sum=0;
        for(int ng: adj[curr])
        {
            if( ng!=par )
            {
                sum+=dfs( ng, curr, adj, node, k, cc );
            }
        }
        sum+=node[curr];
        if(sum%k==0)
        {
            cc[0]++;
            sum=0;
        }
        return sum;
    }
}