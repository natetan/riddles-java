# Riddler (Java)
## Java Version of [Riddler](https://github.com/yulongtan/riddler.git)

### Standard Format of Riddles
```
Riddle
Answer
```

### Reading the File 
```Java
try {
    Scanner file = new Scanner(new File(FILE));
    int count = 1;
    while (file.hasNextLine()) {
        String riddle = file.nextLine();
        String answer = file.nextLine();
        riddles.add(new Riddle(riddle, answer, count));
        count++;
    }
} catch (IOException e) {
    e.printStackTrace();
}
```