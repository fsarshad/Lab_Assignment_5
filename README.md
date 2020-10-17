# Lab_Assignment_5


When trying to run the different functions one at a time in the main follow the following:

First Add Method 

1. Comment out line 157, 159, 160, 161, 162, and 163
2. If you want to adjust the numbers and not have 6 as the number: 
    - Go to line 151 and inside the for loop replace the number 6 in i < 6
    - Then go to line 155 and replace the number 6 in "list.add(6)" with the same identical number you changed in line 151. 
    - ex: if you want to have the number as 7: 
        - then go to line 151 inside the forloop and change it to i < 7
        - then go to line 155 and replace the list.add(6) to list.add(7) 
        
Second Add Method 

1. Uncomment line 157 
2. Comment out lines 155, 159, 160, 161, 162, and 163
3. If you run it the output will look like this:
     6->1->2->3->4->5
4. I am not sure if you wanted it to look that since in the file on the output it shows:
     6->1->2->3->4
5. If you want it like this (even though I think its a mistake): 
     6->1->2->3->4
6. Go to line 151 and change i < 6 to i < 5 and it will give you 6->1->2->3->4 


Get Method 

1. Comment out lines 155,157,160,161,162,163
2. keep line 158 uncommented
3. Also Uncomment out line 159 
4. This is based off the other method:  
      - Now go to line 151 and if you have changed the i < 6 to i < 5 because you wanted to check 6->1->2->3->4 , change it back to i < 6 for this problem  
5. Once you adjusted line 151 or already had line 151 from the beginning to be i < 6 run the program if you want the position to be 2 and output to be 3. 
6. Output should look like this:
      1->2->3->4->5
     
                3
7. If you want the position to be 3 and output to be 4 then go to line 159 and change the 2 to 3 and the output for position 3 will be 4. Same list as before as wll
             1->2->3->4->5
        
8. If you want to inrease the list length:
      - For example you want it to be 20 than go to line 151 switch it to: i < 20
      - Go back to 159 and input whatever position you want to get. So if I want position 5 (put it inside the list.get() in line 159 
      - The output should be 6

Remove Method 

1. Comment out lines 155,157,159,162,163
2. Keep line 158 uncommented 
3. Also uncomment out line 160, and 161 
4. Go to line 151 change the i < 20 back to i < 6 and because the position is already set to 4 you can just run the program. 
5. The output will be like this: 

-     1->2->3->4->5
-       5 (number being remove)
-     1->2->3->4
     

6. If you want to change the length or the numbers of numbers in the list than go to line 151 and switch the 6 in i < 6  to whatever number you please along
      with the position you want it to be in line 160. 

Reverse Method 

1. Comment out lines 155,157, 158, 159, 160,
2. Un comment lines 161, 162, 163 
3. So currently you would have in lines 151 for i < 6 if you were following the previous steps.  
4. On line 162 is where you change your head. So currently I have entered the head to be 5.
5. If you run it with the i < 6 in line 151 and head to be 5 in line 162 than the out put should look like this. 
     - 1->2->3->4->5
     - 5 (the head) 
     - 5->4->3->2->1
 6. This should work for any scenario just change the i < ... to whatever number and the head that is part of the list you created. 
 
 
 Conclusion:
 
 All my functions should work with whatever scenarios you throw at it. 
 

