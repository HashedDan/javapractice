/*
Practice > Interview Preparation Kit > String Manipulation > Strings: Making Anagrams
*/

package main

import (
	"bufio"
	"fmt"
	"io"
	"math"
	"os"
	"strings"
)

// Complete the makeAnagram function below.
func makeAnagram(a string, b string) int32 {
	// Both strings must have the same letters at the same frequency
	aArr := [26]int{}
	bArr := [26]int{}

	for i := 0; i < len(a); i++ {
		aArr[a[i]-'a']++
	}

	for i := 0; i < len(b); i++ {
		bArr[b[i]-'a']++
	}

	fmt.Printf("%v\n", aArr)
	fmt.Printf("%v\n", bArr)

	var count int32 = 0

	for i := 0; i < len(aArr); i++ {
		count += (int32)(math.Abs((float64)(aArr[i] - bArr[i])))
	}

	return count
}

func main() {
	reader := bufio.NewReaderSize(os.Stdin, 1024*1024)

	stdout, err := os.Create(os.Getenv("OUTPUT_PATH"))
	checkError(err)

	defer stdout.Close()

	writer := bufio.NewWriterSize(stdout, 1024*1024)

	a := readLine(reader)

	b := readLine(reader)

	res := makeAnagram(a, b)

	fmt.Fprintf(writer, "%d\n", res)

	writer.Flush()
}

func readLine(reader *bufio.Reader) string {
	str, _, err := reader.ReadLine()
	if err == io.EOF {
		return ""
	}

	return strings.TrimRight(string(str), "\r\n")
}

func checkError(err error) {
	if err != nil {
		panic(err)
	}
}
