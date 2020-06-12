function solution(N) {
    // write your code in JavaScript (Node.js 8.9.4)
    var binary = ((N).toString(2)).split("");
    var size = 0;
    var sum = 0;
    var start = 0;
    var final = 0;
    while (true){
        start = binary.indexOf('1');
        if (start == -1) break;
        binary[start] = '*';
        final = binary.indexOf('1');
        if (final == -1) break;
        sum = (final - start - 1);
        size = (sum > size)? sum: size;
    }
    return size;
}