class Solution:
    
    def groupAnagrams(self, strs):
        
        # Create an empty dictionary to store the results
        result = {}

        # Loop through the provided list
        for i in strs:

            # sorting the individual word before joining
            x = "".join(sorted(i))

            # check for matching values and group them
            if x in result:
                
                result[x].append(i)
            else:

                result[x] = [i]

        # Return results
        return list(result.values())

# Create an object
ob1 = Solution()

# Print results
print(ob1.groupAnagrams(["eat", "tea", "tan", "ate", "nat", "bat"]))
