class Solution {
    public int solution(int N) {
        StringBuilder numeroBinario = new StringBuilder(Integer.toBinaryString(N));
        byte tamanho = 0;
        byte inicio,fim;
        byte soma = 0;
        while (true) {
            inicio = (byte) numeroBinario.indexOf("1");
            if (inicio ==-1) break;
            numeroBinario.setCharAt(inicio,'*');
            fim = (byte) numeroBinario.indexOf("1");
            if (fim==-1) break;
            soma = (byte) (fim-inicio-1); 
            tamanho = (soma > tamanho)?soma:tamanho;            
        }
        return tamanho;
    }
}