function solution(A: array of longint; N: longint): longint;
var
  i, result: longint;
begin
  result := 0;
  for i := 0 to N-1 do
    result := result xor A[i];
  solution := result;
end;
