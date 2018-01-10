Write-Output "-----------------------------------------";
Write-Output "Build uaa docker file";
Write-Output "-----------------------------------------";
cd uaa;
./mvnw package -Pprod -DskipTests dockerfile:build

Write-Output "-----------------------------------------";
Write-Output "Build catalog docker file";
Write-Output "-----------------------------------------";
cd ../catalog;
./mvnw package -Pprod -DskipTests dockerfile:build

Write-Output "-----------------------------------------";
Write-Output "Build contoso docker file";
Write-Output "-----------------------------------------";
cd ../contoso;
./mvnw package -Pprod -DskipTests dockerfile:build

Write-Output "-----------------------------------------";
Write-Output "Build number docker file";
Write-Output "-----------------------------------------";
cd ../number;
./mvnw package -Pprod -DskipTests dockerfile:build

