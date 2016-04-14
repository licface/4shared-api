1. Get sources from google.code.com:
```
hg clone https://4shared-api.googlecode.com/hg/ 4shared-api
```

2. Go to created folder and build project:
```
ant
```

3. Try to use some of provided examples:
```
cd dist/demo
./signup <username> <password>
./createfolder <username> <password> <foldername>
./upload <username> <password> <path to file>
./browse <login> <password>
```
4. Learn how this demos have been written. All demo sources are situated in demo/com/pmstation/shared/soap/demo

5. Write your own fresh and brilliant application