package main;

public class GrayCode {
    class Solution {
        List<Integer> ans;
        HashSet<String> visit;
        public List<Integer> grayCode(int n) {
            visit = new HashSet();
            ans = new ArrayList();
            StringBuilder s = new StringBuilder();
            for(int i=0;i<n;i++)
                s.append('0');
            dfs(s,n);
            return ans;
        }
        void dfs(StringBuilder s,  int n)
        {
            if(visit.contains(s.toString()))
                return;
            visit.add(s.toString());
            ans.add(Integer.parseInt(s.toString(),2));
            for(int i=0;i<n;i++)
            {
                char o = s.charAt(i);
                char c = (o=='0')?'1': '0';
                s.setCharAt(i,c);
                if(!visit.contains(c))
                    dfs(s,n);
                s.setCharAt(i,o);
            }
        }
    }

}
