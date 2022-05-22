
package Binary_Search;
//https://leetcode.com/problems/first-bad-version/
public class first_bad_version_leetcode {
    /* The isBadVersion API is defined in the parent class VersionControl.
          boolean isBadVersion(int version); */
    public class Solution extends VersionControl {
        public int firstBadVersion(int n) {
            int s=1,e=n,m=0;
            while(s<=e){
                m = s + (e-s)/2;
                if(isBadVersion(m)){
                    e = m-1;
                }
                else if (isBadVersion(m) == false) {
                    s= m+1;
                }

            }
            return s;
        }
    }
}
