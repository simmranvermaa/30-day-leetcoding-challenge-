class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> x= new PriorityQueue<>();
        for(int stone:stones){
            x.add(-stone);
        }
        while(x.size()>1){
            int stoneOne=-x.remove();
            int stoneTwo=-x.remove();
            if(stoneOne!=stoneTwo){
                x.add(-(stoneOne-stoneTwo));
            }
        }
            if(x.isEmpty()) return 0;
            return -x.remove();
    }
}
