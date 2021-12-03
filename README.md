# tools-build-executable-file-copy-bug

**NOTE**: This repo was created as part of debugging an [issue](https://github.com/seancorfield/deps-new/issues/22) with `deps-new`. The issue has been resovled. Archiving the repo. 

Execute the app 
```shell
clj -X:run
```

It prints the ouput 

```plain
resources/bin/script executable?: true
Copying folder resources/ to temp/
temp/bin/script executable?: true
```

