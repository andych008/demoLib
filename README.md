# testLib

- javaLib是生成jar的示例
- droidLib是生成aar的示例
- app引用原始的module
    ```
    implementation project(':droidLib')
    implementation project(':javaLib')
    ```
- app2引用javaLib和droidLib生成的jar及aar
    ```
    implementation 'com.dwvip.demolib:droidLib:1.0'
    implementation 'com.dwvip.demolib:javaLib:0.2.0'
    ```
- wxImg是发布已有aar的示例(使用场景：某第三方公司提供的sdk是一个aar。我们知道，aar不能再打包进我们的aar里发布，所以要单独发布)
