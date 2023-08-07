class Solution {
    int answer = Integer.MAX_VALUE;
    int total = 0; //총 곡괭이 갯수
    int[] visited; //곡괭이 종류별 사용횟수
    
    public int solution(int[] picks, String[] minerals) {
        visited = new int[picks.length];
 
        for (int pick : picks) {
            total += pick;
        }
        //dfs 함수 호출
        for (int i = 0; i < picks.length; i++) {
            if (picks[i] == visited[i]) {
                continue;
            }
            visited[i]++;
            dfs(1, 0, i, 0, picks, minerals);
            visited[i]--;
        }
 
 
        return answer;
    }
 
    private void dfs(int count, int startMineralsIdx, int pickIdx, int sum, int[] picks, String[] minerals) {
        //sum -> 누적 피로도, pickIdx -> 곡괭이 종류 인덱스

        //초기 피로도가 answer보다 크거나, startMineralIdx가 광물 총 갯수보다 크면 return
        if (answer <= sum || startMineralsIdx >= minerals.length) {
            return;
        }       
 
        int add = 0; //피로도 합계

        for (int i = startMineralsIdx; i < startMineralsIdx + 5; i++) {
            //startMineralIdx가 총 광물 갯수를 초과하면 break;
            if (i >= minerals.length) {
                break;
            }
 
            String mineral = minerals[i];

            //곡괭이-미네랄 종류에 따른 피로도 합산
            if (pickIdx == 0) {
                add += 1;
            } else if (pickIdx == 1) {
                add += mineral.equals("diamond") ? 5 : 1;
            } else if (mineral.equals("diamond")) {
                add += 25;
            } else {
                add += mineral.equals("iron") ? 5 : 1;
            }
        }

        //count가 총 곡괭이 갯수를 초과하거나 다음 곡괭이가 캘 수 있는 광물의 갯수가 총 미네랄 갯수를 초과하면 answer과 sum+add 중 작은 값을 return
        if (count >= total || startMineralsIdx + 5 >= minerals.length) {
            answer = Math.min(answer, sum + add);
            return;
        }

        //곡괭이 종류별 갯수보다 사용횟수가 작으면 continue
        for (int i = 0; i < picks.length; i++) {
            if (picks[i] == 0 || picks[i] == visited[i]) {
                continue;
            }
 
            visited[i]++;
            dfs(count + 1, startMineralsIdx + 5, i, sum + add, picks, minerals);
            visited[i]--;
        }
    }
}
