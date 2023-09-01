class Solution {
    fun solution(n: Int, m: Int): IntArray {
        var answer = intArrayOf()
        var lcm = 1
        var gcd = 1
        if(n>=m)
        {
            for(i in 1..m){
                if((n % i == 0)&&(m % i == 0)){
                    lcm = i
                }
            }
            gcd = n * m / lcm
        }
        else
        {
            for(i in 1..n){
                if((n % i == 0)&&(m % i == 0)){
                    lcm = i
                }
            }
            gcd = n * m / lcm
        }
        answer = answer.plus(lcm)
        answer = answer.plus(gcd)
        return answer
    }
}

// 1. 최대공약수와 최소공배수 구하는 로직
// 2. n, m 중 큰값에 대해
// 3. 최대공약수는 m % k == 0 이 되는 가장 큰 k(없으면 1)
// 4. 최소공배수는 n * m / 최대공약수
// 5. 나중에 더 풀어보자
// 6. 최소 공배수 구하는거에서 수학적인 논리에서 시간쪼끔씀