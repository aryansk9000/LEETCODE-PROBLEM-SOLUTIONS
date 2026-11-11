class Solution:
    def __init__(self):
        self.ans = []
    def func(self, ind, sum, nums, candidates):
        if sum == 0:
            self.ans.append(nums[:])
            return
        if sum < 0 or ind == len(candidates):
            return
        nums.append(candidates[ind])
        self.func(ind + 1, sum - candidates[ind], nums, candidates)
        nums.pop()
        for i in range(ind + 1, len(candidates)):
            if candidates[i] != candidates[ind]:
                self.func(i, sum, nums, candidates)
                break
    def combinationSum2(self, candidates, target):
        candidates.sort()
        self.ans = []
        self.func(0, target, [], candidates)
        return self.ans
