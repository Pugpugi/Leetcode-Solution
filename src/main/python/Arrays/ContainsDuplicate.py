# to find if the code contains any duplicate I went through all the numbers and returned True if it's in the set else added in the set

class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        seen = set()
        for num in nums:
            if num in seen:
                return True
            else:
                seen.add(num)
        return False
