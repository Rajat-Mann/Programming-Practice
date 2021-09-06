# pattern matching
def find(text,pattern):
     n=len(text)
     m=len(pattern)
     i=0
     while i<=n-m :
          for j in range(m):
               if(text[i+j] is not pattern[j]):
                    break;
               if(j==m-1):
                    print("The Pattern is found at index", i)   
          i=i+1          


if __name__ == '__main__':
     text = "ABCABAABCABAC"
     pattern = "CAB"
     find(text,pattern)
