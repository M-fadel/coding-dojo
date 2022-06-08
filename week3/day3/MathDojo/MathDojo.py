class MathDojo:

    def __init__(self):
        self.result = 0

    def add(self, num, *nums):
        # your code here
        self.result += num
        for i in range(len(nums)):
            self.result += int(nums[i])
        return self

    def subtract(self, num, *nums):
        # your code here
        self.result -=num
        for i in range(len(nums)):
            self.result -=nums[i]
        return self

# create an instance:
md = MathDojo()
# to test:
x = md.add(2).add(2,5,1).subtract(3,2).result
print(x)	# should print 5
# run each of the methods a few more times and check the result!
md.add(4,53,3,4)
md.add(6,md.result,md.result,md.result,md.result,md.result)
print(md.result)
md.add(33*md.result,33*md.result,33*md.result,33*md.result)
print(md.result)
md.subtract(md.result)
md.subtract(5)
print(md.result)