#!/bin/sh
if [ -z "$1" ]; then 
	echo "Eror No file argument provided." >&2
	exit 1
fi


if [ -e "$1" ]; then 
	echo "$1 exists!"
else
	echo "$1 does not exies!"
fi

