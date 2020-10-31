package day7;

/**
 * @description: 第K个数 leetcode-面试题17.09
 */
public class GetKthMagicNumber {

    public int getKthMagicNumber(int k) {
        int[] numList=new int[k+1];
        int p3=0,p5=0,p7=0;
        numList[0]=1;
        for(int i=1;i<k;i++){
            numList[i]=Math.min(Math.min(numList[p3]*3,numList[p5]*5),numList[p7]*7);
            if(numList[i]==numList[p3]*3) {
                p3++;
            }
            if(numList[i]==numList[p5]*5) {
                p5++;
            }
            if(numList[i]==numList[p7]*7) {
                p7++;
            }
        }
        return numList[k-1];
    }

}
