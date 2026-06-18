class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 1; i <= numRows; i++){
            List<Integer> t = new ArrayList<>();
            for(int j = 1; j <= i; j++){
                if(j != 1 && j != i){
                    t.add(list.get(i - 2).get(j - 2) + list.get(i - 2).get(j - 1));
                }
                else{
                    t.add(1);
                }
            }

            list.add(t);
        }

        return(list);
    }
}
