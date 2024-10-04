class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int n = skill.length;
        int totalskill = skill[0] + skill[n-1];
        long chemistrysum = 0;
        for(int i=0;i<n/2;i++)
        {
            if(skill[i]+skill[n-i-1] != totalskill)
            {
                return -1;
            }
             chemistrysum += (long)skill[i] * skill[n-i-1];
        }
       return chemistrysum;
    }
}