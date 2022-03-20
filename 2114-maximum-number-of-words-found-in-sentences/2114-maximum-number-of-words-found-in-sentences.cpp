class Solution {
public:
    int mostWordsFound(vector<string>& sentences) {
        int ans=0;
        for(string s:sentences){
        int cnt=0;
            for(char ch:s){
                if(ch==' ')
                    cnt++;
            }
            ans=max(ans,cnt+1);
        }
        
        return ans;
    }
};