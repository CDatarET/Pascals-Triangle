class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        ret = []
        for i in range(1, numRows + 1):
            t = []
            for j in range(1, i + 1):
                if j != 1 and j != i:
                    t.append(ret[i -2][j - 2] + ret[i - 2][j - 1])
                else:
                    t.append(1)

            ret.append(t)
        
        return ret
