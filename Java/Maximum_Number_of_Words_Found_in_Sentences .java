class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords =0;
        for(int i = 0 ; i <sentences.length; i++)
        {
            String str = sentences[i];
            int words=0;
            for(int j = 0 ; j<str.length();j++)
            {
                if(str.charAt(j)==' ')
                {
                    words++;
                }
            }
            maxWords = Math.max(words,maxWords);
        }
        return maxWords+1;
        
    }
}