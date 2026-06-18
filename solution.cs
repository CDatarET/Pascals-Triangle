public class Solution {
    public IList<IList<int>> Generate(int numRows) {
        IList<IList<int>> list = new List<IList<int>>();
        for(int i = 1; i <= numRows; i++){
            IList<int> t = new List<int>();
            for(int j = 1; j <= i; j++){
                if(j != 1 && j != i){
                    t.Add(list[i - 2][j - 2] + list[i - 2][j - 1]);
                }
                else{
                    t.Add(1);
                }
            }

            list.Add(t);
        }

        return(list);
    }
}
