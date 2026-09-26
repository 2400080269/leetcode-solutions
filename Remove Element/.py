class Solution(object):
    def removeElement(self, arr, val):
        k=0
        for i in range(0,len(arr)):
            if(arr[i]!=val):
                arr[k]=arr[i]
                k=k+1
        return k
        
