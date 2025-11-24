# APCSA  @copyright 

# 1. Follow the instructions for dev.
1. fork the repo to your account. I will update the repo for problems.


# 2. Local dev. Instructions using git and VS code:
1. Check if you have installed git on your computer

git --version   

if not, proceed to step 2
if yes, proceed to steop 3
2. Install Git:  sudo dnf install git-all
 - if that doesn't work: try
    
    git --version

    your computer may ask you to install git, which will take ~20 GB storage.

    or

    sudo apt install git-all

3. Copy URL of the repo 

Click on the green "Code" button
Click on SSH
Copy the SSH url

4. Use terminal to navigate to a new folder on your computer

e.g. cd Documents
mkdir computerScience
cd computerScience

5. Clone the repo to the local computer folder using the following command

    git clone your_url

6. Navigate to your project using IDE



## 2.1 Git operation: Push changes to git ** 

1. In terminal, go to your folder. Follow the below command exactly.
2. git add .
3. git commit -m "update contents"
4. git push origin main

## 2.2 Don't have ssh-key?

1. ssh-keygen -t rsa -C "you@example.com" 

2. copy the key to your repo add public key   

## 2.3 Preveiw your change locally
1. Save all your changes in IDE

2. Go to your folder on computer ---> Check your project



