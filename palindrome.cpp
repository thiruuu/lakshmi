#include <iostream>
    #include <stack>
    #include <queue>
    #include <string>
    using namespace std;

    int main (void)
    {
      stack <char> s;
      queue <char> q;
      string letter;
      int length;

      //cout<<"Please enter a series of characters."<<endl;
      getline (cin, letter);
      length = letter.size();

      for (int i=0; i<length; i++)
        {
          q.push(i);
          s.push(i);
        }

         bool isPalindrome = true;
         while (isPalindrome==true && (!s.empty() && !q.empty()))
         {
           if (s.top() != q.front())
            {
              isPalindrome = false;
            }
          else
           {
            q.pop();
            s.pop();
           }
         }

       if(isPalindrome==false && (s.empty() && q.empty()))
         {
          cout<<"True or false: "<<isPalindrome<<endl;
          cout<<"Is not a palindrome."<<endl;
         }
       else
         {
           cout<<"Is a palindrome."<<endl;
         }

}
