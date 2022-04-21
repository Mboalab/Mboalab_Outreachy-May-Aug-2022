---
# 'Typoid Mobile app design.'
---

In this task we are provided with a sample app known as “malaria
screener” and we are supposed to replicate this app to build an app for
typhoid. So, first I am going to break down the app based on the tools
used, then I will talk a bit about the trends and in the last I will
propose the tools I will use to build the app and a suggestion.

Libraries and tools Used to build malaria app:
----------------------------------------------

-   Android studio is used which uses “gradle”, an advanced build
    toolkit, to automate and manage the build process, while allowing
    you to define flexible custom build configurations.

-   Platforms:

    -   Android 9.0 - Pie (API Level 28)

        -   Android SDK Platform 28

        -   This version (28) is used to build the project in its
            current configuration. You can adjust this requirement in
            the build.gradle file.

-   Tools:

    -   Android SDK Tools 26.1.1+

    -   Android SDK Platform-Tools 28.0.0+

    -   Android SDK Build-Tools 27.0.3+

-   For image processing OPENCV android is used.

-   For ml Tensorflow library’s Convolution neural network is used for
    binary classification.

Now, according to a popular site “geekforgeek” java is the number one
choice for mobile app developers.


However, the trends are changing and python is fighting for the top
position when it comes to machine learning. Below I am going to list
down the key comparable features.

Features:
---------

Syntax:
=======

 Java: 
-------

-   It is hard to learn plus lot more lines of code to write.

 Python:
--------

-   Easy to learn and use.

Performance:
============

 Java: 
-------

-   Very fast.

 Python:
--------

-   Slower than Java in some implementation.

Cross Platform:
===============

 Java: 
-------

-   Yes, using JVM.

 Python:
--------

-   Yes.

**Backend Frameworks**:
-----------------------

 Java: 
-------

-   Spring, Blade.

 Python:
--------

-   Django, Flask, Fastapi.

[**Machine Learning Libraries**](https://hackr.io/blog/best-machine-learning-libraries)
---------------------------------------------------------------------------------------

 Java: 
-------

-   Weka, Mallet, Deeplearning4j, MOA.

 Python:
--------

-   Tensorflow, Pytorch.

 
-

My Mobile App Proposal
----------------------

### 1). I will use Kivy and KivyMd: 

Kivy is a Python library that facilitates the creation of cross-platform
applications that can run on Windows, Linux, Android,  OSX, iOS, and
Raspberry pi too. It is a popular package for creating GUI in Python and
KivyMD is built on the top of the Kivy library, it is a collection of
Material Design widgets to be used with Kivy. It offers more
elegant-looking components and the code is almost the same.

### 2). ML model

ML model will be serves as an API using fastapi and the chosen server,
and then calling that API in our KivyMD app.

### 3). Convert the program to an apk to work on android.

However, the final decision of what programming language should be used
will rest with the mentors and I am willing to work with java as well. I
do suggest to allocating one intern to work on java based android app
and other to work on python app and make the decision on the following
criterias

1). calculate the time both the apps take to launch and run as mobile
app users have short attention span.

2). How hard it will be to maintain the app in terms of code complexity.
