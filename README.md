# RubaAhmad
Deadlock Detection by Wait-For Graph 
First, the detection is started in DeadlockDetection.java
Second, you need to set the path  of your txt file in WaitForGraph.java 
Finally, To detect the cycle your schedule should be in this format: 
begin_1
lock-X(A)_1
read(A)_1
begin_2
begin_3
lock-S(C)_3
read(C)_3
lock-S(A)_3
read(a)_3
lock-S(B)_2
read(B)_2
commit_3
lock-X(C)_2
write(A)_1
read(C)_2
write(C)_2
commit_2
lock-X(B)_1
read(B)_1
write(B)_1
commit_1
