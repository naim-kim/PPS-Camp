// 스킬트리
//https://school.programmers.co.kr/learn/courses/30/lessons/49993

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int result = 0;

        for (String skillTree : skill_trees) {
            // remove if not part of the skill seq
            String filteredSkill = skillTree.replaceAll("[^" + skill + "]", "");

            // check if it matches prefix of skill ( 가장 첫번째랑 같은지)
            if (skill.startsWith(filteredSkill)) {
                result++;
            }
        }

        return result;
    }
}