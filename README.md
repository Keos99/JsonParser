# JsonParser
В репозиторие находится проект среды разработки Intellij IDEA, сборщик проекта Maven.

Для компиляции и упаковки исполняемого fat-jar, находясь в папке проекта, воспользуйтесь коммандой mvn package.
Пример C:\Programs\JsonParser>mvn package

После копиляции исполняемый jar файл (JsonParser-1.0-SNAPSHOT.jar) будет находится в папке target расположенной в папке проекта.
Пример C:\Programs\JsonParser\target

Для работы с программой создайте на диске С: папку json.
Пример C:\json
Для чтения данных создайте текстовый файл injson.txt внутри папки json и скопируйте в него информацию для дальнейшей обработки.

Для запуска программы достаточно двойного щелчка мыши по файлу JsonParser-1.0-SNAPSHOT.jar.
Можно запустить из консоли командой java -jar (путь к файлу)\JsonParser-1.0-SNAPSHOT.jar
Пример java -jar C:\Programs\JsonParser>mvn package\target\JsonParser-1.0-SNAPSHOT.jar

По окончанию работы в папке json (C:\json) создастся файл outjson.txt c обработанными данными.

Если при компиляции выдает ошибку "No compiler is provided in this environment. Perhaps you are running on a JRE rather than a JDK?"
Решение http://roufid.com/no-compiler-is-provided-in-this-environment/
