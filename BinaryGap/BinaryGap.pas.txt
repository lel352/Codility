function solution(N: longint): longint;
var
  binario: string;
  tamanho,soma,inicio,fim: shortInt;  
begin
    (* write your code in Free Pascal 3.0 *)
    binario := Binstr(n,32);
    tamanho := 0;
    soma := 0;
    while(true) do begin
        inicio := pos('1',binario);
        if (inicio=0) then break;
        insert('*',binario,inicio);
        delete(binario,inicio+1,1);
        fim := pos('1',binario);
        if (fim=0) then break;
        soma := (fim-inicio-1); 
        if (soma > tamanho) then
           tamanho := soma; 
    end;
    exit(tamanho);
end;