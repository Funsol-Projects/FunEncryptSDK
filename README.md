FunEncryptSDK (SDK to encrypt api token)

[![](https://jitpack.io/v/Funsol-Projects/FunEncryptSDK.svg)](https://jitpack.io/#Funsol-Projects/FunEncryptSDK)

FunEncryptSDK is a token encryption library that is used to encrypt API tokens. Developers can easily integrate this dependency in their projects and encrypt their API tokens for better security.

Getting Started

Step 1

Add maven repository in project level build.gradle or in latest project setting.gradle file

    repositories {
        google()
        mavenCentral()
        maven { url "https://jitpack.io" }
    }
 
Step 2

Add FunEncryptSDK dependency in App level build.gradle.

    dependencies {
        implementation 'com.github.Funsol-Projects:FunEncryptSDK:v1.0'
    }

Step 3

Directly just initialize it and it will return you the encrypted token.

    GetEncryptedToken.getToken {
    //this callback will return the encrypted token
    }

License

Copyright (c) [2025]

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.


