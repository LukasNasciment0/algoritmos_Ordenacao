#!/bin/bash

COMENTARIO=$1

git add .
git commit -m $1
git push -u origin master
