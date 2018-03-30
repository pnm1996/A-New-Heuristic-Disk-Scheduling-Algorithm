# A-New-Heuristic-Disk-Scheduling-Algorithm
Here I have implemented 2 methods :

(i) In the first method, I sorted the disk accesses in ascending order and then found out the optimal direction of movement of the head based on it's current distance from both the ends.

(ii) In the second method, I extended the concept of two pointer algorithm. Here, I have made use of 2 disk heads - head and tail. Now, based on what distance to the neighbouring disk access is less I would move either the head or the tail to its next position. It will end when the head and tail pointers are side by side.
