#!/bin/bash

exec 3</etc/passwd

while read -u 3 line; do
  echo $line;
  read -p "Please press any key" -n 1;
done
