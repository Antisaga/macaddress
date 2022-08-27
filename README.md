What is this script about?

Script output return Company Name associated with that MAC address 


script input accept parameter of a MAC address as input format (xx:xx:xx:xx:xx:xx) all hex
output the Company Name associated with that MAC address using https://macaddress.io/ 


How to run the script:

Requirements:
    Linux/MacOS
    java 
    maven
    git (optional to clone the repo: https://github.com/Antisaga/macaddress)

Pre requisits:

    APIKEY in system inv with value at_5XE12Lr24TfIyYJNMxSdr3ZqmO08T
    (APIKEY=at_5XE12Lr24TfIyYJNMxSdr3ZqmO08T)

Option 1
    mvn compile
    mvn exec:java -Dexec.mainClass="hello.MacAddress" -Dexec.args="44:38:39:ff:ef:57"

Option 2

    run.sh  (with pre setup -Dexec.args for MAC Address)
 
Option 3

    git clone https://github.com/Antisaga/macaddress
    cd macaddress/initial
    sudo docker build --no-cache -t my-image:1 -f ./Dockerfile .
    sudo docker run -it --rm my-image:1 /bin/sh
    

    