%Factorial de un número:
factorial(0,1).
factorial(X,Y) :-
   X>0,
   A is X-1,
   factorial(A,B),
   Y is X*B,
   !.
